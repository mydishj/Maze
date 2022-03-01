package practice;
import java.util.Scanner;
public class practice03 {
    public static void main(String[] args) {
//     案例   根据输入的年份判断是否是闰年？
//        分析
//        使用 import java.util.Scanner 获取到年份
//        后用if else 进行是否为闰年的判断
//        闰年的判断规则如下：
//        1.若某个年份能被4整除但不能被100整除，则是闰年。
//        2.若某个年份能被400整除，则也是闰年。
    Scanner Scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = Scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println(year+ "是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
    }
}
