package practice03;

public class RecursionExercise01 {
	public static void main(String[] args) {
		/*
		案例
		1.请用递归的方式求出斐波那契数1，1，2，3，5，8，13。。。给你一个整数n，求出它的值是多少
		2.猴子吃桃子问题:有一堆桃子,猴子第一个吃了其中的一半,并在多吃了一个！以后每天猴子都吃其中的一半，
		  然后在多吃一个.当到第10天时，想再吃时（即还没吃），发现只有1个桃子了。问题:最初共有多少桃子？
		 */
//		T f1 = new T();
//		int res = f1.fibonacci(10);
//		System.out.println("当n=10 对应的斐波那契=" + res);
		T a1 = new T();
		int day = a1.hzct(10);//总天数
		System.out.println("第"+ day +"有多少个桃子" + a1.hzct(9));
	}
}
class T {
	/*
	请用递归的方式求出斐波那契数1，1，2，3，5，8，13。。。给你一个整数n，求出它的值是多少
	思路分析
	1.当n = 1 斐波那契数 是 1
	2.当n = 2 斐波那契数 是 1
	3.当n >= 3 斐波那契数 是前两个数的和
	4.if 判断 n 小于等于 1 的时候运行 if 里的代码  否则
	  System.out.println("n不符合，要求输入的n>=1的整数");
	  返回 return -1;
	5.这里就是一个递归的思路
	 */
	public int fibonacci(int n){
		if (n >= 1) {
			if (n == 1 || n == 2) {
				return 1;
			}else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		}else {
			System.out.println("n不符合，要求输入的n>=1的整数");
			return -1;
		}
	}
	/*
	猴子吃桃子问题:有一堆桃子,猴子第一个吃了其中的一半,并在多吃了一个！以后每天猴子都吃其中的一半，
	然后在多吃一个.当到第10天时，想再吃时（即还没吃），发现只有1个桃子了。问题:最初共有多少桃子？
	思路分析
	1.day 设置天数 10;
	2.第10天只剩1个
	  day10 用前一天的桃子 + 1     2
	3.第9天 时 (day10 + 1) * 2;   4
	4.第8天 时 (day9 + 1) * 2;    10
	5.规律: 前一天的桃子 = （后一天的桃子 + 1 ） * 2
	6.用 if 判断 是否天数是否为 1-10 诺为其他则输出没有这个数
	 */
	public int hzct(int day){
		if (day == 10){
			return 1;
		}else if (day >= 1 && day <= 9){
			return (hzct(day + 1) + 1) * 2;
		}else{
			System.out.println("没有这个数");
			return -1;
		}
	}

}

