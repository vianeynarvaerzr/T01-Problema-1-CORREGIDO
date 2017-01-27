/*//Leticia Vianey Narvaez Reyes
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.t01.p1;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    String matricula;
    double cal1, cal2, cal3, cal4, cal5, promedio;
    
    System.out.println("Introduzca su matricula");
    matricula = teclado.nextLine();
    System.out.println("Primera Calificacion");
    cal1 = teclado.nextDouble();
    System.out.println("Segunda Calificacion");
    cal2 = teclado.nextDouble();
    System.out.println("Tercera Calificacion");
    cal3 = teclado.nextDouble();
    System.out.println("Cuarta Calificacion");
    cal4 = teclado.nextDouble();
    System.out.println("Quinta Calificacion");
    cal5 = teclado.nextDouble();
    
    promedio = ((cal1+cal2+cal3+cal4+cal5)/5);
    System.out.println("Tu promedio es" + promedio);
    
    if(promedio > 6.9)
        System.out.println("APROBADO");
    if(promedio < 7.0)
        System.out.println("REPROBADO");
    
        
    
    
    }
    
}
