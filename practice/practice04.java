package practice;

public class practice04 {
    public static void main(String[] args) {
        /*
        *案例
        *判断一个数是否为水仙花数，所谓水仙花数是指一个3位数，其各个位数上数字立方和等于本身。
        * 例如: 153 = 1*1*1+5*5*5+3*3*3
        *
        *思路分析
        * 1.定义一个变量为 int num = 153
        * 2.先得到num的百位,十位,个位,各位的数字，使用if判断他们的立方和是否相等
        * num的百位  num = num / 100
        * num的十位  num = num % 100 / 10
        * num的个位  num = num % 10
        * 3.完事判断即可
        *
        * 代码
        * */
        int num = 153;
        int num2 = num / 100;
        int num3 = num % 100 / 10;
        int num4 = num % 10;
        if (num2 * num2 * num2 + num3 * num3 * num3 + num4 * num4 * num4 == num){
            System.out.println(num + "为水仙花数");
        }
    }
}
