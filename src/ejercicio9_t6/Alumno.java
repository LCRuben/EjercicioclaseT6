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
    
    public Alumno()
    {
        notas = new ArrayList<>(num_asignaturas);
        nombre = "";
        num_asignaturas = 5;
    }
    
    public Alumno(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void pedirNotas() throws RangoException
    {
        Scanner teclado_d = new Scanner(System.in);
        double nota;
        
        for (int i = 0; i < num_asignaturas; i++) 
        {
            System.out.println("Introduzca la nota " + (i+1) + " del alumno de cada asignatura (1 - 10)");
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
    
    public void modificarNota(int posicion, double nnota) throws RangoException, MisteriosaException
    {
        Scanner teclado_int = new Scanner(System.in);
        Scanner teclado_d = new Scanner(System.in);
        
        System.out.println("Introduce la nota que desea modificar");
        posicion = teclado_int.nextInt();
        System.out.println("Introduce la nota que desea Modificar");
        nnota = teclado_d.nextInt();
        
        if(nnota < 0 || nnota > 10)
            {
                throw new RangoException("ERROR. Nota No valida.");
            }
        else
        {
            if(posicion > num_asignaturas || posicion < num_asignaturas)
            {
                throw new MisteriosaException("ERROR. Nota No valida.");
            }
            else
            {
                notas.set(posicion, nnota);
            }   
        }
    }
    
    
    
}
