/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEmploye;

/**
 *
 * @author sanabenfadhel
 */
public class TestEmploye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employe e1=new Employe(1,"nom");
        System.out.println("test ");
        Caissier c1=new Caissier(12,2,"nom");
        
        
        System.out.println("id c1:"+c1.getId());
        System.out.println("num Cais :"+c1.getNumCais());
        
        System.out.println("nom de c1 :"+c1.getNom());
    
        Caissier c2=new Caissier();
        
        
        System.out.println(c1.toString());
        System.out.println(c1);
        
        c1.affi();
        c1.test();
    }
    
}
