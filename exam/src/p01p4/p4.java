package p01p4;

import java.util.*;
public class p4 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		String x = sc.nextLine();
		for(int i=0; i<x.length(); i++) {
			for(int j=0; j<=i; j++ ) {
				System.out.print(x.charAt(j));
			}
			System.out.println();
		}
		
	}

}
