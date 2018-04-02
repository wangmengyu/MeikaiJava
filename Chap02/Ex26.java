import java.util.Scanner;
class Ex26{
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("求三角形面积");
        System.out.print("底：");
        double s = stdIn.nextDouble();
        System.out.print("高:");
        double h = stdIn.nextDouble();
        System.out.println("面积是:" + 0.5 * (s*h));
    }

}