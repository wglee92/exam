package p03calc;


import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = scanner.nextLine();
			String[] str = input.split(" ");
			Arith cal = null;

			if (input.equals("quit"))
				break;
			else if (str.length != 3) {
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}
			switch(str[1]) {
				case "+": {
					cal = new Add();
					break;
				}
				case "-": {
					cal = new Sub();
					break;
				}
				case "*": {
					cal = new Mul();
					break;
				}
				case "/": {
					cal = new Div();
					break;
				}
				default : {
					break;
				}
		}
		cal.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
		System.out.println(">>" + cal.calculate());
		}
	}
}
