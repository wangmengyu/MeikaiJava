import java.util.Random;
class Ex29{
    public static void main(String args[]) {
        Random rand = new Random();
        double randNum = rand.nextDouble();
        System.out.println("随机显示大于等于0,小于1.0的实数值:"+randNum);


        double numPlusTen = 9+rand.nextDouble();
        System.out.println("随机显示大于等于0,小于10.0的实数值:"+numPlusTen);

        double numOne = rand.nextDouble();// 0-1的小数;0.4，等待做乘法
        int randInt = rand.nextInt(2)-1;// -1 -- +1的整数

        System.out.println("-1到+1的浮点数：" + (numOne*randInt));

    }
}