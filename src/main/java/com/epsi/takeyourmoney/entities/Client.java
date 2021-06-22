/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epsi.takeyourmoney.entities;

/**
 *
 * @author Fleury Gabriel
 */
public class Client {
    
    //Attributs
    private int id_client;
    private String nom;
    private String prenom;
    private String mail;
    private boolean isAnon;

    //Constructeurs

    public Client() {
    }

    public Client(String nom, String prenom, String mail, boolean isAnon) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.isAnon = isAnon;
    }

    public Client(int id_client, String nom, String prenom, String mail, boolean isAnon) {
        this.id_client = id_client;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.isAnon = isAnon;
    }
    
        
    
    //Getters and setters
    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isIsAnon() {
        return isAnon;
    }

    public void setIsAnon(boolean isAnon) {
        this.isAnon = isAnon;
    }
    
    
    
}
