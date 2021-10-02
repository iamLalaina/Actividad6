/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadseis;
import java.util.Scanner;
/**
 *
 * @author Liliana
 */
public class ActividadSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       String nombre;
       double nota1, nota2, nota3, nota4, nota5, sum, prom;
       System.out.print("Ingresar nombre del alumno: ");
       nombre = entrada.nextLine();
       System.out.print("Ingresa primer nota 1: ");
       nota1 = entrada.nextDouble();
       System.out.print("Ingresa primer nota 2: ");
       nota2 = entrada.nextDouble();
       System.out.print("Ingresa primer nota 3: ");
       nota3 = entrada.nextDouble();
       System.out.print("Ingresa primer nota 4: ");
       nota4 = entrada.nextDouble();
       System.out.print("Ingresa primer nota 5: ");
       nota5 = entrada.nextDouble();
       
       sum = nota1 + nota2 + nota3 + nota4 + nota5;
       prom = sum / 5;
       
       System.out.println("Nombre del estudiante: " + nombre);
       System.out.println("Calificacion 1: " + nota1);
       System.out.println("Calificacion 2: " + nota2);
       System.out.println("Calificacion 3: " + nota3);
       System.out.println("Calificacion 4: " + nota4);
       System.out.println("Calificacion 5: " + nota5);
       System.out.println("Promedio: " + prom);
      
       if (prom <= 50)
       {
           System.out.println("Calificacion: F");
       }
       else if (prom >51 && prom <60) {
           System.out.println("Calificacion: E");
       }
       else if (prom >61 && prom <70) {
           System.out.println("Calificacion: D");
       }
       else if (prom >71 && prom <80) {
           System.out.println("Calificacion: C");
       }
       else if (prom >81 && prom <90) {
           System.out.println("Calificacion: B");
       }
       else if (prom >91 && prom <100) {
           System.out.println("Calificacion: A");
       }
    }
    
}
