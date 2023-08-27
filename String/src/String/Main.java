package String;

public class Main {

	public static void main(String[] args) {
		String a = "aprender";
		System.out.println("String : " + a);
		String str = new String("aprender");
		System.out.println("String 2 = "+str);
		String a1 = new String("aprender");
		String a2 = new String("Praticar");
		String a3 = new String("estudar");
		String a4 = new String("estudar");
		String input1 = "aprender";
		
		
		
		System.out.println("comparar :"+ a1 +" e "+ a2 +" : "+ a1.equals(a2));
		
		System.out.println("comparar :"+ a3 +" e "+ a4 +" : "+ a3.equals(a4));
		
		System.out.println("comparar :"+ a1 +" e "+ a4 +" : "+ a1.equals(a4));
	}

}
