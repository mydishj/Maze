package practice;

public class practice01 {
    public static void main(String[] args) {
//        案例
//           某人有十万块，每经过一次路口，都需交费，规则如下
//           1.当现金>5万时，每次交5%
//           2.当现金<=5万时，每次交1000
//           编程计算该人可以经过多少次路口i，要求使用 while break 方式完成
        //分析思路
             //1.定义一个 double money = 100000;表示钱
             //2.count为计数
             //3.钱有三种情况
             //money > 50000
             //money > 1000
             //money < 1000,钱不够的情况，钱不够则用break结束
             //4.使用while循环（死循环）用if elseif else 来进行判断多种情况
        double money = 100000;
        int count = 0;
        while(true){
           if (money > 50000){
               money = money - money * 0.05;
               count++;
           }else if (money >= 1000){
               money = money - 1000;
               count++;
           }else {
               break;
           }
        }
        System.out.println(money+"这钱可以走"+count+"次");
    }
}
