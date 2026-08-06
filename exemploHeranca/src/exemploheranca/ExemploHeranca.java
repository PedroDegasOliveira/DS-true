/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploheranca;

/**
 *
 * @author pedro
 */
public class ExemploHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro monza = new Carro("monza", "asap3549", 0 , "Bosse");
        monza.dadosT();
        Moto ninja = new Moto("Ninja", "asap1234",1200 , 1000);
        ninja.dadosT();
    }
    
}
