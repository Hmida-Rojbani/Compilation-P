package compilation;

public class Automate {

	public static boolean onlyOneB(String s) {
		char c;
		int i = 0;
		int etat = 0;
		while (i < s.length()) {
			c = s.charAt(i);
			if (c != 'a' && c != 'b')
				throw new IllegalArgumentException("only a and b is accepted");
			switch (etat) {
			case 0:
				if (c == 'b')
					etat = 1;
				break;
			case 1:
				if (c == 'b')
					etat = 2;
				break;

			case 2:
				break;
			}

			i++;

		}
		return etat == 1;
	}
	
	public static boolean validateInteger(String s) {
		char c;
		int i = 0;
		int etat = 0;
		while (i < s.length()) {
			c = s.charAt(i);
			if (c != '+' && c != '-' && !Character.isDigit(c))
				throw new IllegalArgumentException("only + and - and digit is accepted");
			switch (etat) {
			case 0:
				if (c == '+' || c == '-')
					etat = 1;
				else
					if(Character.isDigit(c))
						etat =2;
				break;
			case 1:
				if(Character.isDigit(c))
					etat = 2;
				else 
					etat = 3;
				break;

			case 2:
				if(!Character.isDigit(c))
					etat = 3;
				break;
			case 3: break;
			}

			i++;

		}
		return etat == 2;
	}
	
	public static boolean validateFraction(String s) {
		char c;
		int i = 0;
		int etat = 0;
		while (i < s.length()) {
			c = s.charAt(i);
			if (c != '+' && c != '-' && c != '/' && !Character.isDigit(c))
				throw new IllegalArgumentException("only + , - , / and digit is accepted");
			switch (etat) {
			case 0:
				if (c == '+' || c == '-')
					etat = 1;
				else
					if(Character.isDigit(c))
						etat =2;
				break;
			case 1:
				if(Character.isDigit(c))
					etat = 2;
				else 
					etat = 5;
				break;

			case 2:
				if(c == '/')
					etat = 3;
				else 
				if(!Character.isDigit(c))
					etat = 5;
				break;
			case 3: if(Character.isDigit(c))
				etat = 4;
					else
				etat = 5;
				break;
			case 4: if(!Character.isDigit(c))
				etat = 5;
			break;
			case 5: break;
			}

			i++;

		}
		return etat == 4;
	}


}
