package CharpterTwo;

import java.util.Scanner;

public class Length{

    public static void main(String[] arg){

        Scanner data =new Scanner(System.in);

        System.out.println("enter velocity");

        double v=data.nextDouble();

        System.out.println("enter acceleration");

        double a=data.nextDouble();

        double result=(v*v) / (2 * a);

        System.out.printf("%.2f %n", result);


    }
}