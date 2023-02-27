package Taller1;
import java.util.Scanner;
public class Reto9 {
    public static void main(String[] args) throws Exception {
        System.out.println("bienvenido al simulador de carisello");
        System.out.println("Digite una cantidad para apostar, la cantidad minima para apostar es 500 pesos");
        Scanner dates =new Scanner (System.in);
        int bet=dates.nextInt();
        int globalBet=500;
        int acumulador=0,parcWinbet;
        int valueCaptured;
        int change=0;
        int i;
        if(bet<500){
            System.out.println("digite mas de 500 pesos, si no no apueste.....pobre XD");
        }
        else{
        System.out.println("¿cuantas veces quiere jugar?");
        change=dates.nextInt();
        for (i=0;i<=change;i++) {
        System.out.println("Escoga 1 si cree que la moneda caera cara, escoja 2 si cree que la moneda caera sello");
        valueCaptured=dates.nextInt();
        int valueRandom = (int)Math.floor(Math.random()*2+1);
            System.out.println("desea apostar mas dinero? 1 si.   2  no (si es la primera apuesta, haga caso omiso) ");
            int posibility = dates.nextInt();
            if(posibility == 1){
                System.out.println("Digite una cantidad para apostar, la cantidad minima para apostar es 500 pesos");
               int newBet=dates.nextInt();
               bet = newBet + acumulador;
            }
        else{
        if (valueCaptured==valueRandom){    
            System.out.println("usted gano");
            parcWinbet=bet*2;
            acumulador=parcWinbet+globalBet;
        }
        else{
            System.out.println("usted perdio");
            acumulador=bet-globalBet;
        }
        }
        }
        }
        System.out.println("ya se acabo el juego, usted jugo la cantidad de "+change);
        if (acumulador<0) {
            System.out.println ("usted a debe la cantidad de"+acumulador);
        }
        else if(acumulador>0){
            System.out.println("usted a ganado la cantidad de "+acumulador);
        }
        else{
            System.out.println("su saldo es 0");   
        }
        dates.close();
    }
}
