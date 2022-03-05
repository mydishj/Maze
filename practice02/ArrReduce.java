package practice02;
import java.util.Scanner;
public class ArrReduce {
	public static void main(String[] args) {
		/*
		案例
		有一个数组{1，2，3，4，5}，可以将该数组进行缩减，提示用户是否继续缩减
		，每次缩减的最后一个元素，提示，不能在缩减。
		思路分析
		1.定义一个初始数组 int[] arr = {1,2,3,4,5}
		2.创建一个新数组 int[] arrNew = new int[arr.length - 1];
		3.遍历arr数组,将arr的元素拷贝到 arrNew数组
		4.输出缩减完成的值 System.out.println("缩减完成,本次缩减元素为" + arr[arr.length - 1]);
		5.让 arr 指向 arrNew  arr = arrNew;
		6.输出arr数组缩减后的值
		7.创建Scanner 可以接受用户输入
		8.因为用户不确定什么时候退出 ， 使用 IF ELSE + break;
		*/
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5};
		do {
			int[] arrNew = new int[arr.length - 1];
			//遍历arr数组,将arr的元素拷贝到 arrNew数组
			for (int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("缩减完成,本次缩减元素为" + arr[arr.length - 1]);
			//让 arr 指向arrNew
			arr = arrNew;
			System.out.println("arr数组缩减后的值: ");
			for (int i = 0;i < arr.length;i++){
				System.out.println(arr[i] + " ");
			}
			if (arr.length == 1) {
				System.out.println("数组现在为最后一个，不能继续了");
				break;
			}
			//用户是否继续
			System.out.println("是否继续添加  y/n");
			while(true) {
				char key = myScanner.next().charAt(0);
				if (key == 'y') {
					//如果为no则继续
					break;
				}else{
					System.out.println("输入错误，请重新输入");
				}
			}
		}while (true);
		System.out.println("退出程序 ");
	}
}
