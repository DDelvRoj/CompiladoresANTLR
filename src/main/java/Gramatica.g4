grammar Gramatica;

@parser::header{
    import java.lang.Math;
    import java.util.Map;
    import java.util.HashMap;
    import ast.*;
}
@parser::members{
    Map<String,Object> TablaDeSimbolos = new HashMap<String,Object>();
}

programa :
    PRINCIPAL
    LLAVE_ABI
     {List<ASTnodo> cuerpoPrincipal = new ArrayList<ASTnodo>();}
    (sentencia {cuerpoPrincipal.add($sentencia.nodo);})*
    LLAVE_CER
    {cuerpoPrincipal.forEach(nodo -> nodo.ejecutar(TablaDeSimbolos));};

sentencia returns [ASTnodo nodo] : imprimir {$nodo = $imprimir.nodo;}
                | condicional {$nodo = $condicional.nodo;}
                | mientras {$nodo = $mientras.nodo;}
                | dec_var {$nodo = $dec_var.nodo;}
                | asig_var {$nodo = $asig_var.nodo;} ;
dec_var returns [ASTnodo nodo] : VAR (ID {$nodo = new DeclararVariable($ID.text);}
                |   ID ASIG expresion{$nodo = new AsignarVariable($ID.text,$expresion.nodo);} ) PUNTOYCOM ;
asig_var returns [ASTnodo nodo] : ID ASIG expresion PUNTOYCOM {$nodo = new AsignarVariable($ID.text,$expresion.nodo);};
imprimir returns [ASTnodo nodo] : IMPRIMIR PAREN_ABI expresion PAREN_CER PUNTOYCOM {$nodo = new Imprimir($expresion.nodo); };
condicional returns [ASTnodo nodo] : SI PAREN_ABI expresion PAREN_CER
            {List<ASTnodo> cuerpoSi = new ArrayList<ASTnodo>();
             List<ASTnodo> cuerpoSino = new ArrayList<ASTnodo>();}
            LLAVE_ABI
            (sent = sentencia {cuerpoSi.add($sent.nodo);})*
            LLAVE_CER (SINO LLAVE_ABI
            (sent2 = sentencia {cuerpoSino.add($sent2.nodo);})*
            LLAVE_CER)? {$nodo = new Si($expresion.nodo,cuerpoSi,cuerpoSino);};
mientras returns [ASTnodo nodo] : MIENTRAS PAREN_ABI expresion PAREN_CER
            {List<ASTnodo> cuerpo = new ArrayList<ASTnodo>();}
            LLAVE_ABI
             (sentM = sentencia {cuerpo.add($sentM.nodo);})*
             LLAVE_CER
            {$nodo = new Mientras($expresion.nodo,cuerpo);};


expresion returns [ASTnodo nodo]: t1 = fact  {$nodo = $t1.nodo;}
            (MAS t2 = fact {$nodo = new Adicion($nodo,$t2.nodo);}
            |
            MENOS t2 = fact {$nodo = new Substraccion($nodo,$t2.nodo);}
            |
            Y t2 = fact {$nodo = new Conjuncion($nodo,$t2.nodo);}
            |
            O t2 = fact {$nodo = new Disyuncion($nodo,$t2.nodo);})*;
fact returns [ASTnodo nodo] :t1 = term {$nodo = $t1.nodo;}
            (MULT t2 = term {$nodo = new Multiplicacion($nodo,$t2.nodo);}
             |
             DIV t2 = term {$nodo = new Division($nodo,$t2.nodo);}
             |
             POT t2 = term {$nodo = new Potenciacion($nodo,$t2.nodo);}
             |
             MAY t2 = term {$nodo = new MayorMenor($nodo,$t2.nodo);}
             |
             MEN t2 = term {$nodo = new MayorMenor($t2.nodo,$nodo);}
             |
             IG t2 = term {$nodo = new Igual($nodo,$t2.nodo);}
             |
             MENIG t2 = term {$nodo = new Disyuncion(new Igual($nodo,$t2.nodo),new MayorMenor($t2.nodo,$nodo));}
             |
             MAYIG t2 = term {$nodo = new Disyuncion(new Igual($nodo,$t2.nodo),new MayorMenor($nodo,$t2.nodo));})*;
term returns [ASTnodo nodo] :
    NUMERO {$nodo = new Constante(Float.parseFloat($NUMERO.text));}
    |
    BOOLEANO {$nodo = new Constante(Boolean.parseBoolean($BOOLEANO.text));}
    |
    CADENA{$nodo = new Constante($CADENA.text);}
    |
    ID {$nodo = new ReferenciarVariable($ID.text);}
    |
    PAREN_ABI expresion {$nodo = $expresion.nodo;} PAREN_CER
    |
    CORCH_ABI expresion {$nodo = $expresion.nodo;} CORCH_CER
    |
    NO  expresion {$nodo = new Negacion($expresion.nodo);};
//Funciones Basicas
PRINCIPAL : 'PRINCIPAL';
SI : 'SI';
SINO: 'SINO';
MIENTRAS:'MIENTRAS';
IMPRIMIR : 'Imprimir';
//Declaracion
VAR : 'var';
//Operadores Aritmeticos
MAS : '+';
MENOS : '-';
MULT : '*';
POT : MULT MULT | '^';
DIV : '/';
MOD : '%';
//Operadores Logicos
Y : ('Y'|'&');
O : ('O'|'|');
NO: ('~'|'NO'|'!');
MAY: '>';
MAYIG:'>=';
MEN: '<';
MENIG:'<=';
IG: '==';
NOIG: '!=';
//Asignacion de Variables
ASIG : ('='|'<-');
//Puntuacion
LLAVE_ABI:'{';
LLAVE_CER:'}';
PAREN_ABI:'(';
PAREN_CER:')';
CORCH_ABI:'[';
CORCH_CER:']';
PUNTOYCOM:';';
//Identificadores
BOOLEANO: ('true'|'false');
NUMERO:('-')?([0-9]+)(('.'[0-9]+)?);
//CADENA:COMILLAS [a-zA-Z0-9][a-zA-Z0-9 ]* COMILLAS;
CADENA : '"' ( '\\"'| . )*? '"' ;
ID : [a-zA-Z][a-zA-Z0-9_]*;

//Espacio en Blanco EB, skip permite al analizador ignorar
EB:[ \t\n\r]+ -> skip;



/*sex:   (expr NUEVALINEA)* ;
expr:   expr('*'|'/')
expr
    |   expr('+'|'-')
expr
    |   INT
    |   '('expr')';
NUEVALINEA: [\r\n]+;
INT:    [0-9]+;
*/