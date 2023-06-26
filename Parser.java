class Parser{

	AnaliseLexica scanner;
	

	Parser(AnaliseLexica s)
	{
		scanner = s;
	}

	ArvoreSintatica parseProg() throws Exception
	{

		ArvoreSintatica resultado = Exp();
		Token tokenCorrente = scanner.getNextToken();
		if(tokenCorrente.token != TokenType.EOF)
					throw (new Exception("Estava esperando: EOF"));

		return resultado;
	 
	}

	Exp Exp() throws Exception
	{       Exp exp1, exp2;
		Token tokenCorrente =  scanner.getNextToken();

		if(tokenCorrente.token == TokenType.NUM)
			return new Num(Integer.parseInt(tokenCorrente.lexema+""));
		
		
		if(tokenCorrente.token == TokenType.APar)
			{
				exp1 = Exp();
				if(exp1 == null)
					throw (new Exception("Não encontrei expressão!"));
				
				Operador op = Op ();

				if (op == null)
					throw (new Exception("Não encontrei operador!"));

				exp2 = Exp();
				if(exp2 == null)
					throw (new Exception("Não enconrtrei expressão!"));	
				
				op.arg1 = exp1;
				op.arg2 = exp2;
				tokenCorrente =  scanner.getNextToken();
				if(tokenCorrente.token != TokenType.FPar)
					throw (new Exception("Estava esperando:)"));
				return op;
								
			} else throw (new Exception ("Estava esperando: ( ou <NUM>"));

		//return null;
		
	}

	Operador Op () throws Exception
		{
		
		Token tokenCorrente = scanner.getNextToken();
		switch(tokenCorrente.token){
			case SOMA:
				return new Soma(null,null);
			case MULT:
				return new Mult(null,null);
			default: 
		}
		return null;
			

		}

}
