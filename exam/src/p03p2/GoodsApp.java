package p03p2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 상품 정보 담을 배열 생성
		Goods[] goods = new Goods[COUNT_GOODS];
		
		for (int i=0; i<goods.length; i++) {
			String s = scanner.nextLine();
			String[] g = s.split(" ");
			Goods gd = new Goods(g[0], Integer.parseInt(g[1]), Integer.parseInt(g[2]));
			goods[i] = gd;
		}
				
		//상품 정보 출력
		for (int i=0; i<goods.length; i++) {
			System.out.println(goods[i].getName() + "(가격:" + goods[i].getPrice() + "원)이 " + goods[i].getCountStock() + "개 입고 되었습니다.");
		}
		// 자원정리
	}
}
