package Taller1;
import java.util.Scanner;
public class notas {
    public static void main(String[] args) throws Exception {
        Scanner dates =new Scanner (System.in);
        double dataCaptured;
        double acumulador=0;
        double promed;
        for(int i =1;i<=4;i++){
            System.out.println("buenos dias, digite la nota de el taller "+i+" realizado en clase");
            dataCaptured=dates.nextDouble();
            acumulador=acumulador+dataCaptured;
        }
        promed=acumulador/4;
        System.out.println("su promedio es "+promed);
        if ( promed>=0.0 && promed<=2.9) {
            
            System.out.println("Reprobaste la asignatura");
        }
        else if(promed >=3.0 && promed <= 4.0){
            System.out.println("su promedio es "+promed);
            System.out.println("Pasaste la asignatura raspando");
        }
        else if(promed>4.0){
            System.out.println("su promedio es "+promed);
            System.out.println("aprobaste con buenos resultados");
        }
        else{
            System.out.println("su promedio es "+promed);
            System.out.println("el rango de valor es iexistente, intente de nuevo");
        }
        dates.close();
      }  
}
