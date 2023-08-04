import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;



public class Main {
    private static final String EXTENSION = "oxes";

    public static void main(String[] args) throws IOException {
        String program = args.length > 1 ? args[1] : "test/pitagoras." + EXTENSION;

        System.out.println("Interpretando archivo " + program);

        GramaticaLexer lexer = new GramaticaLexer(new ANTLRFileStream(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramaticaParser parser = new GramaticaParser(tokens);

        GramaticaParser.ProgramaContext tree = parser.programa();

        GramaticaBaseVisitor visitor = new GramaticaBaseVisitor();
        visitor.visit(tree);

        System.out.println("Interpretacion finalizada :)");

    }
}
