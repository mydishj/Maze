package practice;

public class practice08 {
	public static void main(String[] args) {
		 /*
		 * 案例
		 * 求出1-1/2+1/3-1/4+1...1/100的和
		 * 思路分析
		 * 1.求出1-1/2+1/3+1/4+1...1/100 == (1/1)-(1/2)+(1/3)-(1/4).....(1/100)
		 * 2.从上面的分析我们可以看到
		 * （1）一共有100数，分子为1 ，分母从1-100当分母是偶数时，前面是-
		 * （2）还发现 当分母为奇数时前面是 + ， 当分母是偶数时 ，前面是 -
		 * 3.我们可以使用 for + if 即可完成
		 * 4.结果存放到 double sum
		 * 5.这里有个隐藏的陷阱，要把公式分子 1 写出1.0才能得到精确的小数 也可以for int类型改成double类型
		 * 代码
		 * */
		double sum = 0;
		for (double i = 1; i <= 100; i++) {
			//判断是奇数还是偶数，然后做出不同的处理
			if (i % 2 != 0){//分母为奇数
				sum += 1/i;
			}else{
				sum -= 1/i;
			}
		}
		System.out.println("sum=" + sum);
	}
}
