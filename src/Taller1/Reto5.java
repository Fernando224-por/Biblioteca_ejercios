package Taller1;
import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) throws Exception {
        Scanner dates =new Scanner (System.in);
        System.out.println("Digite su nombre y apellido");
        String name=dates.nextLine();
        String lastName=dates.nextLine(); 
        String nombreCompleto= name.concat(lastName) ;
        System.out.println(name.length());
        System.out.println(lastName.length());
        System.out.println(name.toUpperCase());
        System.out.println(lastName.toLowerCase());
        System.out.println(nombreCompleto);
        System.out.println(name.substring(0,2)+lastName);
        dates.close();
    } 
}
