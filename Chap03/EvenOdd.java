import java.util.Scanner;
class EvenOdd{
    public static void main(String arg[]) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = stdIn.nextInt();

        if (num > 0) {
            if (num%2 ==0) {
                System.out.println(num+"是偶数");
            } else {
                System.out.println(num+"是奇数");
            }
        } else {
            System.out.println(num+"不是正数");
        }

    }

}