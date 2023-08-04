package ast;


import java.util.Map;

public class Disyuncion implements ASTnodo{
    private ASTnodo operador1;
    private ASTnodo operador2;

    public Disyuncion(ASTnodo operador1, ASTnodo operador2){
        super();
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        return (((boolean)operador1.ejecutar(TablaDeSimbolos)  || (boolean) operador2.ejecutar(TablaDeSimbolos))
                ?true:false);
    }
}
