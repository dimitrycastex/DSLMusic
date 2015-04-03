// $ANTLR 3.5 C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g 2013-10-03 22:20:00

 package dsl;
 
 import java.util.ArrayList;
 //clases propias
 import musica.Partitura;
 import musica.Pentagrama;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DSLMusicParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DO", "DOS", "FA", "FAS", "FIGURAS", 
		"LA", "LAS", "MI", "NUMERO", "RE", "RES", "SI", "SOL", "SOLS", "UNIDADFREC", 
		"UNIDADTIEMPO", "WS", "');'", "','", "';'", "'END'", "'NOTA('", "'SILENCIO('", 
		"'SONIDO('", "'UNIDAD='"
	};
	public static final int EOF=-1;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int DO=4;
	public static final int DOS=5;
	public static final int FA=6;
	public static final int FAS=7;
	public static final int FIGURAS=8;
	public static final int LA=9;
	public static final int LAS=10;
	public static final int MI=11;
	public static final int NUMERO=12;
	public static final int RE=13;
	public static final int RES=14;
	public static final int SI=15;
	public static final int SOL=16;
	public static final int SOLS=17;
	public static final int UNIDADFREC=18;
	public static final int UNIDADTIEMPO=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DSLMusicParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DSLMusicParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return DSLMusicParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g"; }


	  //arreglo para guardar los errores
	  public ArrayList<String> erroneos = new ArrayList<String>();
	  //se declara una partitura, para crearla dependiendo si es la gramática grupo_fijo o grupo_partitura
	  public Partitura partitura = new Partitura();
	  //se crea un pentagrama, que se ocupará solo para grupo_partitura
	  public Pentagrama pentagrama = new Pentagrama();
	  //variable que indica si es gramatica de figuras y gramatica fija
	  public boolean figuras;
	  //para el manejo de errores  
	  public void emitErrorMessage(String msg)
	  { 
	    erroneos.add("Error:"+msg);
	  }



	// $ANTLR start "start"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:50:1: start : ( grupo_partitura | grupo_fijo );
	public final void start() throws RecognitionException {
		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:50:7: ( grupo_partitura | grupo_fijo )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==28) ) {
				alt1=1;
			}
			else if ( ((LA1_0 >= 26 && LA1_0 <= 27)) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:50:9: grupo_partitura
					{
					pushFollow(FOLLOW_grupo_partitura_in_start48);
					grupo_partitura();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:50:25: grupo_fijo
					{
					pushFollow(FOLLOW_grupo_fijo_in_start50);
					grupo_fijo();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"



	// $ANTLR start "grupo_partitura"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:54:1: grupo_partitura : def_ms ( partitura_nota | partitura_silencio )+ 'END' ;
	public final void grupo_partitura() throws RecognitionException {
		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:54:16: ( def_ms ( partitura_nota | partitura_silencio )+ 'END' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:54:18: def_ms ( partitura_nota | partitura_silencio )+ 'END'
			{
			pushFollow(FOLLOW_def_ms_in_grupo_partitura59);
			def_ms();
			state._fsp--;

			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:54:25: ( partitura_nota | partitura_silencio )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==25) ) {
					alt2=1;
				}
				else if ( (LA2_0==26) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:54:26: partitura_nota
					{
					pushFollow(FOLLOW_partitura_nota_in_grupo_partitura62);
					partitura_nota();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:54:41: partitura_silencio
					{
					pushFollow(FOLLOW_partitura_silencio_in_grupo_partitura64);
					partitura_silencio();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input,24,FOLLOW_24_in_grupo_partitura68); 
			figuras=true;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "grupo_partitura"



	// $ANTLR start "def_ms"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:56:1: def_ms : 'UNIDAD=' tiempo ';' ;
	public final void def_ms() throws RecognitionException {
		double tiempo1 =0.0;

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:56:9: ( 'UNIDAD=' tiempo ';' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:56:11: 'UNIDAD=' tiempo ';'
			{
			match(input,28,FOLLOW_28_in_def_ms79); 
			pushFollow(FOLLOW_tiempo_in_def_ms81);
			tiempo1=tiempo();
			state._fsp--;

			match(input,23,FOLLOW_23_in_def_ms82); 
			partitura.setMilisegundos(tiempo1);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "def_ms"



	// $ANTLR start "tiempo"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:58:1: tiempo returns [double value] : NUMERO ( octava )* unidadtiempo ;
	public final double tiempo() throws RecognitionException {
		double value = 0.0;


		Token NUMERO2=null;

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:58:31: ( NUMERO ( octava )* unidadtiempo )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:58:33: NUMERO ( octava )* unidadtiempo
			{
			NUMERO2=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_tiempo95); 
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:58:40: ( octava )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==NUMERO) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:58:40: octava
					{
					pushFollow(FOLLOW_octava_in_tiempo97);
					octava();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_unidadtiempo_in_tiempo100);
			unidadtiempo();
			state._fsp--;

			value = Double.parseDouble((NUMERO2!=null?NUMERO2.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "tiempo"



	// $ANTLR start "unidadtiempo"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:60:1: unidadtiempo : UNIDADTIEMPO ;
	public final void unidadtiempo() throws RecognitionException {
		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:60:15: ( UNIDADTIEMPO )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:60:17: UNIDADTIEMPO
			{
			match(input,UNIDADTIEMPO,FOLLOW_UNIDADTIEMPO_in_unidadtiempo111); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unidadtiempo"



	// $ANTLR start "partitura_nota"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:62:1: partitura_nota : 'NOTA(' nota octava ',' figuras ');' ;
	public final void partitura_nota() throws RecognitionException {
		ParserRuleReturnScope nota3 =null;
		ParserRuleReturnScope octava4 =null;
		ParserRuleReturnScope figuras5 =null;

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:62:15: ( 'NOTA(' nota octava ',' figuras ');' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:62:16: 'NOTA(' nota octava ',' figuras ');'
			{
			match(input,25,FOLLOW_25_in_partitura_nota117); 
			pushFollow(FOLLOW_nota_in_partitura_nota119);
			nota3=nota();
			state._fsp--;

			pushFollow(FOLLOW_octava_in_partitura_nota121);
			octava4=octava();
			state._fsp--;

			match(input,22,FOLLOW_22_in_partitura_nota123); 
			pushFollow(FOLLOW_figuras_in_partitura_nota125);
			figuras5=figuras();
			state._fsp--;

			match(input,21,FOLLOW_21_in_partitura_nota127); 
			partitura.addNota((nota3!=null?input.toString(nota3.start,nota3.stop):null),(octava4!=null?input.toString(octava4.start,octava4.stop):null),(figuras5!=null?input.toString(figuras5.start,figuras5.stop):null));pentagrama.addNota((nota3!=null?input.toString(nota3.start,nota3.stop):null),(octava4!=null?input.toString(octava4.start,octava4.stop):null),(figuras5!=null?input.toString(figuras5.start,figuras5.stop):null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "partitura_nota"



	// $ANTLR start "partitura_silencio"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:64:1: partitura_silencio : 'SILENCIO(' figuras ');' ;
	public final void partitura_silencio() throws RecognitionException {
		ParserRuleReturnScope figuras6 =null;

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:64:19: ( 'SILENCIO(' figuras ');' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:64:20: 'SILENCIO(' figuras ');'
			{
			match(input,26,FOLLOW_26_in_partitura_silencio135); 
			pushFollow(FOLLOW_figuras_in_partitura_silencio136);
			figuras6=figuras();
			state._fsp--;

			match(input,21,FOLLOW_21_in_partitura_silencio137); 
			partitura.addSilencio((figuras6!=null?input.toString(figuras6.start,figuras6.stop):null));pentagrama.addSilencio((figuras6!=null?input.toString(figuras6.start,figuras6.stop):null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "partitura_silencio"


	public static class octava_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "octava"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:66:1: octava : NUMERO ;
	public final DSLMusicParser.octava_return octava() throws RecognitionException {
		DSLMusicParser.octava_return retval = new DSLMusicParser.octava_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:66:9: ( NUMERO )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:66:12: NUMERO
			{
			match(input,NUMERO,FOLLOW_NUMERO_in_octava149); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "octava"


	public static class figuras_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "figuras"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:68:1: figuras : FIGURAS ;
	public final DSLMusicParser.figuras_return figuras() throws RecognitionException {
		DSLMusicParser.figuras_return retval = new DSLMusicParser.figuras_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:68:9: ( FIGURAS )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:68:11: FIGURAS
			{
			match(input,FIGURAS,FOLLOW_FIGURAS_in_figuras157); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "figuras"


	public static class nota_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "nota"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:70:1: nota : ( DO | DOS | RE | RES | MI | FA | FAS | SOL | SOLS | LA | LAS | SI );
	public final DSLMusicParser.nota_return nota() throws RecognitionException {
		DSLMusicParser.nota_return retval = new DSLMusicParser.nota_return();
		retval.start = input.LT(1);

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:70:5: ( DO | DOS | RE | RES | MI | FA | FAS | SOL | SOLS | LA | LAS | SI )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:
			{
			if ( (input.LA(1) >= DO && input.LA(1) <= FAS)||(input.LA(1) >= LA && input.LA(1) <= MI)||(input.LA(1) >= RE && input.LA(1) <= SOLS) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nota"



	// $ANTLR start "grupo_fijo"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:73:1: grupo_fijo : ( fijo_sonido | fijo_silencio )+ 'END' ;
	public final void grupo_fijo() throws RecognitionException {
		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:73:11: ( ( fijo_sonido | fijo_silencio )+ 'END' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:73:13: ( fijo_sonido | fijo_silencio )+ 'END'
			{
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:73:13: ( fijo_sonido | fijo_silencio )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==27) ) {
					alt4=1;
				}
				else if ( (LA4_0==26) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:73:14: fijo_sonido
					{
					pushFollow(FOLLOW_fijo_sonido_in_grupo_fijo217);
					fijo_sonido();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:73:26: fijo_silencio
					{
					pushFollow(FOLLOW_fijo_silencio_in_grupo_fijo219);
					fijo_silencio();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match(input,24,FOLLOW_24_in_grupo_fijo223); 
			figuras=false;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "grupo_fijo"



	// $ANTLR start "fijo_sonido"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:75:1: fijo_sonido : 'SONIDO(' frecuencia ',' tiempo ');' ;
	public final void fijo_sonido() throws RecognitionException {
		double frecuencia7 =0.0;
		double tiempo8 =0.0;

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:75:13: ( 'SONIDO(' frecuencia ',' tiempo ');' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:75:15: 'SONIDO(' frecuencia ',' tiempo ');'
			{
			match(input,27,FOLLOW_27_in_fijo_sonido233); 
			pushFollow(FOLLOW_frecuencia_in_fijo_sonido235);
			frecuencia7=frecuencia();
			state._fsp--;

			match(input,22,FOLLOW_22_in_fijo_sonido237); 
			pushFollow(FOLLOW_tiempo_in_fijo_sonido239);
			tiempo8=tiempo();
			state._fsp--;

			match(input,21,FOLLOW_21_in_fijo_sonido241); 
			partitura.addNota(frecuencia7,tiempo8);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fijo_sonido"



	// $ANTLR start "fijo_silencio"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:77:1: fijo_silencio : 'SILENCIO(' tiempo ');' ;
	public final void fijo_silencio() throws RecognitionException {
		double tiempo9 =0.0;

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:77:17: ( 'SILENCIO(' tiempo ');' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:77:19: 'SILENCIO(' tiempo ');'
			{
			match(input,26,FOLLOW_26_in_fijo_silencio252); 
			pushFollow(FOLLOW_tiempo_in_fijo_silencio253);
			tiempo9=tiempo();
			state._fsp--;

			match(input,21,FOLLOW_21_in_fijo_silencio254); 
			partitura.addSilencio(tiempo9);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fijo_silencio"



	// $ANTLR start "frecuencia"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:79:1: frecuencia returns [double frec_value] : NUMERO unidadfrec ;
	public final double frecuencia() throws RecognitionException {
		double frec_value = 0.0;


		Token NUMERO10=null;

		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:79:38: ( NUMERO unidadfrec )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:79:41: NUMERO unidadfrec
			{
			NUMERO10=(Token)match(input,NUMERO,FOLLOW_NUMERO_in_frecuencia266); 
			pushFollow(FOLLOW_unidadfrec_in_frecuencia268);
			unidadfrec();
			state._fsp--;

			frec_value = Double.parseDouble((NUMERO10!=null?NUMERO10.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return frec_value;
	}
	// $ANTLR end "frecuencia"



	// $ANTLR start "unidadfrec"
	// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:81:1: unidadfrec : UNIDADFREC ;
	public final void unidadfrec() throws RecognitionException {
		try {
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:81:11: ( UNIDADFREC )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:81:14: UNIDADFREC
			{
			match(input,UNIDADFREC,FOLLOW_UNIDADFREC_in_unidadfrec277); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unidadfrec"

	// Delegated rules



	public static final BitSet FOLLOW_grupo_partitura_in_start48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grupo_fijo_in_start50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_def_ms_in_grupo_partitura59 = new BitSet(new long[]{0x0000000006000000L});
	public static final BitSet FOLLOW_partitura_nota_in_grupo_partitura62 = new BitSet(new long[]{0x0000000007000000L});
	public static final BitSet FOLLOW_partitura_silencio_in_grupo_partitura64 = new BitSet(new long[]{0x0000000007000000L});
	public static final BitSet FOLLOW_24_in_grupo_partitura68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_def_ms79 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_tiempo_in_def_ms81 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_def_ms82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_tiempo95 = new BitSet(new long[]{0x0000000000081000L});
	public static final BitSet FOLLOW_octava_in_tiempo97 = new BitSet(new long[]{0x0000000000081000L});
	public static final BitSet FOLLOW_unidadtiempo_in_tiempo100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIDADTIEMPO_in_unidadtiempo111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_partitura_nota117 = new BitSet(new long[]{0x000000000003EEF0L});
	public static final BitSet FOLLOW_nota_in_partitura_nota119 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_octava_in_partitura_nota121 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_partitura_nota123 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_figuras_in_partitura_nota125 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_partitura_nota127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_partitura_silencio135 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_figuras_in_partitura_silencio136 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_partitura_silencio137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_octava149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIGURAS_in_figuras157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fijo_sonido_in_grupo_fijo217 = new BitSet(new long[]{0x000000000D000000L});
	public static final BitSet FOLLOW_fijo_silencio_in_grupo_fijo219 = new BitSet(new long[]{0x000000000D000000L});
	public static final BitSet FOLLOW_24_in_grupo_fijo223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_fijo_sonido233 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_frecuencia_in_fijo_sonido235 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_fijo_sonido237 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_tiempo_in_fijo_sonido239 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_fijo_sonido241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_fijo_silencio252 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_tiempo_in_fijo_silencio253 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_fijo_silencio254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_in_frecuencia266 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_unidadfrec_in_frecuencia268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIDADFREC_in_unidadfrec277 = new BitSet(new long[]{0x0000000000000002L});
}
