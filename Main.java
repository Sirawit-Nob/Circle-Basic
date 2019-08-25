import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circle circle = new Circle(r);
        //circle.getRadius(r);
        System.out.println(circle.Area());
        System.out.println(circle.circumference());
    }
}
