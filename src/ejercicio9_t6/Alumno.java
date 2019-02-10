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
public class Alumno 
{
    
    static int num_asignaturas = 5;
    private String nombre;
    
    private ArrayList<Double> notas;
    
    /**
     * Constructor por Defecto.
     */
    public Alumno()
    {
        notas = new ArrayList<>(num_asignaturas);
        nombre = "";
        num_asignaturas = 5;
    }
    
    /**
     * 
     * @param nombre 
     */
    public Alumno(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Metodos Get y Set.
     * @return 
     */
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    /**
     * Metodo para introducir las calificaciones de los Alumnos.
     * @throws RangoException 
     */
    public void pedirNotas() throws RangoException
    {
        Scanner teclado_d = new Scanner(System.in);
        double nota;
        
        for (int i = 0; i < num_asignaturas; i++) 
        {
            System.out.println("Introduzca la nota de la asignatura " + (i+1) + ". (1 - 10)");
            nota = teclado_d.nextDouble();
            if(nota < 0 || nota > 10)
            {
                throw new RangoException("ERROR. Nota No valida.");
            }
            else
            {
                notas.add(nota);
            }
        }
    }
    
    /**
     * Metodo para modificar las calificaciones de los Alumnos.
     * @param posicion
     * @param nnota
     * @throws RangoException
     * @throws IndexOutOfBoundsException 
     */
    public void modificarNota(int posicion, double nnota) throws RangoException, IndexOutOfBoundsException
    {   
        if(nnota < 0 || nnota > 10)
            {
                throw new RangoException("ERROR. Nota No valida.");
            }
        else
        {
            notas.set(posicion, nnota);
        }
    }
    
    /**
     * Metodo para Mostrar las Calificaiones de cada Alumno.
     * No devuelve nada.
     */
    public void imprimirCalificaciones()
    {
        System.out.println("El Alumno: " + getNombre() + " ha Obtenido las siguientes notas: ");
        for (int i = 0; i < num_asignaturas; i++) 
        {
            System.out.println("Asignatura " + (i+1)+": " + notas.get(i));
        }
    }
    
    
    
}
