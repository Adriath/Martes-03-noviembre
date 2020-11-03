/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semipresencial 1º
 */
public class Pinguino extends Ave{
    
    public Pinguino()
    {
        super(Sexo.MACHO) ;
    }
    
    public Pinguino(Sexo s)
    {
        super(s) ;
    }
    
    @Override
    public void vuela()
    {
        System.out.println("No puede volar.");
    }
    
}
