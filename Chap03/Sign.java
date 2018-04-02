import java.util.Scanner;
class Sign{
    public static void main(String args[]) {
        System.out.print("请输入一个整数:");
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        if (num>0) {
            System.out.println(num+"大于0");
        } else if (num < 0) {
            System.out.println(num+"小于0");
        } else {
            System.out.println(num+"等于0");
        }
    }

}