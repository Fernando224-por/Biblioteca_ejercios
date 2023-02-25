package Taller1;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) throws Exception{
        Scanner dates =new Scanner (System.in);
        System.out.println("Cuantos meses de nacido tiene el bebe");
        int month= dates.nextInt();
        if(month<12){
        System.out.println("Cuanto pesa el recien nacido");
        float weigth= dates.nextFloat();
        System.out.println("la dosis del recien nacido es: "+ (weigth+10)/(month*10 )*8 + "ml");
        }
        else{
            System.out.println("El niño no es apto para la vacuna");
        }
    dates.close();
}
}
