package ast;

import java.util.Map;

public class Imprimir implements ASTnodo {
    private ASTnodo dato;

    public Imprimir(ASTnodo dato) {
        super();
        this.dato = dato;
    }

    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        System.out.println(String.valueOf(dato.ejecutar(TablaDeSimbolos))
                .replace("\"","")
                .replace("\\n","\n")
                .replace("\\t","\t"));
        return null;
    }
}
