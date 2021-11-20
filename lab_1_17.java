import java.util.Scanner;
public class lab_1_17 {
	public static void QuestionsTwenty() {
		System.out.println("Задумайте число від 1 до 1 000 000");
		int left = 1;
		int right = 1000001;
		Scanner in = new Scanner(System.in);
		int command = 0;
		int guess = 0;
		for (int i = 1; i<=20;i++) {
			guess = (left + right)/2;
			System.out.println("Ваше число більше, менше чи рівне " + guess +"?\nЯкщо більше, то введіть 1, якщо менше, то введіть 2, якщо дорівнює то введіть 3");
			command = in.nextInt();
			if (command == 1) left = guess;
			if (command == 2) right = guess;
			if (command == 3) break;
		}
		in.close();
		System.out.println("Ваше число - " + guess);
	}
	public static void main(String[] args) {
		QuestionsTwenty();
		}
			
}

