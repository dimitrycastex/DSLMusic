package musica;

import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

//El contenedor de notas será el que reproduce todas las notas, por eso extende de thread
public class Partitura extends Thread
{
	//arreglo ue contendrá las notas
	private ArrayList<Nota> arregloNotas;
	//iterador para recorrer arreglo
	private Iterator<Nota> it;
	//numero para ms
	double ms=1000;
	//linea de audio
	SourceDataLine line;
	
	
	//partitura para gramaticas de figuras
	//se toma en cuenta el valor milisec solo cuando hay gramatica de figuras, en el caso
	//de las gramaticas fijas no se toma en cuenta, pero se agrega un valor pro defecto para simplificar la gramática
	public Partitura()
	{
		//inicio el arreglo de notas
		arregloNotas = new ArrayList<Nota>();
	}
	//para setear los milisegundos luego de crear el objeto
	public void setMilisegundos(double milisec)
	{
		ms = milisec;
	}
	
	//=== PARTITURA PARA GRAMÁTICAS DE FIGURAS ===
	public void addNota(String nota, String octava, String duracion)
	{
		addNota(TraductorInterno.StringToFrecuency(nota, octava),TraductorInterno.StringToDuration(duracion, ms));
	}
	
	public void addSilencio(String duracion)
	{
		addSilencio(TraductorInterno.StringToDuration(duracion, ms));
	}
	
	//=== PARTITURA PARA GRAMÁTICAS DE FRECUENCIAS ===
	//agrega una nota a la partitura
	public void addNota(double frecuencia,double duracion)
	{
		Nota n = new Nota(frecuencia,duracion);
		arregloNotas.add(n);
	}
	
	//agrega un silencio a la partitura
	public void addSilencio(double duracion)
	{
		Nota n = new Nota(0,duracion);
		arregloNotas.add(n);
	}
	
	public void run()
	{
		//linea para lanzar audio
		line = null;
		//Abre el dispositivo de salida
		try
		{
			//asigno el audioformat
			AudioFormat af = new AudioFormat(22000, 8, 1, true, true);
			//asigno al sistema de audio el audioformat
			line = AudioSystem.getSourceDataLine(af);
			//asigno el iterador
			it = arregloNotas.iterator();
			//abro la linea de audio
			line.open(af, 22000);
			//empiezo a lanzar las muestras
			line.start();
			//mientras hayan notas
			while(it.hasNext())
			{
				//recorro el arreglo para reproducir notas
				Nota notaActual = it.next();
				//Vuelca la señal
				line.write(notaActual.b, 0, notaActual.b.length);
			}
			//Finaliza a que se emita todo el sonido
			line.drain();
			//Cierra la linea
			line.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void parar()
	{
		line.close();
		this.interrupt();
	}

}
