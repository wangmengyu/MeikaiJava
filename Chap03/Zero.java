import java.util.Scanner;
class Zero {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("请输入整数");
        int num = stdIn.nextInt();
        if (!(num==0)) {
            System.out.println("您输入的"+num+"不等于0");
        } else {
            System.out.println("您输入的"+num+"等于0");
        }
    }
}