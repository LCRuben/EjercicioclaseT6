/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_t6;

import java.util.ArrayList;

/**
 *
 * @author ruben
 */
public class Alumno 
{
    
    static int num_asignaturas = 5;
    private String nombre;
    
    ArrayList<Double> notas;
    
    Alumno()
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
    
    public void pedirNotas()
    {
        
    }
    
    
}
