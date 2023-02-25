package Taller1;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) throws Exception{
        Scanner temperature =new Scanner (System.in);
        System.out.println("digite los grados fahrenheit");
        short grade;
        grade=temperature.nextShort ();
        double centigrados;
        centigrados=(grade-32)/1.8;
        System.out.println("En grados Celcius su temperatura es "+ centigrados);
        temperature.close();
    }
}