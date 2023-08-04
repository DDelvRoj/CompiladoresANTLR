package ast;

import java.util.List;
import java.util.Map;

public class Si implements ASTnodo{

    private ASTnodo condicion;
    private List<ASTnodo> cuerpoSI;
    private List<ASTnodo> cuerpoSINO;


    public Si(ASTnodo condicion, List<ASTnodo> cuerpoSI, List<ASTnodo> cuerpoSINO ) {
        super();
        this.condicion = condicion;
        this.cuerpoSI = cuerpoSI;
        this.cuerpoSINO = cuerpoSINO;
    }

    @Override
    public Object ejecutar(Map<String, Object> TablaDeSimbolos) {
        if((boolean) condicion.ejecutar(TablaDeSimbolos)){
            cuerpoSI.forEach(nodo -> nodo.ejecutar(TablaDeSimbolos));
        } else {
            cuerpoSINO.forEach(nodo -> nodo.ejecutar(TablaDeSimbolos));
        }
        return null;
    }
}
