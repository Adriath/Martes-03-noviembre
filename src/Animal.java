/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semipresencial 1º
 */
public class Animal {
    
   private Sexo sexo ;
   
   public Animal()
   {
      sexo = sexo.MACHO ;
   }
    
   public Animal (Sexo sexo)
   {
       this.sexo = sexo ;
   }
   
   public Sexo getSexo()
   {
       return sexo ;
   }
   
   @Override
   public String toString()
   {
       return ("Sexo: " + this.sexo + "\n") ;
   }
   
   public void duerme()
   {
       System.out.println("zzzzzzzzzzz");
   }
   
}
