import java.util.Random;
import java.util.Scanner;
class Ex28{
    public static void main(String arg[]){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int num = stdIn.nextInt();
        Random rand = new Random();
        int randNum = num+(rand.nextInt(10) - 5);
        System.out.println("生成了该值+-5范围的随机数："+ randNum);
    }

}