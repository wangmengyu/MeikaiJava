import java.util.Scanner;
class PositiveNot{
    public static void main(String[] args) {
        System.out.print("请输入整数：");
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        if(num > 0) {
            System.out.println(num+"是正数");
        } else {
            System.out.println(num+"是负数或者0");
        }
    }

}