/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.vivienda;
import ico.fes.habitaciones.Baño;
import ico.fes.habitaciones.Cocina;
import ico.fes.habitaciones.Sala;

/**
 *
 * @author Windows
 */
public class Casa {
    private int numeroCasa;
    private String ventanas;
    private String puerta;
    private Baño wc;
    private Cocina cuartoAlimentos;

    public Casa() {
    }

    public Casa(int numeroCasa, String ventanas, String puerta, Baño wc, Cocina cocina) {
        this.numeroCasa = numeroCasa;
        this.ventanas = ventanas;
        this.puerta = puerta;
        this.wc = wc;
        this.cuartoAlimentos = cuartoAlimentos;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getVentanas() {
        return ventanas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public Baño getWc() {
        return wc;
    }

    public void setWc(Baño wc) {
        this.wc = wc;
    }

    public Cocina getCocina() {
        return cuartoAlimentos;
    }

    public void setCocina(Cocina cocina) {
        this.cuartoAlimentos = cuartoAlimentos;
    }
    
    public void abrirCasa(){
System.out.println("Abriendo casa");
}
@Override
public String toString() {
String data= "numeroCasa:"+numeroCasa;
data = data + "\\nVentanas:"+ventanas;
data = data + "\\nEstufa:"+cuartoAlimentos.getEstufa();
return data;
}
    
    
}
