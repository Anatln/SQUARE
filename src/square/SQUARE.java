/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class SQUARE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        System.out.println("Введите радиус круга.");
//        Scanner sn = new Scanner(System.in);
//        double R;
//        R=sn.nextDouble();
//        double S;
//        S= Math.PI*R*R;
//        System.out.println("Площадь круга = "+S);
//    
    
//        System.out.println("Введите сторону а...");
//        Scanner sn = new Scanner (System.in);
//        double a=sn.nextDouble();
//        System.out.println("Введите сторону b...");
//        double b = sn.nextDouble();
//    double perimetr;
//    perimetr=(a+b)*2;
//        System.out.println("Периметр равен: "+perimetr);
//        double square;
//        square = a*b;
//        System.out.println("Площадь равна: "+square);
        System.out.println("Введите катет");
        Scanner sn = new Scanner (System.in);
        double a=sn.nextDouble();
        System.out.println("Введите гипотенузу");
        double c=sn.nextDouble();
    double b;
    b= sqrt (c*c-a*a);
    double S;
    S= (a*b)/2;
        System.out.println("Площадь равна: "+ S);
    }
    
}
