/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semipresencial 1º
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal gatito = new Animal() ;
        Ave paloma = new Ave(Sexo.HEMBRA) ;
        Ave palomo = new Ave(Sexo.MACHO) ;
        Gato garfield = new Gato(Sexo.MACHO) ;
        Gato gato2 = new Gato();
        Gato gato3 = new Gato();
        Gato gato4 = new Gato(Sexo.MACHO, "egipcio") ;
        Gato gato5 = new Gato(Sexo.MACHO, "sin pedigree") ;
        
        palomo.duerme();
        paloma.lavate();
        palomo.vuela();
        
        System.out.println("Garfiel come pescado");
        garfield.come("pescado");
        
        System.out.println("Gato 2 pelea con Gato 3");
        gato2.peleaCon(gato3);
        
        System.out.println("Gato 4 pelea con Garfield");
        gato4.peleaCon(garfield);
        
        System.out.println("Gato 5 pelea con Garfield.");
        gato5.peleaCon(garfield);
        
        System.out.println("El gato 5 maúlla.");
        gato5.maulla();
        
        System.out.println(gatito);
        
        System.out.println("-------- A PARTIR DE AQUÍ LOS PERROS --------- \n\n");
        
        Perro firulais = new Perro();
        Perro rex = new Perro("caniche", "Rex");
        Perro fanny = new Perro(Sexo.HEMBRA, "Pastor Alemán", "Fanny") ;
        
        System.out.println(firulais);
        System.out.println(rex);
        System.out.println(fanny);
    }
    
}
