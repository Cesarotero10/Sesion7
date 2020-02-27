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
public class Baño {
    private String regadera;
    private String labavo;
    private String retrete;

    public Baño() {
    }

    public Baño(String regadera, String labavo, String retrete) {
        this.regadera = regadera;
        this.labavo = labavo;
        this.retrete = retrete;
    }

    public String getRegadera() {
        return regadera;
    }

    public void setRegadera(String regadera) {
        this.regadera = regadera;
    }

    public String getLabavo() {
        return labavo;
    }

    public void setLabavo(String labavo) {
        this.labavo = labavo;
    }

    public String getRetrete() {
        return retrete;
    }

    public void setRetrete(String retrete) {
        this.retrete = retrete;
    }
    
    public void llenarAgua(){
System.out.println("Tanque lleno");
}
    public void abrirLlave(){
        System.out.println("LLave abierta");
    }
    
    
}
