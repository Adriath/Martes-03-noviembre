/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semipresencial 1º
 */
public class Perro extends Animal{
    
    private String raza ;
    private String nombre ;
    
    public Perro()
    {
        raza = "chucho" ;
        nombre = "Firuláis" ;
    }
    
    public Perro (String r, String n)
    {
        raza = r ;
        nombre = n ;
    }
    
    public Perro (Sexo s, String r, String n)
    {
        super (s) ;
        raza = r ;
        nombre = n ;
    }
    
    public void peleaCon(Gato contrincante)
    {
        if (this.getSexo() == Sexo.HEMBRA) 
        {
            System.out.println("No me peleo.");
        }
        else
        {
            if (contrincante.getSexo() == Sexo.HEMBRA) 
            {
                System.out.println("No me peleo con hembras.");
            }
            else if (contrincante.getSexo() == Sexo.HERMAFRODITA) 
            {
                System.out.println("No pienso pelearme contigo.");
            }
            else
            {
                System.out.println("Me lo como, ¡al ataque!");
            }
        }
    }
    
    public void come(String comida)
    {
        if (comida.equals("hueso")) 
        {
            System.out.println("Mmmm, qué rico.");
        }
        else
        {
            System.out.println("Eso te lo comes tú.");
        }
    }
    
    public void pelea(Perro contrincante)
    {
        if (this.getSexo() == Sexo.HEMBRA) 
        {
            System.out.println("No me peleo.");
        }
        else
        {
            if (contrincante.getSexo() == Sexo.HEMBRA) 
            {
                System.out.println("No me peleo con hembras.");
            }
            else
            {
                System.out.println("Te voy a destrozar, ¡guau!");
            }
        }
    }
    
    @Override
    public String toString()
    {
        return (super.toString() + "Raza: " + raza + "\nNombre: " + nombre + "\n----------------") ;
    }
    
}
