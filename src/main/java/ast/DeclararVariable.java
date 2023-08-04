package ast;

import java.util.Map;

public class DeclararVariable implements ASTnodo{

    private String nombreVariable;

    public DeclararVariable(String nombreVariable) {
        super();
        this.nombreVariable = nombreVariable;
    }

    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        TablaDeSimbolos.put(nombreVariable,new Object());
        return null;
    }
}
