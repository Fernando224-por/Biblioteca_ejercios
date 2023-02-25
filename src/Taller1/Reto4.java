package Taller1;
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) throws Exception{
        Scanner dates =new Scanner (System.in);
        System.out.println("Bienvenido al simulador de Piedra, Papel o Tijera");
        System.out.println("para jugar debe escojer:");
        System.out.println("1-para jugar con piedra,2-para papel y 3-para jugar con las tijeras");
        int dataCaptured=dates.nextInt();
        int valueRandom = (int)Math.floor(Math.random()*3+1);
        //inicio logica de simulacion 
        
        if (dataCaptured==2 && valueRandom==1) {// casos en donde gana el usuario
            System.out.println("El papel envuelve a la piedra, el usuario gano");
        }
        else if(dataCaptured==1 && valueRandom==3){
            System.out.println("La piedra rompe a las tijeras, el usuario gano");
        }  
        else if(dataCaptured==3 && valueRandom==2){
            System.out.println("Las tijeras rompen el papel, el usuario gano");
        }//fin de casos usuario

        else if(dataCaptured==1 && valueRandom==2){// casos en donde gana la maquina
            System.out.println("El papel envuelve a la piedra, el usuario perdio");
        }
        else if(dataCaptured==3 && valueRandom==1){
            System.out.println("La piedra rompe a las tijeras, el usuario perdio");
        }
        else if(dataCaptured==2 && valueRandom==3){
            System.out.println("Las tijeras rompen el papel, el usuario perdio");
        }//fin de casos maquina

        else if(dataCaptured==1 && valueRandom==1){//empate
            System.out.println("ambos han seleccionado piedra, Empate");
        }
        else if(dataCaptured==2 && valueRandom==2){
            System.out.println("ambos han seleccionado papel, Empate");
        }   
        else if(dataCaptured==3 && valueRandom==3){
            System.out.println("ambos han seleccionado tijeras, Empate");
        }//fin casos empate 

        else{
            System.out.println("a ocurrido un error, intente de nuevo");
        } 
        dates.close();
        
    }
}
