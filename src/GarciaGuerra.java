import java.io.*;

import org.antlr.v4.runtime.*;

public class GarciaGuerra {
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        try {
            // Cabecera fichero HTML
            output.append("<!DOCTYPE html> \n" +
                    "<html> \n" +
                    "<head> \n" +
                    "<title>MarkDown3HTML</title> \n" +
                    "<style> \n" +
                    ".bold {font-weight: bold;}  \n" +
                    ".ital {font-style: italic;} \n" +
                    "</style> \n" +
                    "</head> \n" +
                    "<body>\n");

            // Texto a analizar
            CharStream input = CharStreams.fromFileName(args[0]);
            GarciaGuerraLexer analex = new GarciaGuerraLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            GarciaGuerraParser anasint = new GarciaGuerraParser(tokens);

            // Capturamos la salida estándar temporalmente porque la gramática usa System.out.print
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos, true, "UTF-8");
            PrintStream oldOut = System.out;
            try {
                System.setOut(ps);
                anasint.texto();
                System.out.flush();
            } finally {
                System.setOut(oldOut);
            }

            // Procesar lo generado por la gramática
            String parsedHtml = baos.toString("UTF-8");
            output.append(parsedHtml);

        } catch (org.antlr.v4.runtime.RecognitionException e) {
            output.append("<p>Error de reconocimiento: " + e.getMessage() + "</p>");
        } catch (IOException e) {
            output.append("<p>Error de entrada/salida: " + e.getMessage() + "</p>");
        } catch (java.lang.RuntimeException e) {
            output.append("<p>Error en tiempo de ejecución: " + e.getMessage() + "</p>");
        }


        // Final fichero HTML
        output.append("</body>\n</html>");

        //Imprimir por salida estándar
        System.out.println(output.toString());

        // Guardar en archivo salida.html
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salida.html"))) {
            writer.write(output.toString());
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}