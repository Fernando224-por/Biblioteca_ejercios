package Arrays;
import java.util.Scanner;
public class Reto3Expend {
    public static void main(String[] args) throws Exception{
        Scanner dates =new Scanner (System.in);
        String[][] matriz1=new String[4][4];
        int [] [] matriz2=new int [4][4];
        for(int f=0;f<4;f++){
            for(int c=0;c<4;c++){
                System.out.println("ingrese nombre del producto y el precio en la fila "+f+" y su columna "+c );
                matriz1[f][c]=dates.nextLine();
                matriz2[f][c]=dates.nextInt();
                dates.nextLine();
            }
               
        }//el problema radica en que en el primer for "relleno del arreglo", anide la impresion de su contenido, por lo cual se ejecutaba una sola vez y los espacios faltantes aparecian vacios
        //debo fijarme mas en donde defino el codigo.
        System.out.println("los productos ordenados son");
        for(int f=0;f<4;f++){
            for(int c=0;c<4;c++){
                System.out.println(matriz1[f][c]+"\t");
                System.out.println(matriz2[f][c]+"\t");
            }
        } 
        dates.close();
    }
}
