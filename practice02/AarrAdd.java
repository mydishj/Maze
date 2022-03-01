package practice02;
import java.util.Scanner;
public class AarrAdd {
	public static void main(String[] args) {
		/*案例:实现动态的给数组添加元素效果,实现对数组扩容.
		1.原始数组使用静态分配int[]arr=[1,2,3,]
		2.增加的元素，直接放在数组的最后 arr=[1,2,3,4] arrNew=[1,2,3,4]
		3.用户可以通过如下方法来决定是否添加？ y/n
		思路分析
		1.定义初始数组 int[] arr = {1,2,3}
		2.定义一个新的数组 int[] arrNew = new int[arr.length + 1];
		3.遍历 arr 数组，依次将arr的元素拷贝到arrNew 数组
		4.将 4 赋值 给 arrNew[arr.length - 1] = 4;把4赋值给arrNew最后一个元素
		5.让 arr 指向 arrNew; arr = arrNew;那么原来的arr数组就被销毁
		6.创建Scanner 可以接受用户输入
		7.因为用户不确定什么时候退出 ， 使用 do-while + break;
		 */
		Scanner myScanner = new Scanner(System.in);
		int [] arr = {1,2,3};
		while (true) {
			int[] arrNew = new int[arr.length + 1];
			//遍历数组
			for (int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			//请输入你要添加的元素
			System.out.println("请输入你要添加的元素");
			int add = myScanner.nextInt();
			//把4赋值给arrNew最后一个元素
			arrNew[arrNew.length - 1] = add;
			//让 arr 指向arrNew
			arr = arrNew;
			for (int f = 0; f < arr.length; f++) {
				System.out.print(arr[f] + " ");
			}
			//用户是否继续
			System.out.println("是否继续添加  y/n");
			char key = myScanner.next().charAt(0);
			if (key == 'n') {
				//如果为no则继续
				break;
			}
		}
		System.out.println("退出程序");
	}
}
