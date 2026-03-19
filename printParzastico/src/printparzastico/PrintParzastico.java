/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printparzastico;

/**
 *
 * @author Aluno CA
 */
public class PrintParzastico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor ={1,2,3,4,5,6,7,8,9,10};
        int k = 0;
        while(k<vetor.length){
            System.out.println(vetor[k]);
            k++;
        }
        for(int i=0;i<vetor.length;i++){
           int soma = vetor[i]%2;
            if(soma ==0){
                System.out.println(vetor[i]);
            } 
        }
    }
    
}
