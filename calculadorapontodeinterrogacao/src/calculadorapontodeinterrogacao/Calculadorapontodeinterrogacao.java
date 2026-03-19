/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorapontodeinterrogacao;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno CA
 */
public class Calculadorapontodeinterrogacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] historico = new float[10];
        Scanner scanner = new Scanner(System.in);
    
    for(int i=0; i<10; i++){
        JOptionPane.showInputDialog("Qual o valor");
        float num1 = scanner.nextFloat();
        JOptionPane.showInputDialog("Qual o outro valor");
        float num2 = scanner.nextFloat();
        JOptionPane.showInputDialog("Qual a operacao:"
                + "1 adicao"
                + "2 subtracao"
                + "3 divisao"
                + "4 multiplicacao");
        int operacao = scanner.nextInt();
        
        float conta = 0;
        
        switch(operacao){
            case(1):
                System.out.println(num1 + num2);
                conta = num1 + num2;
                break;
            case(2):
                System.out.println(num1 - num2);
                conta = num1 - num2;
                break;
            case(3):
                System.out.println(num1/num2);
                conta = num1/num2;
                break;
            case(4):
                System.out.println(num1*num2);
                conta = num1*num2;
                break;
            default:
                System.out.println("Digite o identificador de uma das operacoes");
        }
        historico[i] = conta;
    }
    
    for(int i=0; i<10; i++){
        System.out.println(historico[i]);
    }
   
    
    }
    
}
