grammar DSLMusic;

@parser::header
{
 package dsl;
 
 import java.util.ArrayList;
 //clases propias
 import musica.Partitura;
 import musica.Pentagrama;
}

@lexer::header
{
 package dsl;
 
 import java.util.ArrayList;
}

@lexer::members
{
  //arreglo para guardar los errores
  public ArrayList<String> erroneos = new ArrayList<String>();
    
  public void emitErrorMessage(String msg)
  { 
    erroneos.add("Error:"+msg);
  }
}

@parser::members
{
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
}


//union de gramaticas
start : grupo_partitura|grupo_fijo;

//REGLAS
//grupo partitura
grupo_partitura: def_ms (partitura_nota|partitura_silencio)+ 'END' {figuras=true;};

def_ms  : 'UNIDAD=' tiempo';'{partitura.setMilisegundos($tiempo.value);};

tiempo returns[double value]  : NUMERO octava* unidadtiempo {$value = Double.parseDouble($NUMERO.text);};

unidadtiempo  : UNIDADTIEMPO;

partitura_nota:'NOTA(' nota octava ',' figuras ');' {partitura.addNota($nota.text,$octava.text,$figuras.text);pentagrama.addNota($nota.text,$octava.text,$figuras.text);};

partitura_silencio:'SILENCIO('figuras');' {partitura.addSilencio($figuras.text);pentagrama.addSilencio($figuras.text);};

octava  :  NUMERO;

figuras : FIGURAS;

nota: DO | DOS | RE | RES | MI | FA | FAS | SOL | SOLS | LA | LAS | SI;

//grupo fijo
grupo_fijo: (fijo_sonido|fijo_silencio)+ 'END' {figuras=false;};

fijo_sonido : 'SONIDO(' frecuencia ',' tiempo ');'{partitura.addNota($frecuencia.frec_value,$tiempo.value);};

fijo_silencio   : 'SILENCIO('tiempo');'{partitura.addSilencio($tiempo.value);};

frecuencia returns[double frec_value]:  NUMERO unidadfrec{$frec_value = Double.parseDouble($NUMERO.text);};

unidadfrec:  UNIDADFREC;  

//TERMINALES
//grupo partitura
DO:'DO';

DOS:'DOS';
  
RE:'RE';

RES:'RES';
  
MI: 'MI';
  
FA: 'FA';

FAS: 'FAS';
  
SOL: 'SOL';

SOLS: 'SOLS';
  
LA: 'LA';

LAS: 'LAS';
  
SI: 'SI';
  
NUMERO  :'0'..'9'+;

FIGURAS:'REDONDA' | 'BLANCA' | 'NEGRA' | 'CORCHEA' | 'SEMICORCHEA' | 'FUSA';

//grupo fijo 
UNIDADFREC : 'HZ';

UNIDADTIEMPO: 'MS';

//salto de línea
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;};


