package p02p1;

import java.util.*;
public class p1 {

	public static void main(String[] args) {
		int change[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		System.out.print("금액 : ");
		Scanner sc = new Scanner(System.in);
		int Money = sc.nextInt();

		for(int i=0; i<change.length; i++) {
			int result = Money/change[i];
			Money -= result*change[i];
			System.out.println(change[i] + "원 : " + result + "개");
		}
		
	}

}
