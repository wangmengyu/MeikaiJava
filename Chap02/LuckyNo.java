import java.util.Random;
class LuckyNo{
    public static void main(String args[]) {
        Random rand = new Random();//随机数对象
        int num = rand.nextInt(10);//0-9的随机数
        System.out.println("今天的随机数是："+ num);
    }

}