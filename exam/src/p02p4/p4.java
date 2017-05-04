package p02p4;

public class p4 {
	public static char[] reverse(String str) {
		char[] s = str.toCharArray();
		for(int i=0; i<s.length/2; i++) {
			char temp = s[i];
			s[i] = s[s.length-1-i];
			s[s.length-1-i] = temp;
		}
		return s;
		
	}
	
	public static void printCharArray(char[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
}


