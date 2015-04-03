package musica;

public class Nota
{
	
	double frecuencia = 440;
	double duracion = 22000;
	//arreglo que crea la onda a reproducir
	byte b[];
	
	public Nota(double frec,double dur)
	{
		//para calcular la frecuencia, necesito la nota y la octava
		frecuencia = frec;
		duracion = dur*22;
		b=new byte[(int)duracion]; //Buffer
		
		for (int n=0;n < b .length;n++)
		{ 
			//22000 es la frecuencia de muestreo del sonido
			//127 es la amplitud máxima de un byte [-127,127]. Obviamos el 128 para hacerlo más fácil
			b[n]=(byte)(Math.sin(frecuencia*n*Math.PI*2/22000)*127);
		}
	}
}
