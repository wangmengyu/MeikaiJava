import java.util.Scanner;
class Ex210{
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("姓：");
        String firstName = stdIn.next();
        System.out.print("名：");
        String lastName = stdIn.next();
        System.out.println("您好"+firstName+lastName+"先生");

    }
}