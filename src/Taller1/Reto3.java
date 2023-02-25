package Taller1;
import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) throws Exception{
        Scanner dates =new Scanner (System.in);
        System.out.println("Escoga 1 si cree que la moneda caera cara, escoja 2 si cree que la moneda caera sello");
        int valueCaptured=dates.nextInt();
        int valueRandom = (int)Math.floor(Math.random()*2+1);
        if (valueCaptured==valueRandom){
            System.out.println("usted gano");
        }
        else{
            System.out.println("usted perdio");    
        }
        dates.close();
    }  
}
