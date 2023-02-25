package Taller1;
import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) throws Exception {
        Scanner dates =new Scanner (System.in);
        System.out.println("el dia de hoy es el aniversario de Supermercados Noe");
        int precio,cantidad,subtotal;
        int acumulador= 0;
        int desc,totalValue;
        int cant=dates.nextInt();
        System.out.println("cuantos productos desea registrar");
        for(int i=1;i<=cant;i++){
            System.out.println("iteracion numero"+ i);
            System.out.println("digite el precio del producto");
            precio=dates.nextInt();
            System.out.println("diite la cantidad del producto");
            cantidad=dates.nextInt();
            subtotal=precio*cantidad;
            acumulador= acumulador+subtotal;
        }
        if (acumulador<50000) {
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
                    desc=(acumulador*50)/100;
                    totalValue=acumulador-desc;
                    System.out.println("¿con cuanto dinero va a pagar?");
                    int valueAdquired=dates.nextInt(), total;
                    total=valueAdquired-totalValue;
                    System.out.println("el valor de descuento de su compra es "+desc+" el valor total a pagar es "+totalValue);
                    System.out.println("el cambio es "+total);
                }
                else if(valueRandom==3){
                    System.out.println("Usted saco una pelota azul, su compra tiene un 30% de descuento");
                    desc=(acumulador*30)/100;
                    totalValue=acumulador-desc;
                    System.out.println("¿con cuanto dinero va a pagar?");
                    int valueAdquired=dates.nextInt(), total;
                    total=valueAdquired-totalValue;
                    System.out.println("el valor de descuento de su compra es "+desc+" el valor total a pagar es "+totalValue);
                    System.out.println("el cambio es "+total);
                }
                else if(valueRandom==4){
                    System.out.println("Usted saco una pelota roja, su compra tiene un 10% de descuento");
                    desc=(acumulador*10)/100;
                    totalValue=acumulador-desc;
                    System.out.println("¿con cuanto dinero va a pagar?");
                    int valueAdquired=dates.nextInt(), total;
                    total=valueAdquired-totalValue;
                    System.out.println("el valor de descuento de su compra es "+desc+" el valor total a pagar es "+totalValue);
                    System.out.println("el cambio es "+total);
                }
                else{
                    System.out.println("a ocurrido un error, intente de nuevo");
                }
        }
        dates.close();
    } 
}
