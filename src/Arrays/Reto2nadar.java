package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Reto2nadar {
    public static void main(String[] args) throws Exception{
        Scanner dates =new Scanner (System.in);
        int t;
        System.out.println("Cuantos competidores realizan la prueba de natacion?");
        t=dates.nextInt();
        float time[]=new float[t];
        String name []=new String[t];
        for(int i =0;i<time.length;i++){
            dates.nextLine(); //limpieza del buffer
            System.out.println("Digite el nombre del competidor"+i);
            name[i]=dates.nextLine();
            }
        for (int i =0;i<time.length;i++){
            System.out.println("Digite el tiempo del competidor"+i);
            time[i]=dates.nextFloat();
        }
        for(int i =0;i<time.length;i++){
            System.out.println("este es el nombre y tiempo de los competidores: ");
            System.out.println(name[i]);
            System.out.println(time[i]);
        }
        //de que forma puedo dafinir el menor tiempo posible para dar un ganador
        Arrays.sort(time);
        for (float i : time ) {
            System.out.println("los mejores tiempos son");
            System.out.println(i);
        }
        dates.close();
    }
    
}
