// $ANTLR 3.5 C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g 2013-10-03 22:20:02

 package dsl;
 
 import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DSLMusicLexer extends Lexer {
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

	  //arreglo para guardar los errores
	  public ArrayList<String> erroneos = new ArrayList<String>();
	    
	  public void emitErrorMessage(String msg)
	  { 
	    erroneos.add("Error:"+msg);
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DSLMusicLexer() {} 
	public DSLMusicLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DSLMusicLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g"; }

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:17:7: ( ');' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:17:9: ');'
			{
			match(");"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:18:7: ( ',' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:18:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:19:7: ( ';' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:19:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:20:7: ( 'END' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:20:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:21:7: ( 'NOTA(' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:21:9: 'NOTA('
			{
			match("NOTA("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:22:7: ( 'SILENCIO(' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:22:9: 'SILENCIO('
			{
			match("SILENCIO("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:23:7: ( 'SONIDO(' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:23:9: 'SONIDO('
			{
			match("SONIDO("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:24:7: ( 'UNIDAD=' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:24:9: 'UNIDAD='
			{
			match("UNIDAD="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:85:3: ( 'DO' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:85:4: 'DO'
			{
			match("DO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DOS"
	public final void mDOS() throws RecognitionException {
		try {
			int _type = DOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:87:4: ( 'DOS' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:87:5: 'DOS'
			{
			match("DOS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOS"

	// $ANTLR start "RE"
	public final void mRE() throws RecognitionException {
		try {
			int _type = RE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:89:3: ( 'RE' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:89:4: 'RE'
			{
			match("RE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RE"

	// $ANTLR start "RES"
	public final void mRES() throws RecognitionException {
		try {
			int _type = RES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:91:4: ( 'RES' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:91:5: 'RES'
			{
			match("RES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RES"

	// $ANTLR start "MI"
	public final void mMI() throws RecognitionException {
		try {
			int _type = MI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:93:3: ( 'MI' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:93:5: 'MI'
			{
			match("MI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MI"

	// $ANTLR start "FA"
	public final void mFA() throws RecognitionException {
		try {
			int _type = FA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:95:3: ( 'FA' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:95:5: 'FA'
			{
			match("FA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FA"

	// $ANTLR start "FAS"
	public final void mFAS() throws RecognitionException {
		try {
			int _type = FAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:97:4: ( 'FAS' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:97:6: 'FAS'
			{
			match("FAS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FAS"

	// $ANTLR start "SOL"
	public final void mSOL() throws RecognitionException {
		try {
			int _type = SOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:99:4: ( 'SOL' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:99:6: 'SOL'
			{
			match("SOL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOL"

	// $ANTLR start "SOLS"
	public final void mSOLS() throws RecognitionException {
		try {
			int _type = SOLS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:101:5: ( 'SOLS' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:101:7: 'SOLS'
			{
			match("SOLS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOLS"

	// $ANTLR start "LA"
	public final void mLA() throws RecognitionException {
		try {
			int _type = LA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:103:3: ( 'LA' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:103:5: 'LA'
			{
			match("LA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LA"

	// $ANTLR start "LAS"
	public final void mLAS() throws RecognitionException {
		try {
			int _type = LAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:105:4: ( 'LAS' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:105:6: 'LAS'
			{
			match("LAS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LAS"

	// $ANTLR start "SI"
	public final void mSI() throws RecognitionException {
		try {
			int _type = SI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:107:3: ( 'SI' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:107:5: 'SI'
			{
			match("SI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SI"

	// $ANTLR start "NUMERO"
	public final void mNUMERO() throws RecognitionException {
		try {
			int _type = NUMERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:109:9: ( ( '0' .. '9' )+ )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:109:10: ( '0' .. '9' )+
			{
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:109:10: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO"

	// $ANTLR start "FIGURAS"
	public final void mFIGURAS() throws RecognitionException {
		try {
			int _type = FIGURAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:111:8: ( 'REDONDA' | 'BLANCA' | 'NEGRA' | 'CORCHEA' | 'SEMICORCHEA' | 'FUSA' )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 'R':
				{
				alt2=1;
				}
				break;
			case 'B':
				{
				alt2=2;
				}
				break;
			case 'N':
				{
				alt2=3;
				}
				break;
			case 'C':
				{
				alt2=4;
				}
				break;
			case 'S':
				{
				alt2=5;
				}
				break;
			case 'F':
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:111:9: 'REDONDA'
					{
					match("REDONDA"); 

					}
					break;
				case 2 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:111:21: 'BLANCA'
					{
					match("BLANCA"); 

					}
					break;
				case 3 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:111:32: 'NEGRA'
					{
					match("NEGRA"); 

					}
					break;
				case 4 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:111:42: 'CORCHEA'
					{
					match("CORCHEA"); 

					}
					break;
				case 5 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:111:54: 'SEMICORCHEA'
					{
					match("SEMICORCHEA"); 

					}
					break;
				case 6 :
					// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:111:70: 'FUSA'
					{
					match("FUSA"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIGURAS"

	// $ANTLR start "UNIDADFREC"
	public final void mUNIDADFREC() throws RecognitionException {
		try {
			int _type = UNIDADFREC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:114:12: ( 'HZ' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:114:14: 'HZ'
			{
			match("HZ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIDADFREC"

	// $ANTLR start "UNIDADTIEMPO"
	public final void mUNIDADTIEMPO() throws RecognitionException {
		try {
			int _type = UNIDADTIEMPO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:116:13: ( 'MS' )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:116:15: 'MS'
			{
			match("MS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIDADTIEMPO"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:119:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:119:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | DO | DOS | RE | RES | MI | FA | FAS | SOL | SOLS | LA | LAS | SI | NUMERO | FIGURAS | UNIDADFREC | UNIDADTIEMPO | WS )
		int alt3=25;
		switch ( input.LA(1) ) {
		case ')':
			{
			alt3=1;
			}
			break;
		case ',':
			{
			alt3=2;
			}
			break;
		case ';':
			{
			alt3=3;
			}
			break;
		case 'E':
			{
			alt3=4;
			}
			break;
		case 'N':
			{
			int LA3_5 = input.LA(2);
			if ( (LA3_5=='O') ) {
				alt3=5;
			}
			else if ( (LA3_5=='E') ) {
				alt3=22;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 5, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'S':
			{
			switch ( input.LA(2) ) {
			case 'I':
				{
				int LA3_18 = input.LA(3);
				if ( (LA3_18=='L') ) {
					alt3=6;
				}

				else {
					alt3=20;
				}

				}
				break;
			case 'O':
				{
				int LA3_19 = input.LA(3);
				if ( (LA3_19=='N') ) {
					alt3=7;
				}
				else if ( (LA3_19=='L') ) {
					int LA3_29 = input.LA(4);
					if ( (LA3_29=='S') ) {
						alt3=17;
					}

					else {
						alt3=16;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 3, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'E':
				{
				alt3=22;
				}
				break;
			default:
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 6, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}
			}
			break;
		case 'U':
			{
			alt3=8;
			}
			break;
		case 'D':
			{
			int LA3_8 = input.LA(2);
			if ( (LA3_8=='O') ) {
				int LA3_20 = input.LA(3);
				if ( (LA3_20=='S') ) {
					alt3=10;
				}

				else {
					alt3=9;
				}

			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 8, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'R':
			{
			int LA3_9 = input.LA(2);
			if ( (LA3_9=='E') ) {
				switch ( input.LA(3) ) {
				case 'S':
					{
					alt3=12;
					}
					break;
				case 'D':
					{
					alt3=22;
					}
					break;
				default:
					alt3=11;
				}
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 9, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'M':
			{
			int LA3_10 = input.LA(2);
			if ( (LA3_10=='I') ) {
				alt3=13;
			}
			else if ( (LA3_10=='S') ) {
				alt3=24;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 10, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'F':
			{
			int LA3_11 = input.LA(2);
			if ( (LA3_11=='A') ) {
				int LA3_24 = input.LA(3);
				if ( (LA3_24=='S') ) {
					alt3=15;
				}

				else {
					alt3=14;
				}

			}
			else if ( (LA3_11=='U') ) {
				alt3=22;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 11, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'L':
			{
			int LA3_12 = input.LA(2);
			if ( (LA3_12=='A') ) {
				int LA3_25 = input.LA(3);
				if ( (LA3_25=='S') ) {
					alt3=19;
				}

				else {
					alt3=18;
				}

			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 3, 12, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt3=21;
			}
			break;
		case 'B':
		case 'C':
			{
			alt3=22;
			}
			break;
		case 'H':
			{
			alt3=23;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=25;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:10: T__21
				{
				mT__21(); 

				}
				break;
			case 2 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:16: T__22
				{
				mT__22(); 

				}
				break;
			case 3 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:22: T__23
				{
				mT__23(); 

				}
				break;
			case 4 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:28: T__24
				{
				mT__24(); 

				}
				break;
			case 5 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:34: T__25
				{
				mT__25(); 

				}
				break;
			case 6 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:40: T__26
				{
				mT__26(); 

				}
				break;
			case 7 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:46: T__27
				{
				mT__27(); 

				}
				break;
			case 8 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:52: T__28
				{
				mT__28(); 

				}
				break;
			case 9 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:58: DO
				{
				mDO(); 

				}
				break;
			case 10 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:61: DOS
				{
				mDOS(); 

				}
				break;
			case 11 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:65: RE
				{
				mRE(); 

				}
				break;
			case 12 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:68: RES
				{
				mRES(); 

				}
				break;
			case 13 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:72: MI
				{
				mMI(); 

				}
				break;
			case 14 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:75: FA
				{
				mFA(); 

				}
				break;
			case 15 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:78: FAS
				{
				mFAS(); 

				}
				break;
			case 16 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:82: SOL
				{
				mSOL(); 

				}
				break;
			case 17 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:86: SOLS
				{
				mSOLS(); 

				}
				break;
			case 18 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:91: LA
				{
				mLA(); 

				}
				break;
			case 19 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:94: LAS
				{
				mLAS(); 

				}
				break;
			case 20 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:98: SI
				{
				mSI(); 

				}
				break;
			case 21 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:101: NUMERO
				{
				mNUMERO(); 

				}
				break;
			case 22 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:108: FIGURAS
				{
				mFIGURAS(); 

				}
				break;
			case 23 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:116: UNIDADFREC
				{
				mUNIDADFREC(); 

				}
				break;
			case 24 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:127: UNIDADTIEMPO
				{
				mUNIDADTIEMPO(); 

				}
				break;
			case 25 :
				// C:\\Users\\Dimitry\\workspace\\DSLMusic\\src\\dsl\\DSLMusic.g:1:140: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
