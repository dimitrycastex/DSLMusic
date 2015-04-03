package gui;

import musica.*;

public class TestMelodia
{

	public static void main(String[] args)
	{
//		//se crea una partitura que contenga las notas
//		Partitura partitura = new Partitura(1000);
//		//se agrega una nota a la partitura con la frecuencia y la duración
//		//partitura.addNota(440,1000);
//		//tambien se pueden agregar silencios directamente
//		//partitura.addSilencio(500);
//		//y asi...
//		partitura.addNota("DO", "4", "BLANCA");
//		partitura.addNota("FA", "4", "BLANCA");
//		
//		partitura.addNota("LA", "4", "REDONDA");
//		
//		partitura.addNota("DO", "5", "NEGRA");
//		partitura.addNota("MI", "5", "NEGRA");
//		partitura.addNota("FA", "5", "NEGRA");
//		partitura.addNota("LA", "5", "SEMICORCHEA");
//		
//			
//		//finalmente, para que suene todo se debe startear la partitura (se le pone start para que heche a correr el hilo paralelo)
//		partitura.start();
//		
//		//para  crear el pentagrama y mostrarlo
//		Pentagrama pentagrama = new Pentagrama();
//		
//		pentagrama.addNota("MI", "4", "BLANCA");
//		pentagrama.addNota("LA", "4", "NEGRA");
//		pentagrama.addNota("LA", "3", "NEGRA");
//		pentagrama.addNota("LA", "3", "NEGRA");
//		pentagrama.addNota("LA", "2", "NEGRA");
//		pentagrama.addNota("LA", "2", "NEGRA");
//		pentagrama.addNota("SOL", "1", "REDONDA");
//		pentagrama.addNota("SI", "0", "FUSA");
//		pentagrama.addNota("LA", "3", "FUSA");
//		pentagrama.addNota("SOL", "3", "CORCHEA");
//		pentagrama.addNota("FA", "3", "CORCHEA");
//		pentagrama.addNota("RE", "5", "SEMICORCHEA");
//		pentagrama.addNota("DO", "6", "SEMICORCHEA");
//		pentagrama.addNota("LA", "-1", "FUSA");
//		pentagrama.addSilencio("REDONDA");
//		pentagrama.addSilencio("BLANCA");
//		pentagrama.addSilencio("NEGRA");
//		pentagrama.addSilencio("CORCHEA");
//		pentagrama.addSilencio("SEMICORCHEA");
//		pentagrama.addSilencio("FUSA");
//		pentagrama.start();
		
		Partitura p = new Partitura();
		p.addNota(400, 100);
		p.addSilencio(100);
		p.addNota(400, 100);
		p.addSilencio(100);
		p.addNota(400, 100);
		p.addSilencio(100);
		p.addNota(400, 100);
		p.addSilencio(100);
		p.addNota(400, 100);
		p.addSilencio(100);
		p.addNota(400, 100);
		p.addSilencio(100);
		p.start();
		
	}

}
