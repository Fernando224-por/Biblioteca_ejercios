package Arrays;
import java.util.Scanner;
public class Reto1notas {
    public static void main(String[] args) throws Exception {
        Scanner dates =new Scanner (System.in);
        int t;
        float subNotes=0;
        float total;
        System.out.println("cuantas notas pretende promediar?");
        t=dates.nextInt();
        float notes[]=new float[t];
        for (int i =0;i<notes.length;i++){
            System.out.println("ingrese una calificaion en la posicion "+i);
            notes[i]=dates.nextFloat();
        }
        for(int i=0;i<notes.length;i++){
            subNotes=subNotes+notes[i];
        }
        total=subNotes/t; 
        System.out.println("su promedio es "+total);
        if(total<3){
            System.out.println("usted reprobo");
        }
        else if(total>=3 && total<=4.0){
            System.out.println("aprobo raspando");
        }
        else if(total>4.0){
            System.out.println("usted aprobo con buenos resultados");
        }
        dates.close();
    }
}
