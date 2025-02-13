/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taules;

/**
 *
 * @author domin
 */
public class Classe {
    
 private int id;
 private String nom;
 private String descripcio;
 private int escalat_salut;
 private int escalat_atac;
 private int escalat_defensa;
 private int escalat_defensa_magica;
 private int escalat_velocitat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getEscalat_salut() {
        return escalat_salut;
    }

    public void setEscalat_salut(int escalat_salut) {
        this.escalat_salut = escalat_salut;
    }

    public int getEscalat_atac() {
        return escalat_atac;
    }

    public void setEscalat_atac(int escalat_atac) {
        this.escalat_atac = escalat_atac;
    }

    public int getEscalat_defensa() {
        return escalat_defensa;
    }

    public void setEscalat_defensa(int escalat_defensa) {
        this.escalat_defensa = escalat_defensa;
    }

    public int getEscalat_defensa_magica() {
        return escalat_defensa_magica;
    }

    public void setEscalat_defensa_magica(int escalat_defensa_magica) {
        this.escalat_defensa_magica = escalat_defensa_magica;
    }

    public int getEscalat_velocitat() {
        return escalat_velocitat;
    }

    public void setEscalat_velocitat(int escalat_velocitat) {
        this.escalat_velocitat = escalat_velocitat;
    }
 
 
 
    public Classe(){
        
    }

    public Classe(int id, String nom, String descripcio, int escalat_salut, int escalat_atac, int escalat_defensa, int escalat_defensa_magica, int escalat_velocitat) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.escalat_salut = escalat_salut;
        this.escalat_atac = escalat_atac;
        this.escalat_defensa = escalat_defensa;
        this.escalat_defensa_magica = escalat_defensa_magica;
        this.escalat_velocitat = escalat_velocitat;
    }
 
 
 
    
    
    
}
