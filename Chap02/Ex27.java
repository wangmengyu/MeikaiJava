import java.util.Random;
class Ex27 {
    public static void main(String args[]) {
        Random rand = new Random();
        int num = rand.nextInt(9);
        System.out.println("1-9的随机数:" + num);
        int num2 = (-1) * rand.nextInt(9);
        System.out.println("-9 -  -1的随机数："+num2);
        int num3 = rand.nextInt(89) + 10;
        System.out.println("10-99的随机数:" + num3);

    }
}