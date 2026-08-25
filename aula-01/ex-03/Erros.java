public class Erros{
	public static void main(String[] args){
		System.out.println("Erro faltando ;");
		/*
		Erros.java:3: error: ';' expected
                System.out.println("Erro faltando ;")
                                                     ^
		*/

		System.out.println("Erro nome método");
		/*
		Erros.java:9: error: cannot find symbol
                System.out.prinln("Erro nome método");
               	               ^
  		symbol:   method prinln(String)
  		location: variable out of type PrintStream
		*/
		
	}
/*
Erros.java:19: error: reached end of file while parsing
        }
         ^
1 error
*/
}
