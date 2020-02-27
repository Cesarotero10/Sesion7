/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.habitaciones;

/**
 *
 * @author Windows
 */
public class Cocina {
    private String refrigerador;
    private String estufa;
    private String hornoMicroondas;

    public Cocina() {
    }

    public Cocina(String refrigerador, String estufa, String hornoMicroondas) {
        this.refrigerador = refrigerador;
        this.estufa = estufa;
        this.hornoMicroondas = hornoMicroondas;
    }

    public String getRefrigerador() {
        return refrigerador;
    }

    public void setRefrigerador(String refrigerador) {
        this.refrigerador = refrigerador;
    }

    public String getEstufa() {
        return estufa;
    }

    public void setEstufa(String estufa) {
        this.estufa = estufa;
    }

    public String getHornoMicroondas() {
        return hornoMicroondas;
    }

    public void setHornoMicroondas(String hornoMicroondas) {
        this.hornoMicroondas = hornoMicroondas;
    }
    
    
   public void encenderEstufa(){
       System.out.println("Encendiendo estufa...");
   } 
   
   public void encenderHorno(){
System.out.println("Encendiendo Hornomicroondas...");
}
}
