package Taller1;
import java.util.Scanner;
public class Reto9 {
    public static void main(String[] args) throws Exception {
        Scanner dates =new Scanner (System.in);
        /*int captureBet;*/
        int parcialBet;
        int posibilityCapture;
        int change=3;
        int i = 0;
        int newValue;
        int desitionPlayer;
        int subtotal=0;
        int valueRandom = (int)Math.floor(Math.random()*2+1);
        System.out.println("bienvenido al simulador de carisello");
        System.out.println("Digite una cantidad para apostar");
        subtotal=dates.nextInt();
        while (change==3) {
            System.out.println("de esos "+subtotal+" cuanto dinero usara?");
            parcialBet=dates.nextInt();
            System.out.println("Escoga 1 si cree que la moneda caera cara, escoja 2 si cree que la moneda caera sello");
            posibilityCapture=dates.nextInt();
                if (posibilityCapture==valueRandom) {
                    parcialBet=parcialBet*2;
                    subtotal=subtotal+parcialBet;
                        System.out.println("usted gano, su apuesta se duplica");
                        System.out.println("su saldo es "+subtotal);
                        System.out.println("quere ingresar una nueva cantidad de apuesta?1.si    2.no");
                        desitionPlayer=dates.nextInt();
                        if(desitionPlayer==1){
                            System.out.println("ingrese una nueva apuesta de dinero");
                            newValue=dates.nextInt();
                            subtotal=subtotal+newValue;
                            System.out.println("digite 3 para continua o 4 para detener la ejecucuion");
                            change=dates.nextInt();
                            i++;
                        }
                        else{
                            System.out.println("digite 3 para continua o 4 para detener la ejecucuion");
                            change=dates.nextInt();
                            i++;
                        }
                }
                else {
                    subtotal=subtotal-parcialBet;
                    System.out.println("usted perdio, su apuesta se restara a el valor total ingresado");
                    System.out.println("su saldo es "+subtotal);
                    System.out.println("usted quiere volver a jugar?");
                    System.out.println("quiere ingresar mas dinero par apostar?1.si    2.no");
                    desitionPlayer=dates.nextInt();
                        if(desitionPlayer==1){
                            System.out.println("ingrese una nueva cantidad de dinero");
                            newValue=dates.nextInt();
                            subtotal=subtotal+newValue;
                            System.out.println("digite 3 para continua o 4 para detener la ejecucuion");
                            change=dates.nextInt();
                            i++;
                        }
                        else{
                            System.out.println("digite 3 para continua o 4 para detener la ejecucuion");
                            change=dates.nextInt();
                            i++;
                        }
                }
        }
        System.out.println("usted jugo "+i+" veces");
        System.out.println("al final del juego usted obtuvo la cantidad de "+subtotal);
        dates.close();
    }
} 
