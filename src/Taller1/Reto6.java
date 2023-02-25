package Taller1;
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) throws Exception {
        Scanner dates =new Scanner (System.in);
        System.out.println("Bienvenido al Simulador de CARPS");
        System.out.println("solo se puede ganar con si se logra sacar las siguientes opciones");
        System.out.println("un par de 1 en los dados");
        System.out.println("un total de 3 en los dados");
        System.out.println("un total de 11 en los dados");
        System.out.println("si se obtiene 2 o 12 en los datos");
        System.out.println("un total de 7 en los dados");
        int valueRandom1 = (int)Math.floor(Math.random()*6+1);
        int valueRandom2 = (int)Math.floor(Math.random()*6+1);
        System.out.println("Dado uno "+valueRandom1);
        System.out.println("Dado dos "+valueRandom2);
        if (valueRandom1==1 && valueRandom2==1 ) {
            System.out.println("usted gano por par de 1");
        }
        else if(valueRandom1+valueRandom2==3 || valueRandom1+valueRandom2==11 || valueRandom1+valueRandom2==7 ){
            System.out.println("usted gano por un total de 3 o 11 o 7 en los dados");
        }
        else if(valueRandom1+valueRandom2==12 || valueRandom1+valueRandom2==2 ){
            System.out.println("usted gano por un total de 2 o 12 en los dados");
        }
        else{
            System.out.println("usted a perdido, intente de nuevo");
    }
    dates.close();
    
}
}
