package practice02;
import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		/*
		案例
		有一个数列: 白眉鹰王,金毛狮王,紫衫龙王,青翼蝠王猜数游戏:从键盘中任意输入一个名称
		判断数列中是否包含此名称[顺序查询] 要求:如果找到了，就提示找到，并给出下标值。

		思路分析
		1.定义一个字符串数组
		2.接受用户输入，遍历数组，逐一比较，如果有，则提示信息，并退出
		 */
		String[] Namedo = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String Namefind = myScanner.next();
		int index = -1;
		for (int i = 0; i < Namedo.length; i++){
			//支付串对比
			if (Namefind.equals(Namedo[i])) {
				System.out.println("恭喜你找到" + Namefind);
				System.out.println("下标为=" + i);
				//把i保存到 index
				index = i;
				//退出
				break;
			}
		}
		if (index == -1){
			System.out.println("没有找到" + Namefind);
		}
	}
}
