package musica;

import gui.PentagramaGrafico;

import java.util.ArrayList;
import java.util.Iterator;

public class Pentagrama
{
		int contador=0;
		//arreglo que contendrá las notas
		//importante agregar un espacio despues del \n
		String pentagramaTotal="X:0\nL:1/32\n ";

		public void addNota(String nota,String octava,String duracion)
		{
			pentagramaTotal+=TraductorInterno.NotaToABC(nota, octava, duracion)+" ";
		}
		
		public void addSilencio(String duracion)
		{
			pentagramaTotal+=TraductorInterno.SilencioToABC(duracion)+" ";
		}
		
		public void start()
		{
			PentagramaGrafico p = new PentagramaGrafico(pentagramaTotal);
			p.setVisible(true);
		}

}
