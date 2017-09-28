import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LuckyMoney {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.00");
            //输出为两位
            System.out.println("请输入红包总金额：");
            Double money = input.nextDouble();
            System.out.println("请输入红包个数：");
            int number = input.nextInt();
            System.out.println("各个红包所含金额分别为：");
            int t=number;
            double min = 0.01, max = money;
            for(;t>1;t--) {
                Random random = new Random();
                double s = random.nextDouble()*(max/t)*2;
                //红包金额上限为两倍剩余金额的平均值
                if(s==0)
                    s = min;
                max -= s;
                System.out.println(df.format(s));
            }
            System.out.print(df.format(max));
        }
}
