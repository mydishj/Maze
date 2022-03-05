package practice;

public class practice06 {
    public static void main(String[] args) {
/*
* 案例
* 输出1-100之间的不能被5整除的数，每5个一行
* 思路分析
* 1.先输出1-100的所有数
* 2.然后过滤出 不能够被 5 整除的数 i % 5 != 0
* 3.每5个一行，我们使用 int count 统计输出的个数 当 count % 5 == 0 时就说明已经输出了5个，这时，我们输出换行即可
* 代码
* */
        int count = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 5 != 0){
                count++;
                System.out.print(i + " ");
                //判断，每满5个，就输出一个换行
                if (count % 5 == 0 ){
                    System.out.println();
                }
            }
        }
    }
}
