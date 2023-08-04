package ast;


import java.util.Map;

public class Negacion implements ASTnodo{
    private ASTnodo operador1;

    public Negacion(ASTnodo operador1){
        super();
        this.operador1 = operador1;
    }
    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        return !((boolean) operador1.ejecutar(TablaDeSimbolos));
    }
}
