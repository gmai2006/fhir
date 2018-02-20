grammar SearchFilter;

filter : param_expr | log_expr | 'not'? '(' filter ')';

param_expr : param_path compare_op comp_value ;

log_expr : filter ('and' | 'or' filter)+;

param_path : ; 

compare_op : 'eq' | 'ne' | 'ew' | 'sw' | 'co' | 'gt' | 'le' | 'ge' | 'le' | 'ap' | 'sa' | 'eb' | 'pr' | 'po' | 'ss' | 'sb' | 'in' | 'ni' | 're' ;

compare_value : string | number_or_date | token ;

string : json ;

number_or_date : DIGIT (date_char)* ;

name_char : '_' | '-' | DIGIT | ALPHA ;

date_char : DIGIT | 'T' |'-' | '.' | '+' ;

json
   : value
   ;

obj
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;

pair
   : STRING ':' value
   ;

array
   : '[' value (',' value)* ']'
   | '[' ']'
   ;

value
   : STRING
   | NUMBER
   | obj
   | array
   | 'true'
   | 'false'
   | 'null'
   ;

TOKEN : 
  ( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*
  ;

ALPHA: [a-zA-z]+ ;

DIGIT: [0-9]+ ;

STRING
   : '"' (ESC | ~ ["\\])* '"'
   ;
fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;
fragment HEX
   : [0-9a-fA-F]
   ;
NUMBER
   : '-'? INT ('.' [0-9] +)? EXP?
   ;
fragment INT
   : '0' | [1-9] [0-9]*
   ;
// no leading zeros
fragment EXP
   : [Ee] [+\-]? INT
   ;
// \- since - means "range" inside [...]
WS
   : [ \t\n\r] + -> skip
   ;

//filter       = paramExp / logExp / ("not") "(" filter ")"
//logExp       = filter ("and" / "or" filter)+
//paramExp     = paramPath SP compareOp SP compValue
//compareOp    = (see table below)
//compValue    = string / numberOrDate / token
//string       = json string
//token        = any sequence of non-whitespace characters (by Unicode rules) except "]" and ")"
//paramPath    = paramName (("[" filter "]") "." paramPath)
//paramName    = ALPHA (nameChar)*
//nameChar     = "_" / "-" / DIGIT / ALPHA
//numberOrDate = DIGIT (DateChar)*
//dateChar     = DIGIT / "T" / "-" / "." / "+"