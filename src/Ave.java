/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semipresencial 1º
 */
public class Ave extends Animal{
    
    //Declaración de atributos
    
    //Declaración de constructores
    
    public Ave (Sexo s)
    {
        super (s) ;
    }
    
    @Override
    public void duerme()
    {
        System.out.println("El ave está durmiendo.");
    }
    
    public void vuela()
    {
        System.out.println("El ave está volando.");
    }
    
    public void lavate()
    {
        System.out.println("El ave se está lavando.");
    }
            
           //Declaración de métodos
}
