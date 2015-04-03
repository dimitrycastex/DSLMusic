package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import musica.Escritor;
import musica.Partitura;
import musica.Pentagrama;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.dimitrycastex.util.FileManagement;

import dsl.DSLMusicLexer;
import dsl.DSLMusicParser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Dimension;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Aplicacion extends JFrame {

	private JPanel contentPane;
	private ArrayList <JButton> lista;
	private String presionado;
	private JTextArea textArea;
	private JSpinner spinnerMs;
	//
	private DSLMusicLexer lexer;
	private DSLMusicParser parser;
	//variable donde se guardaran los errores
	private JList<String> list_Errores;
	//modelo para la lista
	private DefaultListModel<String> modeloErrores;
	
	//creamos un pentagrama y una partitura vacía para capturar lo que viene por el DSL
	private Partitura partitura;
	private Pentagrama pentagrama;
	
	//variable flag que verifica errores
	//por defecto viene en true, ya que no tenemos ningun código cargado
	private boolean errores=true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion frame = new Aplicacion();					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Aplicacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Aplicacion.class.getResource("/icono.png")));
		setTitle("DSLMusic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 564);
		lista = new ArrayList<JButton>();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Archivo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 6, 0, 0));
		
		JButton btnArchivoNuevo = new JButton("");
		btnArchivoNuevo.addActionListener(new ActionListener() {
			//limpiar todo
			public void actionPerformed(ActionEvent arg0)
			{
				textArea.setText("UNIDAD="+spinnerMs.getValue().toString()+"MS;\n" +
						"NOTA(LA4,NEGRA);\n"+
						"END");
			}
		});
		btnArchivoNuevo.setIcon(new ImageIcon(Aplicacion.class.getResource("/archivo.jpg")));
		btnArchivoNuevo.setToolTipText("Plantilla en blanco");		
		panel_2.add(btnArchivoNuevo);
		
		JButton btnAbrirArchivo = new JButton("");
		btnAbrirArchivo.addActionListener(new ActionListener() {
			//abrir archivo de texto
			public void actionPerformed(ActionEvent arg0)
			{
				
				FileManagement fm = new FileManagement();
				String t = fm.openArchivoTexto("Archivo...", "music");
				//si no hay texto o se apretó cancelar, no actualizo
				if(t!=null)
				{
					textArea.setText(t);
					analizar();
				}
				
			}
		});
		btnAbrirArchivo.setIcon(new ImageIcon(Aplicacion.class.getResource("/abrir.png")));
		btnAbrirArchivo.setToolTipText("Abrir composici\u00F3n");	
		panel_2.add(btnAbrirArchivo);
		
		JButton btnGuardarArchivo = new JButton("");
		btnGuardarArchivo.addActionListener(new ActionListener() {
			//guardar archivo
			public void actionPerformed(ActionEvent arg0)
			{
				FileManagement fm = new FileManagement();
				fm.guardarArchivoTexto(textArea.getText(),"Archivo de musica .music","music");
			}
		});
		btnGuardarArchivo.setIcon(new ImageIcon(Aplicacion.class.getResource("/guardar.png")));
		btnGuardarArchivo.setToolTipText("Guardar composici\u00F3n");		
		panel_2.add(btnGuardarArchivo);
		
		JButton btnExportarPartitura = new JButton("");
		btnExportarPartitura.addActionListener(new ActionListener() {
			//exportar a pentagrama
			public void actionPerformed(ActionEvent arg0)
			{
				analizar();
				//si es la gramatica de figuras
				if(parser.figuras)
				{
					if(!errores)
					{
						pentagrama = parser.pentagrama;
						pentagrama.start();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Existen errores en su código, por lo que no se puede mostrar el pentagrama asociado.");
					}
				}
				else //si no es la gramatica de figuras
				{
					JOptionPane.showMessageDialog(null, "Ésta gramática no puede ser visualizada como un pentagrama");
				}
			}
		});
		btnExportarPartitura.setIcon(new ImageIcon(Aplicacion.class.getResource("/export.jpg")));
		btnExportarPartitura.setToolTipText("Exportar composici\u00F3n a partitura");		
		panel_2.add(btnExportarPartitura);
		
		JButton btnDetenerReproduccion = new JButton("");
		btnDetenerReproduccion.addActionListener(new ActionListener() {
			//stop
			public void actionPerformed(ActionEvent arg0)
			{
				partitura.parar();
			}
		});
		btnDetenerReproduccion.setIcon(new ImageIcon(Aplicacion.class.getResource("/stop.jpg")));
		btnDetenerReproduccion.setToolTipText("Detener reproducci\u00F3n");		
		panel_2.add(btnDetenerReproduccion);
		
		JButton btnReproducir = new JButton("");
		btnReproducir.addActionListener(new ActionListener() {
			//play music
			public void actionPerformed(ActionEvent arg0)
			{
				//play music!
				analizar();
				if(partitura!=null)
				{
					partitura.parar();
				}
				
				if(!errores)
				{
					partitura = parser.partitura;
					partitura.start();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Existen errores en su código, por lo que no se puede reproducir el audio");
				}
			}
		});
		btnReproducir.setIcon(new ImageIcon(Aplicacion.class.getResource("/play.png")));
		btnReproducir.setToolTipText("Reproducir");		
		panel_2.add(btnReproducir);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Controles", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel labelMs = new JLabel("");
		labelMs.setIcon(new ImageIcon(Aplicacion.class.getResource("/redonda.jpg")));
		labelMs.setToolTipText("Definir tempo en milisengundos");
		labelMs.setHorizontalAlignment(SwingConstants.CENTER);		
		panel_3.add(labelMs);
		
		spinnerMs = new JSpinner();
		spinnerMs.setValue(1000);
		panel_3.add(spinnerMs);
		
		JLabel labelOctava = new JLabel("");
		labelOctava.setIcon(new ImageIcon(Aplicacion.class.getResource("/OCTAVA.png")));
		labelOctava.setToolTipText("Definir la octava");
		labelOctava.setHorizontalAlignment(SwingConstants.CENTER);		
		panel_3.add(labelOctava);
		
		final JSpinner spinnerOctava = new JSpinner();
		spinnerOctava.setValue(4);
		panel_3.add(spinnerOctava);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);		
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "Errores:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.setPreferredSize(new Dimension(10, 80));
		panel_10.setMinimumSize(new Dimension(10, 100));
		panel_4.add(panel_10, BorderLayout.SOUTH);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(2, 60));
		scrollPane_1.setSize(new Dimension(0, 20));
		panel_10.add(scrollPane_1, BorderLayout.NORTH);
		
		list_Errores = new JList();
		scrollPane_1.setViewportView(list_Errores);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_4.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0)
			{
				analizar();
			}
		});
		scrollPane.setViewportView(textArea);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel PianoVirtual = new JPanel();
		final panelPiano piano = new panelPiano();
		//PianoVirtual.add(piano);
		PianoVirtual.setBorder(new TitledBorder(null, "Piano Virtual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.add(piano);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Figuras Musicales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "A\u00F1adir a editor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_7.add(panel_8, BorderLayout.SOUTH);
		
		JButton agregar = new JButton("Agregar Nota");
		panel_8.add(agregar);
		
		JPanel panel_9 = new JPanel();
		panel_7.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(0, 6, 0, 0));
		
		final JButton btnRedonda = new JButton("");
		btnRedonda.setIcon(new ImageIcon(Aplicacion.class.getResource("/redonda.png")));
		btnRedonda.setToolTipText("Redonda: tiempo igual a 1");
		btnRedonda.setName("redonda");
		lista.add(btnRedonda);
		btnRedonda.setEnabled(false);
		presionado = btnRedonda.getName();
		panel_9.add(btnRedonda);
		
		final JButton btnBlanca = new JButton("");
		btnBlanca.setIcon(new ImageIcon(Aplicacion.class.getResource("/blanca.png")));
		btnBlanca.setToolTipText("Blanca: tiempo igual a 1/2");
		btnBlanca.setName("blanca");
		lista.add(btnBlanca);
		panel_9.add(btnBlanca);
		
		final JButton btnNegra = new JButton("");
		btnNegra.setIcon(new ImageIcon(Aplicacion.class.getResource("/negra.png")));
		btnNegra.setToolTipText("Negra: tiempo igual a 1/4");
		btnNegra.setName("negra");
		lista.add(btnNegra);
		panel_9.add(btnNegra);
		
		final JButton btnCorchea = new JButton("");
		btnCorchea.setIcon(new ImageIcon(Aplicacion.class.getResource("/corchea.png")));
		btnCorchea.setToolTipText("Corchea: tiempo igual a 1/8");
		btnCorchea.setName("corchea");
		lista.add(btnCorchea);
		panel_9.add(btnCorchea);
		
		final JButton btnSemicorchea = new JButton("");
		btnSemicorchea.setIcon(new ImageIcon(Aplicacion.class.getResource("/semicorchea.png")));
		btnSemicorchea.setToolTipText("Semicorchea: tiempo igual a 1/16");
		btnSemicorchea.setName("semicorchea");
		lista.add(btnSemicorchea);
		panel_9.add(btnSemicorchea);
		
		final JButton btnFusa = new JButton("");
		btnFusa.setIcon(new ImageIcon(Aplicacion.class.getResource("/fusa.png")));
		btnFusa.setToolTipText("Fusa: tiempo igual a 1/32");
		btnFusa.setName("fusa");
		lista.add(btnFusa);
		panel_9.add(btnFusa);
		
		final JButton btnRedondaS = new JButton("");
		btnRedondaS.setIcon(new ImageIcon(Aplicacion.class.getResource("/redondaS.png")));
		btnRedondaS.setToolTipText("Silencio de redonda");
		btnRedondaS.setName("redondaS");
		lista.add(btnRedondaS);
		panel_9.add(btnRedondaS);
		
		final JButton btnBlancaS = new JButton("");
		btnBlancaS.setIcon(new ImageIcon(Aplicacion.class.getResource("/blancaS.png")));
		btnBlancaS.setToolTipText("Silencio de blanca");
		btnBlancaS.setName("blancaS");
		lista.add(btnBlancaS);
		panel_9.add(btnBlancaS);
		
		final JButton btnNegraS = new JButton("");
		btnNegraS.setIcon(new ImageIcon(Aplicacion.class.getResource("/negraS.png")));
		btnNegraS.setToolTipText("Silencio de negra");
		btnNegraS.setName("negraS");
		lista.add(btnNegraS);
		panel_9.add(btnNegraS);
		
		final JButton btnCorcheaS = new JButton("");
		btnCorcheaS.setIcon(new ImageIcon(Aplicacion.class.getResource("/corcheaS.png")));
		btnCorcheaS.setToolTipText("silencio de corchea");
		btnCorcheaS.setName("corcheaS");
		lista.add(btnCorcheaS);
		panel_9.add(btnCorcheaS);
		
		final JButton btnSemicorcheaS = new JButton("");
		btnSemicorcheaS.setIcon(new ImageIcon(Aplicacion.class.getResource("/semicorcheaS.png")));
		btnSemicorcheaS.setToolTipText("Silencio de semicorchea");
		btnSemicorcheaS.setName("semicorcheaS");
		lista.add(btnSemicorcheaS);
		panel_9.add(btnSemicorcheaS);
		
		final JButton btnFusaS = new JButton("");
		btnFusaS.setIcon(new ImageIcon(Aplicacion.class.getResource("/fusaS.png")));
		btnFusaS.setToolTipText("Silencio de fusa");
		btnFusaS.setName("fusaS");
		lista.add(btnFusaS);
		panel_9.add(btnFusaS);
				
		
		spinnerOctava.addChangeListener(new ChangeListener(){
			@Override
	        public void stateChanged(ChangeEvent e) {
	           Object objeto = spinnerOctava.getValue();
	           int i = Integer.parseInt(objeto.toString());
	           piano.octava=i;
	        }
		});
		
		spinnerMs.addChangeListener(new ChangeListener(){
			@Override
			//spinner cambia de estado
	        public void stateChanged(ChangeEvent e) {
	           Object objeto = spinnerMs.getValue();
	           int i = Integer.parseInt(objeto.toString());
	           piano.duracion=i;
	           //actualizacion del valor en el textArea
	           String texto = textArea.getText();
	           int indice_igual;
	           int indice_M;
	           //capturo la posición del texto
	           //si este no está
	           if(texto.indexOf("UNIDAD=")==-1)
	           {
	        	   textArea.setText("UNIDAD=" + spinnerMs.getValue().toString() + "MS;\n" + texto);
	           }
	           else // si está
	           {
	        	   indice_igual = texto.indexOf("UNIDAD=");
	        	   if(texto.indexOf("M")==-1)//si no hay un M
	        	   {
	        		   if(texto.indexOf("\n")!=-1)//si existe un salto de linea
	        		   {
	        			   indice_M = texto.indexOf("\n");//por salto y linea
	        		   }
	        		   else //si no existe
	        		   {
	        			   indice_M = texto.length();
	        		   }
	        	   }
	        	   else
	        	   {
		        	   indice_M = texto.indexOf("M");
	        	   }
	        	   
	        	   //agrega las posiciones, correspondientes a la longitud de UNIDAD=
	        	   indice_igual+="UNIDAD=".length();
	        	   texto = texto.substring(0,indice_igual) + spinnerMs.getValue().toString() + texto.substring(indice_M);
	        	   textArea.setText(texto);
	           }
	           
	        }
		});
		
		btnRedonda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnRedonda);
			}
		});
		
		btnBlanca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnBlanca);
			}
		});
		
		btnNegra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnNegra);
			}
		});
		
		btnCorchea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnCorchea);
			}
		});
		
		btnSemicorchea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnSemicorchea);
			}
		});
		
		btnFusa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnFusa);
			}
		});
		
		btnRedondaS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnRedondaS);
			}
		});
		
		btnBlancaS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnBlancaS);
			}
		});
		
		btnNegraS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnNegraS);
			}
		});
		
		btnCorcheaS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnCorcheaS);
			}
		});
		
		btnSemicorcheaS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnSemicorcheaS);
			}
		});

		btnFusaS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				figurasMusicales(lista,btnFusaS);
			}
		});
		
		agregar.addMouseListener(new MouseAdapter() {
			@Override
			//boton agregar nota
			public void mouseClicked(MouseEvent e)
			{
				Escritor escritor = new Escritor();
				String s = presionado;
				//si el boton es un silencio
				if(presionado.endsWith("S"))
				{
					//pasamos a mayuscula y quitamos la S
					s = s.substring(0,s.length()-1).toUpperCase();
					textArea.append(escritor.addSilencio(s)+"\n");
				}
				else //si no lo es
				{
					s = s.toUpperCase();
					textArea.append(escritor.addNota(piano.nota, piano.octava, s)+"\n");
				}
				
			}
		});
		//setea al principio este texto
		textArea.setText("UNIDAD="+spinnerMs.getValue().toString()+"MS;\n" +
				"NOTA(LA4,NEGRA);\n"+
				"END");
		//analizo por primera vez
		analizar();
	}
	
	public void figurasMusicales(ArrayList<JButton> list, JButton boton){
		boton.setEnabled(false);
		presionado = boton.getName();
		
		
		
		for(int i=0; i<list.size(); i++){			
			if(list.get(i).getName()!=boton.getName()){				
				list.get(i).setEnabled(true);
			}
		}
	}
	
	public void analizar()
	{
		modeloErrores = new DefaultListModel<String>();
		modeloErrores.removeAllElements();
		list_Errores.setModel(modeloErrores);
		
		try
		{
			String entrada = textArea.getText();
			ANTLRStringStream input = new ANTLRStringStream(entrada);
			lexer = new DSLMusicLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        parser = new DSLMusicParser(tokens);        
	        
	        parser.start();
	        
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//para mostrar los errores en la lista
		Iterator<String> itl = lexer.erroneos.iterator();
		while(itl.hasNext())
		{
			modeloErrores.addElement(itl.next());
		}
		
		Iterator<String> itp = parser.erroneos.iterator();
		while(itp.hasNext())
		{
			modeloErrores.addElement(itp.next());
		}
		
		//asignar los modelos a las listas
		list_Errores.setModel(modeloErrores);
		
		//si existe un error, la variable flag lo notifica
		errores = !modeloErrores.isEmpty(); 
	}
}
