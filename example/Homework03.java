package example;

public class Homework03 {
	public static void main(String[] args) {
		int num1 = 1;
		while (num1 < 10){
			System.out.println(num1);
			if (num1 < 5){
				break;
			}
			num1 += 2;
		}
	}
}
