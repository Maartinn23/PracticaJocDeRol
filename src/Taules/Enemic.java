/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taules;

public class Enemic {
    
    
    private int id;
    private String nom;
    private String descripcio;
    private int nivell;
    private int salut_maxima;
    private int atac;
    private int defensa;
    private int magia;
    private int defensa_magica;
    private int velocitat;

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

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public int getSalut_maxima() {
        return salut_maxima;
    }

    public void setSalut_maxima(int salut_maxima) {
        this.salut_maxima = salut_maxima;
    }

    public int getAtac() {
        return atac;
    }

    public void setAtac(int atac) {
        this.atac = atac;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getDefensa_magica() {
        return defensa_magica;
    }

    public void setDefensa_magica(int defensa_magica) {
        this.defensa_magica = defensa_magica;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }
    
    public Enemic(){
        
    }

    public Enemic(int id, String nom, String descripcio, int nivell, int salut_maxima, int atac, int defensa, int magia, int defensa_magica, int velocitat) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.nivell = nivell;
        this.salut_maxima = salut_maxima;
        this.atac = atac;
        this.defensa = defensa;
        this.magia = magia;
        this.defensa_magica = defensa_magica;
        this.velocitat = velocitat;
    }
    
    
    
}
