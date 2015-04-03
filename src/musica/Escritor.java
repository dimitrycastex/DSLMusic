package musica;

public class Escritor
{
	
	public String addNota(String nota, int octava, String duracion)
	{
		return(
				"NOTA("+
				nota+""+octava+","+duracion+
				");"
				);
	}
	
	public String addSilencio(String duracion)
	{
		return(
				"SILENCIO("+
				duracion+
				");"
				);
	}
}
