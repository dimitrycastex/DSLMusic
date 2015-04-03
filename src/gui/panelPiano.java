package gui;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

import musica.Partitura;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class panelPiano extends JPanel
{

	public double duracion=1000;
	public int octava=4;
	boolean estaSonando=false;
	public String nota;

	
	//divisor dependiendo de la figura/tiempo seleccionada
	int REDONDA=1;
	int BLANCA=2;
	int NEGRA=4;
	int CORCHEA=8;
	int SEMICORCHEA=16;
	int FUSA=32;
	private JPanel panelDO;
	private JPanel panelDOS;
	private JPanel panelRE;
	private JPanel panelRES;
	private JPanel panelMI;
	private JPanel panelFA;
	private JPanel panelFAS;
	private JPanel panelSOL;
	private JPanel panelSOLS;
	private JPanel panelLA;
	private JPanel panelLAS;
	private JPanel panelSI;
	/**
	 * Create the panel.
	 */
	public panelPiano()
	{
		setBorder(new TitledBorder(null, "Piano Virtual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(1, 0, 0, 0));		
		JPanel panelContenedorPiano = new JPanel();
		add(panelContenedorPiano);
		GridBagLayout gbl_panelContenedorPiano = new GridBagLayout();
		gbl_panelContenedorPiano.columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelContenedorPiano.rowHeights = new int[]{0, 0, 0};
		gbl_panelContenedorPiano.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gbl_panelContenedorPiano.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		panelContenedorPiano.setLayout(gbl_panelContenedorPiano);
		
		panelDO = new JPanel();
		panelDO.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{			
				playNota(1);
				seleccionarNota("DO");
			}
		});
		panelDO.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDO.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelDO = new GridBagConstraints();
		gbc_panelDO.insets = new Insets(0, 2, 5, 5);
		gbc_panelDO.gridwidth = 2;
		gbc_panelDO.fill = GridBagConstraints.BOTH;
		gbc_panelDO.gridx = 0;
		gbc_panelDO.gridy = 0;
		panelContenedorPiano.add(panelDO, gbc_panelDO);
		panelDO.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDo = new JLabel("DO");
		lblDo.setHorizontalAlignment(SwingConstants.CENTER);
		panelDO.add(lblDo, BorderLayout.NORTH);
		
		panelRE = new JPanel();
		panelRE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				playNota(3);
				seleccionarNota("RE");
			}
		});
		panelRE.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelRE.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelRE = new GridBagConstraints();
		gbc_panelRE.gridwidth = 2;
		gbc_panelRE.insets = new Insets(0, 2, 5, 5);
		gbc_panelRE.fill = GridBagConstraints.BOTH;
		gbc_panelRE.gridx = 2;
		gbc_panelRE.gridy = 0;
		panelContenedorPiano.add(panelRE, gbc_panelRE);
		panelRE.setLayout(new BorderLayout(0, 0));
		
		JLabel lblRe = new JLabel("RE");
		lblRe.setHorizontalAlignment(SwingConstants.CENTER);
		panelRE.add(lblRe, BorderLayout.NORTH);
		
		panelMI = new JPanel();
		panelMI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(5);
				seleccionarNota("MI");
			}
		});
		panelMI.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMI.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelMI = new GridBagConstraints();
		gbc_panelMI.gridwidth = 2;
		gbc_panelMI.insets = new Insets(0, 2, 5, 5);
		gbc_panelMI.fill = GridBagConstraints.BOTH;
		gbc_panelMI.gridx = 4;
		gbc_panelMI.gridy = 0;
		panelContenedorPiano.add(panelMI, gbc_panelMI);
		panelMI.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMi = new JLabel("MI");
		lblMi.setHorizontalAlignment(SwingConstants.CENTER);
		panelMI.add(lblMi, BorderLayout.NORTH);
		
		panelFA = new JPanel();
		panelFA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(6);
				seleccionarNota("FA");
			}
		});
		panelFA.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFA.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelFA = new GridBagConstraints();
		gbc_panelFA.gridwidth = 2;
		gbc_panelFA.insets = new Insets(0, 0, 5, 5);
		gbc_panelFA.fill = GridBagConstraints.BOTH;
		gbc_panelFA.gridx = 6;
		gbc_panelFA.gridy = 0;
		panelContenedorPiano.add(panelFA, gbc_panelFA);
		panelFA.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFa = new JLabel("FA");
		lblFa.setHorizontalAlignment(SwingConstants.CENTER);
		panelFA.add(lblFa, BorderLayout.NORTH);
		
		panelSOL = new JPanel();
		panelSOL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(8);
				seleccionarNota("SOL");
			}
		});
		panelSOL.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSOL.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelSOL = new GridBagConstraints();
		gbc_panelSOL.gridwidth = 2;
		gbc_panelSOL.insets = new Insets(0, 0, 5, 5);
		gbc_panelSOL.fill = GridBagConstraints.BOTH;
		gbc_panelSOL.gridx = 8;
		gbc_panelSOL.gridy = 0;
		panelContenedorPiano.add(panelSOL, gbc_panelSOL);
		panelSOL.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSol = new JLabel("SOL");
		lblSol.setHorizontalAlignment(SwingConstants.CENTER);
		panelSOL.add(lblSol, BorderLayout.NORTH);
		
		panelLA = new JPanel();
		panelLA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(10);
				seleccionarNota("LA");
			}
		});
		panelLA.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelLA.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelLA = new GridBagConstraints();
		gbc_panelLA.gridwidth = 2;
		gbc_panelLA.insets = new Insets(0, 0, 5, 5);
		gbc_panelLA.fill = GridBagConstraints.BOTH;
		gbc_panelLA.gridx = 10;
		gbc_panelLA.gridy = 0;
		panelContenedorPiano.add(panelLA, gbc_panelLA);
		panelLA.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLa = new JLabel("LA");
		lblLa.setHorizontalAlignment(SwingConstants.CENTER);
		panelLA.add(lblLa, BorderLayout.NORTH);
		
		panelSI = new JPanel();
		panelSI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(12);
				seleccionarNota("SI");
			}
		});
		panelSI.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSI.setBackground(Color.WHITE);
		GridBagConstraints gbc_panelSI = new GridBagConstraints();
		gbc_panelSI.gridwidth = 2;
		gbc_panelSI.insets = new Insets(0, 0, 5, 0);
		gbc_panelSI.fill = GridBagConstraints.BOTH;
		gbc_panelSI.gridx = 12;
		gbc_panelSI.gridy = 0;
		panelContenedorPiano.add(panelSI, gbc_panelSI);
		panelSI.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSi = new JLabel("SI");
		lblSi.setHorizontalAlignment(SwingConstants.CENTER);
		panelSI.add(lblSi, BorderLayout.NORTH);
		
		panelDOS = new JPanel();
		panelDOS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				playNota(2);
				seleccionarNota("DOS");
			}
		});
		panelDOS.setBackground(Color.BLACK);
		GridBagConstraints gbc_panelDOS = new GridBagConstraints();
		gbc_panelDOS.gridwidth = 2;
		gbc_panelDOS.insets = new Insets(0, 0, 0, 5);
		gbc_panelDOS.fill = GridBagConstraints.BOTH;
		gbc_panelDOS.gridx = 1;
		gbc_panelDOS.gridy = 1;
		panelContenedorPiano.add(panelDOS, gbc_panelDOS);
		panelDOS.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDo_1 = new JLabel("DO#");
		lblDo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDo_1.setForeground(Color.WHITE);
		panelDOS.add(lblDo_1, BorderLayout.NORTH);
		
		panelRES = new JPanel();
		panelRES.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(4);
				seleccionarNota("RES");
			}
		});
		panelRES.setBackground(Color.BLACK);
		GridBagConstraints gbc_panelRES = new GridBagConstraints();
		gbc_panelRES.gridwidth = 2;
		gbc_panelRES.insets = new Insets(0, 0, 0, 5);
		gbc_panelRES.fill = GridBagConstraints.BOTH;
		gbc_panelRES.gridx = 3;
		gbc_panelRES.gridy = 1;
		panelContenedorPiano.add(panelRES, gbc_panelRES);
		panelRES.setLayout(new BorderLayout(0, 0));
		
		JLabel lblRe_1 = new JLabel("RE#");
		lblRe_1.setForeground(Color.WHITE);
		lblRe_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelRES.add(lblRe_1, BorderLayout.NORTH);
		
		panelFAS = new JPanel();
		panelFAS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(7);
				seleccionarNota("FAS");
			}
		});
		panelFAS.setBackground(Color.BLACK);
		GridBagConstraints gbc_panelFAS = new GridBagConstraints();
		gbc_panelFAS.gridwidth = 2;
		gbc_panelFAS.insets = new Insets(0, 0, 0, 5);
		gbc_panelFAS.fill = GridBagConstraints.BOTH;
		gbc_panelFAS.gridx = 7;
		gbc_panelFAS.gridy = 1;
		panelContenedorPiano.add(panelFAS, gbc_panelFAS);
		panelFAS.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFa_1 = new JLabel("FA#");
		lblFa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFa_1.setForeground(Color.WHITE);
		panelFAS.add(lblFa_1, BorderLayout.NORTH);
		
		panelSOLS = new JPanel();
		panelSOLS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(9);
				seleccionarNota("SOLS");
			}
		});
		panelSOLS.setBackground(Color.BLACK);
		GridBagConstraints gbc_panelSOLS = new GridBagConstraints();
		gbc_panelSOLS.gridwidth = 2;
		gbc_panelSOLS.insets = new Insets(0, 0, 0, 5);
		gbc_panelSOLS.fill = GridBagConstraints.BOTH;
		gbc_panelSOLS.gridx = 9;
		gbc_panelSOLS.gridy = 1;
		panelContenedorPiano.add(panelSOLS, gbc_panelSOLS);
		panelSOLS.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSol_1 = new JLabel("SOL#");
		lblSol_1.setForeground(Color.WHITE);
		lblSol_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelSOLS.add(lblSol_1, BorderLayout.NORTH);
		
		panelLAS = new JPanel();
		panelLAS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				playNota(11);
				seleccionarNota("LAS");
			}
		});
		panelLAS.setBackground(Color.BLACK);
		GridBagConstraints gbc_panelLAS = new GridBagConstraints();
		gbc_panelLAS.gridwidth = 2;
		gbc_panelLAS.insets = new Insets(0, 0, 0, 5);
		gbc_panelLAS.fill = GridBagConstraints.BOTH;
		gbc_panelLAS.gridx = 11;
		gbc_panelLAS.gridy = 1;
		panelContenedorPiano.add(panelLAS, gbc_panelLAS);
		panelLAS.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLa_1 = new JLabel("LA#");
		lblLa_1.setForeground(Color.WHITE);
		lblLa_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelLAS.add(lblLa_1, BorderLayout.NORTH);
		
		//dejar LA seleccionado por defecto
		seleccionarNota("LA");

	}

	public void setValoresPiano(double duracion_en_milisegundos,String figura,int octava)
	{
		this.duracion = duracion_en_milisegundos;
		this.octava = octava;
		
		switch(figura)
		{
			case "REDONDA": this.duracion/=REDONDA;break;
			case "BLANCA": this.duracion/=BLANCA;break;
			case "NEGRA": this.duracion/=NEGRA;break;
			case "CORCHEA": this.duracion/=CORCHEA;break;
			case "SEMICORCHEA": this.duracion/=SEMICORCHEA;break;
			case "FUSA": this.duracion/=FUSA;break;
		}
	}
	
	protected void seleccionarNota(String nota)
	{
		this.nota=nota;
		switch(nota)
		{
			case   "DO": limpiarSeleccion();panelDO.setBackground(Color.RED);break;
			case  "DOS": limpiarSeleccion();panelDOS.setBackground(Color.RED);break;
			case   "RE": limpiarSeleccion();panelRE.setBackground(Color.RED);break;
			case  "RES": limpiarSeleccion();panelRES.setBackground(Color.RED);break;
			case   "MI": limpiarSeleccion();panelMI.setBackground(Color.RED);break;
			case   "FA": limpiarSeleccion();panelFA.setBackground(Color.RED);break;
			case  "FAS": limpiarSeleccion();panelFAS.setBackground(Color.RED);break;
			case  "SOL": limpiarSeleccion();panelSOL.setBackground(Color.RED);break;
			case "SOLS": limpiarSeleccion();panelSOLS.setBackground(Color.RED);break;
			case   "LA": limpiarSeleccion();panelLA.setBackground(Color.RED);break;
			case  "LAS": limpiarSeleccion();panelLAS.setBackground(Color.RED);break;
			case   "SI": limpiarSeleccion();panelSI.setBackground(Color.RED);break;
		}
		
		

		
	}
	
	protected void limpiarSeleccion()
	{
		panelDO.setBackground(Color.WHITE);
		panelDOS.setBackground(Color.BLACK);
		panelRE.setBackground(Color.WHITE);
		panelRES.setBackground(Color.BLACK);
		panelMI.setBackground(Color.WHITE);
		panelFA.setBackground(Color.WHITE);
		panelFAS.setBackground(Color.BLACK);
		panelSOL.setBackground(Color.WHITE);
		panelSOLS.setBackground(Color.BLACK);
		panelLA.setBackground(Color.WHITE);
		panelLAS.setBackground(Color.BLACK);
		panelSI.setBackground(Color.WHITE);
	}
	

	
	protected void playNota(int nota)
	{
		double frecuencia;
		//transformar frecuencia
		frecuencia = 440 *  Math.pow(1.059463, (octava-4)*12+(nota-10));
		
		System.out.println(frecuencia+"\n");
		//si no está sonando
		if(estaSonando==false)
		{
			//hacerla sonar
			estaSonando = true;
			Partitura p = new Partitura();
			p.addNota(frecuencia, duracion);
			p.start();
			estaSonando=false;
		}
		
		
	}
}
