grammar GarciaGuerra;

@lexer::members {
    private boolean inList = false;
    private void closeList() {
        if (inList) {
            System.out.print("</ul>\n");
            inList = false;
        }
    }
}

texto: (ENCABEZADO6 | ENCABEZADO5 | ENCABEZADO4 | ENCABEZADO3 | ENCABEZADO2 | ENCABEZADO1 | CITA | HR | CODE | LINK | LIST_ITEM | NEGRITA | NEGRITA2 | CURSIVA | CURSIVA2 | UNMATCHED_ASTERISK | UNMATCHED_UNDERSCORE | PLAIN | NEWLINE)+ ;

// Encabezados (Empezando substring en 7, 6, 5, 4, 3, 2 para eliminar los '#' y el espacio inicial)
ENCABEZADO6: '###### ' ~[\r\n]+ { closeList(); System.out.print("<h6>" + getText().substring(7).trim() + "</h6>"); } ;
ENCABEZADO5: '##### ' ~[\r\n]+ { closeList(); System.out.print("<h5>" + getText().substring(6).trim() + "</h5>"); } ;
ENCABEZADO4: '#### ' ~[\r\n]+ { closeList(); System.out.print("<h4>" + getText().substring(5).trim() + "</h4>"); } ;
ENCABEZADO3: '### ' ~[\r\n]+ { closeList(); System.out.print("<h3>" + getText().substring(4).trim() + "</h3>"); } ;
ENCABEZADO2: '## ' ~[\r\n]+ { closeList(); System.out.print("<h2>" + getText().substring(3).trim() + "</h2>"); } ;
ENCABEZADO1: '# ' ~[\r\n]+ { closeList(); System.out.print("<h1>" + getText().substring(2).trim() + "</h1>"); } ;

// Cita
CITA: '> ' ~[\r\n]+ { closeList(); System.out.print("<blockquote>" + getText().substring(1).trim() + "</blockquote>"); } ;

// Línea horizontal
HR: ( '---' | '___' | '***' ) { closeList(); System.out.print("<hr/>"); } ;

// Bloques de código
CODE: '~~~' ( . | '\r' | '\n' )*? '~~~' { closeList(); String s = getText().substring(3, getText().length() - 3); System.out.print("<code><pre>" + s.trim() + "</pre></code>\n"); } ;

// Enlaces [texto](url) con validación básica de URL
LINK: '[' ~[\]\r\n]+ ']' '(' ~[)\r\n]+ ')' {
    closeList();
    String s = getText();
    int rb = s.indexOf(']');
    int lp = s.indexOf('(', rb);
    int rp = s.lastIndexOf(')');
    String txt = s.substring(1, rb);
    String url = s.substring(lp + 1, rp);
    boolean ok = url.matches("(?i)https?://[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+.*");
    if (!ok) {
        txt = txt + " (URL enlace aparentemente incorrecta)";
    }
    System.out.print("<a href=\"" + url + "\">" + txt + "</a>");
} ;

// Lista: elemento de lista comienza con '- ' y termina al final de línea
LIST_ITEM: '- ' ~[\r\n]+ {
    if (!inList) { System.out.print("<ul>\n"); inList = true; }
    String s = getText().substring(2).trim();
    System.out.print("<li>" + s + "</li>\n");
} ;

// Negrita y cursiva
NEGRITA: '**' (~[\r\n*])+ '**' { closeList(); System.out.print("<span class='bold'>" + getText().substring(2, getText().length() - 2) + "</span>"); } ;
NEGRITA2: '__' (~[\r\n_])+ '__' { closeList(); System.out.print("<span class='bold'>" + getText().substring(2, getText().length() - 2) + "</span>"); } ;

CURSIVA: '*' (~[\r\n*])+ '*' { closeList(); System.out.print("<span class='ital'>" + getText().substring(1, getText().length() - 1) + "</span>"); } ;
CURSIVA2: '_' (~[\r\n_])+ '_' { closeList(); System.out.print("<span class='ital'>" + getText().substring(1, getText().length() - 1) + "</span>"); } ;

// Marcas sueltas (si no hay cierre, para evitar errores)
UNMATCHED_ASTERISK: '*' ~[\r\n*]+ { closeList(); System.out.print(getText()); } ;
UNMATCHED_UNDERSCORE: '_' ~[\r\n_]+ { closeList(); System.out.print(getText()); } ;

// Texto plano (excluir '[', '*' '_' etc.)
PLAIN: (~('\r' | '\n' | '[' | '_' | '*' | '`' | '~' | '>'))+ { closeList(); System.out.print(getText()); } ;

// Saltos de línea: si hay una línea en blanco hay que cerrar la lista abierta.
NEWLINE: '\r'? '\n' { if (inList) { int la = _input.LA(1); if (la== '\r' || la=='\n' || la==org.antlr.v4.runtime.IntStream.EOF) closeList(); } System.out.print("\n"); } ;

// Espacios en blanco
WS: [ \t]+ -> skip ;
