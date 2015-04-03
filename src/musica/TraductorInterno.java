package musica;

import java.util.Locale;

//formula: frecuencia = 440 *  Math.pow(1.059463, (octava-4)*12+(nota-10));

public class TraductorInterno
{
	
	public static double StringToFrecuency(String nota,String octava)
	{
		//parseo a double los valores que recibo
		double n=0;
		double o;
		
		switch(nota)
		{
			case   "DO": n=1;break;
			case  "DOS": n=2;break;
			case   "RE": n=3;break;
			case  "RES": n=4;break;
			case   "MI": n=5;break;
			case   "FA": n=6;break;
			case  "FAS": n=7;break;
			case  "SOL": n=8;break;
			case "SOLS": n=9;break;
			case   "LA": n=10;break;
			case  "LAS": n=11;break;
			case   "SI": n=12;break;
		}
		
		o = Double.parseDouble(octava);
		
		//los ingreso a la formula y lo retorno
		return(440 *  Math.pow(1.059463, (o-4)*12+(n-10)));	
	}
	
	public static double StringToDuration(String duracion,double milisegundos)
	{
		int division=1;
		//duracion en milisegundos
		switch(duracion)
		{
			case     "REDONDA":division=1;break;
			case      "BLANCA":division=2;break;
			case       "NEGRA":division=4;break;
			case     "CORCHEA":division=8;break;
			case "SEMICORCHEA":division=16;break;
			case        "FUSA":division=32;break;
		}
		//divido los milisegundos
		return(milisegundos/division);
		
		
	}
	
	public static String NotaToABC(String nota,String octava,String duracion)
	{
		String ABC="";
		//primero, dependiendo de la nota elegiremos la letra en mayuscula
		switch(nota)
		{
			case   "DO": ABC+="C";break;
			case  "DOS": ABC+="^C";break;
			case   "RE": ABC+="D";break;
			case  "RES": ABC+="^D";break;
			case   "MI": ABC+="E";break;
			case   "FA": ABC+="F";break;
			case  "FAS": ABC+="^F";break;
			case  "SOL": ABC+="G";break;
			case "SOLS": ABC+="^G";break;
			case   "LA": ABC+="A";break;
			case  "LAS": ABC+="^A";break;
			case   "SI": ABC+="B";break;
		}
		
		//luego, dependiendo de la octava, la letra se pasará a minuscula o bien, se le agregarán ' o ,
		int o = Integer.parseInt(octava);
		
		
		
		/* octava < 2 = mayuscula ,
		 * octava   2 = mayuscula
		 * octava   3 = minuscula
		 * octava > 3 = minuscula '
		 */
		
		//en estos dos bloques, ya se está en mayuscula
			if(o < 2) 
			{
				//ajustes para agregar la cantidad deseada de comas
				int a=(o-2)*-1;
				
				for(int i=0;i<a;i++)
				{
					ABC = ABC.concat(",");
				}
			}
			else
		//no se necesita o==2, ya que es por defecto una letra mayuscula, que ya está puesta
		//acá se necesita pasar a minusculas
			if(o == 3)
			{
				ABC = ABC.toLowerCase(Locale.ENGLISH);
			}
			else
			if(o > 3) //además de pasar a minusculas, se necesita agregar '
			{
				ABC.toLowerCase(Locale.ENGLISH);
				
				for(int i=0;i<o-3;i++)
				{
					ABC = ABC.concat("'");
				}
			}
			
			String d="";
					
			switch(duracion)
			{
				case     "REDONDA":d="8" ;break;
				case      "BLANCA":d="4" ;break;
				case       "NEGRA":d="2" ;break;
				case     "CORCHEA":d=""  ;break;
				case "SEMICORCHEA":d="/2";break;
				case        "FUSA":d="/4";break;
				
			}
			
		//y lo concatenamos
			ABC = ABC.concat(d);	
		// para finalmente retornar la nota
		return ABC;
		
	}

	public static String SilencioToABC(String duracion)
	{
		String ABC="z";
		String d="";
		
		switch(duracion)
		{
			case     "REDONDA":d="8";break;
			case      "BLANCA":d="4";break;
			case       "NEGRA":d="2";break;
			case     "CORCHEA":d="";break;
			case "SEMICORCHEA":d="/2";break;
			case        "FUSA":d="/4";break;
		}
		
		ABC = ABC.concat(d);	
		
		return ABC;
	}
}
