package ast;

import java.util.Map;

public class ReferenciarVariable implements ASTnodo{

    private String nombreVariable;

    public ReferenciarVariable(String nombreVariable) {
        super();
        this.nombreVariable = nombreVariable;
    }

    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        return TablaDeSimbolos.get(nombreVariable);
    }
}
