%%

%class Lexer
%unicode
%cup

%%

/* Reglas lexicas */

/* Palabras clave deben ir antes de los identificadores */
"if"                 { return sym.IF; }
"else"               { return sym.ELSE; }
"while"              { return sym.WHILE; }

/* Tipos de datos */
int                  { return sym.INT; }
float                { return sym.FLOAT; }
char                 { return sym.CHAR; }
bool                 { return sym.BOOL; }

/* Operadores relacionales */
"=="                 { return sym.EQ; }
"!="                 { return sym.NEQ; }
"<"                  { return sym.LT; }
"<="                 { return sym.LEQ; }
">"                  { return sym.GT; }
">="                 { return sym.GEQ; }

/* Identificadores */
[a-zA-Z][a-zA-Z0-9]* { return sym.IDENTIFIER; }

/* Números */
[0-9]+               { return sym.NUM; }

/* Símbolos */
"("                  { return sym.LPAREN; }
")"                  { return sym.RPAREN; }
"{"                  { return sym.LBRACE; }
"}"                  { return sym.RBRACE; }
","                  { return sym.COMMA; }
";"                  { return sym.SEMICOLON; }
"="                  { return sym.ASSIGN; }

/* Espacios en blanco y saltos de línea (ignorados) */
[ \t\n\r]+           { /* Ignorar espacios en blanco y saltos de línea */ }

/* Manejo de errores */
.                    { System.err.println("Error léxico: " + yytext()); }
