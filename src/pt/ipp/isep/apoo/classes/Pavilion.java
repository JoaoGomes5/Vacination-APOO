/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;
import pt.ipp.isep.apoo.classes.VaccinationLocation.*;

/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class Pavilion extends VaccinationLocation {

    /**
     * Numero da secção
     */
    private int sectionNumber;
 
    /**
     * Metodo construtor
     */
    public Pavilion() {
        
    }
    
    /**
     * 
     * Método que permite criar um novo pavilhão 
     * @param sectionName
     */
    public Pavilion (String name, String address, String phoneNumber, int sectionNumber) {
        super(name, address, phoneNumber);
        this.sectionNumber = sectionNumber;
        
    }
    
    public String toString(){
        return super.toString()+ " pavilhão municipal com a secção "+getSectionNumber();
    }
    
    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

}
