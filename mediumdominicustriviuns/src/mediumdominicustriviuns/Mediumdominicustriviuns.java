/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediumdominicustriviuns;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Mediumdominicustriviuns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double media = 0;
        double nota = 0;
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showInputDialog("insira seu nome");
        String nome = scanner.nextLine();
        JOptionPane.showInputDialog("Digite a escola que estuda");
        String escola = scanner.nextLine();
        
        
        for(int i = 0; i<6; i++){
            JOptionPane.showInputDialog("Digite sua nota, um numero de 0 a 10");
            while(true){
                nota = scanner.nextDouble();
                if(nota<=10 && nota>=0 )
                    break;
                else{
                    System.out.println("Digite uma nota valida");
                    //continue;
                }
            }
            
            media = nota + media;
        }
        
        double mediaFinal = media/6;
        System.out.println("A sua media final é de: " + mediaFinal);
    }
    
}
