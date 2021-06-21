package compilation;

import java.util.Scanner;
import static compilation.Automate.onlyOneB;

public class Test {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		System.out.println("give the word to test");
		String s = sc.next();
		if(onlyOneB(s))
			System.out.println("String is valid");
		else
			System.out.println("String is invalid");
		}catch(IllegalArgumentException e) {
			System.err.println("wrong alphabet is used");
		}
	}

}
