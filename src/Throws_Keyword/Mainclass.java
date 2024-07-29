package Throws_Keyword;

public class Mainclass {
	public static void main(String[] args) {

		Demo d=new Demo();

		try {
			d.divide(10);	
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}



	}

}
