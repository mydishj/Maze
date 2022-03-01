package practice;

public class practice07 {
	public static void main(String[] args) {
		/*
		* 案例
		* 输出小写的a-z以及大写的Z-A
		* 思路分析
		* 此案例对 a - z编码和for的综合使用练习
		* Ascii编码表
		* 'b' = 'a'+1
		* 'c' = 'a'+2
		* 使用for
		* */
		for (char num = 'a';num <= 'z';num++){
			System.out.print(num + " ");
		}
		System.out.println(" ");
		for (char num = 'Z';num >= 'A';num--){
			System.out.print(num + " ");
		}
	}
}
