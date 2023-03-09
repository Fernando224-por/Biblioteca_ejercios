package Arrays;
import java.util.Scanner;
public class Priarray {
    public static void main(String[] args) throws Exception {
    Scanner dates =new Scanner (System.in);

    /*int[]vector={30,50,25,85,12,60,32,41,23,63};
    //Definir un array
    int[]vector1=new int [10];
    
   /* vector1[5]=6;
        System.out.println(vector1[5]);*/
    
        /*for (int i=0;i<=9;i++){
            System.out.println(vector[i]);
        }
        dates.close();*/
    int []prueba=new int[5];
    prueba[0]=10;
    prueba[1]=20;
    prueba[2]=30;
    prueba[3]=40;
    prueba[4]=50;
        /*System.out.println(prueba[2]);*/
        /*for (int i : prueba) {
            System.out.println(i);
        }*/

        int [] prueba2=new int [5];//usuario llena datos
        for (int i =0;i<prueba2.length;i++){
            System.out.println("ingrese un numero en la posicion"+i);
        prueba2[i]=dates.nextInt();
        }
        for (int i : prueba2) {
            System.out.println(i);
        }
        dates.close();
}
}
