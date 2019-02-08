/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_t6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Ejercicio9_T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado_s = new Scanner(System.in);
        Scanner teclado_int = new Scanner(System.in);
        
        Alumno alumno1 = new Alumno();
        
        try
        {
            System.out.println("Introduce el Nombre del Alumno");
            String alumno = teclado_s.nextLine();
            alumno1.setNombre(alumno);
            System.out.println("");
            System.out.println("Introduzca las Notas del Alumno.");
            alumno1.pedirNotas();
            System.out.println("------------------------------");
            System.out.println("Modifique las Notas del alumno que desea.");
            System.out.println("");
            System.out.println("Introduzca la asignatura que desea modificar (0 - 4)");
            int posicion = teclado_int.nextInt();
            System.out.println("Introduzca la Nota ya modificada");
            double nnota = teclado_int.nextInt();
            alumno1.modificarNota(posicion, nnota);
            System.out.println("------------------------------");
            System.out.println("");
            alumno1.imprimirCalificaciones();
        }
        catch(RangoException | IndexOutOfBoundsException ex)
        {
            System.out.println("Se ha producido un error: " + ex.toString());
        }
        
        
    }
    
}
