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
public class Sala {
    private String sofa;
    private String television;
    private String consolaDeVideoJuegos;

    public Sala() {
    }

    public Sala(String sofa, String television, String consolaDeVideoJuegos) {
        this.sofa = sofa;
        this.television = television;
        this.consolaDeVideoJuegos = consolaDeVideoJuegos;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public String getTelevision() {
        return television;
    }

    public void setTelevision(String television) {
        this.television = television;
    }

    public String getConsolaDeVideoJuegos() {
        return consolaDeVideoJuegos;
    }

    public void setConsolaDeVideoJuegos(String consolaDeVideoJuegos) {
        this.consolaDeVideoJuegos = consolaDeVideoJuegos;
    }
    public void encenderTelevision(){
System.out.println("Encendiendo televisor");
}
    public void Apagar(){
System.out.println("Apaganado PlayStation");
}
    
}
