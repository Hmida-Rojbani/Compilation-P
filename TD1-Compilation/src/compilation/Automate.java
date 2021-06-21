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

}
