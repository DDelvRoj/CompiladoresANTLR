package ast;


import java.util.Map;

public class MayorMenor implements ASTnodo{
    private ASTnodo operador1;
    private ASTnodo operador2;

    public MayorMenor(ASTnodo operador1, ASTnodo operador2){
        super();
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {

        return (Float.parseFloat(String.valueOf(operador1.ejecutar(TablaDeSimbolos))) > Float.parseFloat(String.valueOf(operador2.ejecutar(TablaDeSimbolos))));
    }
}
