package ast;

import java.util.Map;

public class Constante implements ASTnodo {
    private Object constante;


    public Constante(Object constante) {
        super();
        this.constante = constante;
    }

    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        return constante;
    }
}
