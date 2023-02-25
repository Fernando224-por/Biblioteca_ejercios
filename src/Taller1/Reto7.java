package Taller1;
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) throws Exception {
        Scanner dates =new Scanner (System.in);
        System.out.println("el dia de hoy es el aniversario de Supermercados Noe");
        System.out.println("primero digite el valor de su compra");
        int valueAdquired = dates.nextInt();
        int desc;
        int totalValue;
        if (valueAdquired<50000) {
            System.out.println("su valor de compra no aplica en el sorteo");
        }
        else{
            System.out.println("si en el sorteo saca una pelota blanca su compra es total mente gratis");
            System.out.println("si en el sorteo saca una pelota amarilla su compra tiene un 50% de descuento");
            System.out.println("si en el sorteo saca una pelota azul su compra tiene el 30% de descuento");
            System.out.println("si en el sorteo saca una pelota roja su compra tiene un 10% de descuento");
            int valueRandom = (int)Math.floor(Math.random()*4+1);
                if(valueRandom==1){
                    System.out.println("felicitaciones, su compra es totalmente gratis");
                }
                else if(valueRandom==2){
                    System.out.println("Usted saco una pelota amarilla, su compra tiene un 50% de descuento");
                    desc=(valueAdquired*50)/100;
                    totalValue=valueAdquired-desc;
                    System.out.println("el valor de descuento de su compra es "+desc+" el valor total a pagar es "+totalValue);
                }
                else if(valueRandom==3){
                    System.out.println("Usted saco una pelota azul, su compra tiene un 30% de descuento");
                    desc=(valueAdquired*30)/100;
                    totalValue=valueAdquired-desc;
                    System.out.println("el valor de descuento de su compra es "+desc+" el valor total a pagar es "+totalValue);
                }
                else if(valueRandom==4){
                    System.out.println("Usted saco una pelota roja, su compra tiene un 10% de descuento");
                    desc=(valueAdquired*10)/100;
                    totalValue=valueAdquired-desc;
                    System.out.println("el valor de descuento de su compra es "+desc+" el valor total a pagar es "+totalValue);
                }
                else{
                    System.out.println("a ocurrido un error, intente de nuevo");
                }
        }
        dates.close();        
    }
}
