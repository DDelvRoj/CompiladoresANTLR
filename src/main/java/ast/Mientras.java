package ast;

import java.util.List;
import java.util.Map;

public class Mientras implements ASTnodo{

    private ASTnodo condicion;
    private List<ASTnodo> cuerpo;


    public Mientras(ASTnodo condicion, List<ASTnodo> cuerpo ) {
        super();
        this.condicion = condicion;
        this.cuerpo = cuerpo;
    }

    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        while((boolean) condicion.ejecutar(TablaDeSimbolos)){
            cuerpo.forEach(nodo -> nodo.ejecutar(TablaDeSimbolos));
        }
        return null;
    }
}
