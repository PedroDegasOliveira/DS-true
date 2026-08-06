/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca;

/**
 *
 * @author pedro
 */
public class Carro extends Veiculo {

    public String audio;

    public Carro(String modelo, String placa, float ipva, String audio) {
        super(modelo, placa, ipva);
        this.audio=audio;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
    
    
    @Override
    public void dadosT(){
        super.dadosT();
        System.out.println("O sistema de audio é: " + getAudio());
    }
        
}