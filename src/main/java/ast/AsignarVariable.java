package ast;

import java.util.Map;

public class AsignarVariable implements ASTnodo{

    private String nombreVariable;
    private ASTnodo valor;

    public AsignarVariable(String nombreVariable, ASTnodo valor) {
        super();
        this.nombreVariable = nombreVariable;
        this.valor = valor;
    }

    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        TablaDeSimbolos.put(nombreVariable,valor.ejecutar(TablaDeSimbolos));
        return null;
    }
}
