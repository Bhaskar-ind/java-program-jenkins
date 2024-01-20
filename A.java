import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition of both Number:"+c);
        int d=a-b;
        System.out.println("Subtraction of both Number:"+d);
        int e=a/b;
        System.out.println("Division of both Number:"+e);
        sc.close();
    }
}
