package example;

public class Homework06 {
	public static void main(String[] args) {
		/*
		试写出以下代码的打印结果
		a,a
		b,b
		克,克
		d,d
		 */
		char[] arr = {'a','b','c','d'};
		char[] arr2 = arr;
		arr[2] = '克';
		for (int i = 0; i < arr2.length;i++){
			System.out.println(arr[i] + "," + arr2[i]);
		}

	}
}
