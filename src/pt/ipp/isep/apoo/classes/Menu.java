/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;
import java.util.*;
/**
 *
 * @author João Gomes
 */
public class Menu {
    
    
    public void run(){
        int option = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Seja bem-vindo!!");
        System.out.println("O que deseja fazer?");
        System.out.println("");
        System.out.println(" 1 - Fazer marcação");
        System.out.println(" 2 - Pesquisar marcação por Utente");
        System.out.println(" 3 - Alterar uma marcação");
        System.out.println(" 4 - Pesquisar marcações de utentes por idade");
        System.out.println(" 5 - Pesquisar marcações por marca");
        System.out.println(" 6 - Pesquisar marcações por lote");
        System.out.println(" 7 - Pesquisar marcações por marca e por lote");
        System.out.println("");
        System.out.println("Insira a opção");
        option = reader.nextInt();

        Utilities.menuHandler(option);
    }
}