class ArvoreSintatica{}

class Exp extends ArvoreSintatica{}

class Num extends Exp{
 	int num;
	Num(int num){this.num=num;}
}

class Operador extends Exp{
	Exp arg1;
	Exp arg2;
	Operador (Exp a1, Exp a2) { arg1=a1; arg2=a2;}
}

class Soma extends Operador{
	
	Soma (Exp a1, Exp a2) { super(a1,a2);}
}

class Mult extends Operador{
	Mult (Exp a1, Exp a2) { super(a1,a2);}
}
