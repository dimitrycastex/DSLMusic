package org.dimitrycastex.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileManagement
{
    
	//archivo a abrir
    private File archivo;
    //booleano que activa el debug
    private boolean Debug;
    
    public FileManagement()
    {
    	this.Debug = false;
    }
    
    public FileManagement(boolean Debug)
    {
    	this.Debug = Debug;
    }
 
    
    //ejemplo: openArchivoTexto("Archivo X","sql","txt","pdf");
    
    public String openArchivoTexto(String descripcion,String ... extensiones)
    {
    	if(SeleccionArchivoAbrir(descripcion, extensiones))
    	{
    		return(LeerArchivoTexto(archivo));
    	}
    	return(null);
    }
    
    
    //ejemplo: guardarArchivoTexto(texto)
    public void guardarArchivoTexto(String texto,String descripcion, String extension)
    {
    	//filechooser
    	FileNameExtensionFilter filter = new FileNameExtensionFilter(descripcion,extension);
    	JFileChooser fc= new JFileChooser();
    	
    	fc.setFileFilter(filter);
    	fc.setDialogTitle("Guardar "+descripcion+"...");
    	
    	String ruta = "";
    	try
    	{
    		if(fc.showSaveDialog(null)==fc.APPROVE_OPTION)
    		{
    			ruta = fc.getSelectedFile().getAbsolutePath();
    			ruta+="."+extension;
    		}
    	}
    	catch (Exception ex)
    	{
    		ex.printStackTrace();
    	}
    	
    	File f;
    	f = new File(ruta);
    	//Escritura
    	try
    	{
	    	FileWriter w = new FileWriter(f);
	    	BufferedWriter bw = new BufferedWriter(w);
	    	PrintWriter wr = new PrintWriter(bw);	
	    	wr.write(texto);//escribimos en el archivo 
	    	//ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita
	    	//de no hacerlo no se escribirá nada en el archivo
	    	wr.close();
	    	bw.close();
    	}
    	catch(IOException e)
    	{
    		JOptionPane.showMessageDialog(null, "Error de escritura del fichero");
    	}
    }
    
    
    
    //Seleccion de Archivo con JFileChooser
    //true: archivo fue seleccionado por el usuario
    //false: archivo no fue seleccionado por el usuario
    private boolean SeleccionArchivoAbrir(String descripcion,String ... extensiones)
    {
        //construimos el filtro para solo aceptar .txt
        FileNameExtensionFilter filter = new FileNameExtensionFilter(descripcion,extensiones);
        //para seleccionar un archivo
        JFileChooser fc = new JFileChooser();
        //configurando el filtro
        fc.setFileFilter(filter);
        fc.setDialogTitle("Abrir "+descripcion+"...");
        //para seleccionar la opcion
        int sel = fc.showOpenDialog(null);
        if(sel == JFileChooser.APPROVE_OPTION) // aprobar
        {
            if(Debug)
        	{System.out.println("Archivo Leido: "+fc.getSelectedFile().toString()+"\n");}
            archivo = fc.getSelectedFile();
            return(true);
        }
        return(false);
    }
    
    //Seleccion de Archivo con JFileChooser
    //true: archivo fue seleccionado por el usuario
    //false: archivo no fue seleccionado por el usuario
    private boolean SeleccionArchivoGuardar(String descripcion,String ... extensiones)
    {
        //construimos el filtro para solo aceptar .txt
        FileNameExtensionFilter filter = new FileNameExtensionFilter(descripcion,extensiones);
        //para seleccionar un archivo
        JFileChooser fc = new JFileChooser();
        //configurando el filtro
        fc.setFileFilter(filter);
        fc.setDialogTitle("Abrir "+descripcion+"...");
        //para seleccionar la opcion
        int sel = fc.showOpenDialog(null);
        if(sel == JFileChooser.APPROVE_OPTION) // aprobar
        {
            if(Debug)
        	{System.out.println("Archivo Leido: "+fc.getSelectedFile().toString()+"\n");}
            archivo = fc.getSelectedFile();
            return(true);
        }
        return(false);
    }
    

    //retorna un string con el contenido del archivo seleccionado
    private String LeerArchivoTexto(File archivo)
    {
        StringBuffer total = new StringBuffer();
        
        try
            {
            //crea un buffer lector para leer el archivo de texto
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            //se lee la primera linea del texto
            String linea = reader.readLine();
            //mientras haya lineas en el texto
            while (linea != null)
            {
                total.append(linea+"\n");
                linea = reader.readLine(); //lee la siguiente linea
            } 
            reader.close(); // cierra el archivo
            return(total.toString());
            }
        catch (IOException e)
        {
         JOptionPane.showMessageDialog(null, "Error de lectura del fichero");
         return(null);
        }
    }
}
