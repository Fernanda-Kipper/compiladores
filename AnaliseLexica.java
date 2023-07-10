import java.io.*;

enum TokenType{NUM, SOMA, MULT, APar, FPar, EOF, DIV, SUB}

class Token{
  String lexema;
  TokenType token;

 Token (String l, TokenType t)
 	{ lexema=l;token = t;}	

}

class AnaliseLexica {

	BufferedReader arquivo;

	char nextChar;

	AnaliseLexica(String a) throws Exception
	{
		
	 	this.arquivo = new BufferedReader(new FileReader(a));
		
	}

	Token getNextToken() throws Exception
	{	
		Token token;
		int eof = -1;
		char currchar;
		int currchar1;

			do{
				if((int) this.nextChar == 0) {
					currchar1 = arquivo.read();
					currchar =  (char) currchar1;
				} else {
					currchar = this.nextChar;
					currchar1 = this.nextChar;
				}
				this.nextChar = (char) arquivo.read();
			} while (currchar == '\n' || currchar == ' ' || currchar =='\t' || currchar == '\r');

			if(currchar1 != eof && currchar1 !=10 && currchar != Character.MAX_VALUE)
			{
				if (currchar >= '0' && currchar <= '9')
					if(this.nextChar >= '0' && this.nextChar <= '9') {
						var oldNextChar = this.nextChar;
						this.nextChar = (char) arquivo.read();
						return (new Token("" + currchar + oldNextChar, TokenType.NUM));
					}
					else {
						return (new Token("" + currchar, TokenType.NUM));
					}
				else
					switch (currchar){
						case '(':
							return (new Token ("" + currchar,TokenType.APar));
						case ')':
							return (new Token ("" + currchar,TokenType.FPar));
						case '+':
							return (new Token ("" + currchar,TokenType.SOMA));
						case '-':
							return (new Token ("" + currchar,TokenType.SUB));
						case '/':
							return (new Token ("" + currchar,TokenType.DIV));
						case '*':
							return (new Token ("" + currchar,TokenType.MULT));
						
						default: {
							System.out.println(currchar == ' ');
							throw (new Exception("Caractere inválido: " + ((int) currchar)));
						}
					}
			}

			arquivo.close();
			
		return (new Token("" + currchar,TokenType.EOF));
		
	}
}
