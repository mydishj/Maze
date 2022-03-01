package practice;
import java.util.Scanner;
public class practice02 {
    public static void main(String[] args) {
    //案例
        // 实现判断一个整数，属于那个范围:大于0;小于0;等于0;
//        思路分析
//                使用 import java.util.Scanner 获取到整数
//                在用while循环内嵌if elseif else 进行判断
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数");
        int num01 = scanner.nextInt();
        while (true) {
            if (num01 > 0) {
                System.out.println(num01 + "大于0");
                break;
            } else if (num01 < 0) {
                System.out.println(num01 + "小于0");
                break;
            } else if (num01 == 0) {
                System.out.println(num01 + "等于0");
                break;
            } else {
                break;
            }
        }
    }
}
