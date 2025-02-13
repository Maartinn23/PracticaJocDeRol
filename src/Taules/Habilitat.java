 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taules;

/**
 *
 * @author domin
 */
public class Habilitat {
    
    private int id;
    private String nom;
    private String descripcio;
    private String script;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public String getScript() {
        return script;
    }

    public Habilitat(int id, String nom, String descripcio, String script) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.script = script;
    }
    
    
    public Habilitat(){
        
    }
    
    
    
    
}
