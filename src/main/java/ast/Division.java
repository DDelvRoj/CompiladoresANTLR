package ast;

import java.util.Map;

public class Division implements ASTnodo {
    private ASTnodo operando1;
    private ASTnodo operando2;

    public Division(ASTnodo operando1, ASTnodo operando2) {
        super();
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        return Float.parseFloat(String.valueOf(operando1.ejecutar(TablaDeSimbolos))) / Float.parseFloat(String.valueOf(operando2.ejecutar(TablaDeSimbolos)));
    }
}
