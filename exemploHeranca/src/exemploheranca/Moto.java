/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca;

/**
 *
 * @author pedro
 */
public class Moto extends Veiculo{
    public int cilindradas;
    
    public Moto(String modelo, String placa, float ipva, int cilindradas) {
        super(modelo, placa, ipva);
        this.cilindradas=cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    
    @Override
    public void dadosT(){
        super.dadosT();
        System.out.println("As cilindradas são: " + getCilindradas());
    }
    
}
