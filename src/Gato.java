/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semipresencial 1º
 */
public class Gato extends Animal{
    
    //Declaración de atributos
    
    private String raza ;
    
    //Declaración de constructores
    
    public Gato()
    {
        super(Sexo.HEMBRA) ;
        raza = "siamés" ;
    }
    
    public Gato(Sexo s)
    {
        super(s) ;
        raza = "siames" ;
    }
    
    public Gato(String r)
    {
        super(Sexo.HEMBRA) ;
        raza = r ;
    }
    
    public Gato(Sexo s, String r)
    {
        super(s) ;
        raza = r ;
    }
    
    public void maulla()
    {
        System.out.println("Miau.");
    }
    
    public void ronronea()
    {
        System.out.println("rrrrggggrrrggrgr");
    }
    
    public void come(String comida)
    {
        if (comida.equals("pescado"))
        {
            System.out.println("ME GUSTA.");
        }
        else
        {
            System.out.println("No gusta, lo siento.");
        }
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
                System.out.println("No peleo con gatitas.");
            }
            else
            {
                System.out.println("Al ataque... te vas a enterar.");
            }
        }
    }
    
    @Override
    public String toString()
    {
        return (super.toString() + "Raza " + raza + "\n-----------") ;
    }
    
}
    

