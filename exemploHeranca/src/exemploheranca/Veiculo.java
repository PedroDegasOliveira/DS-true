/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca;

/**
 *
 * @author pedro
 */
public class Veiculo {

    public String modelo;
    public String placa;
    public float ipva;

    public Veiculo(String modelo, String placa, float ipva) {
        this.modelo = modelo;
        this.placa = placa;
        this.ipva = ipva;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setIpva(float ipva) {
        this.ipva = ipva;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public float getIpva() {
        return ipva;
    }
    
    public void dadosT (){
        System.out.println("O modelo é: " + getModelo());
        System.out.println("A placa é: " + getPlaca());
        System.out.println("O IPVA é: " + getIpva());
    }
}
