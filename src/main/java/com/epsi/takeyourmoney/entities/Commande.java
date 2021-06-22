/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epsi.takeyourmoney.entities;

import java.util.Date;


/**
 *
 * @author Fleury Gabriel
 */
public class Commande {
    
    //Attributs
    private int id_commande;
    private Date date_commande;
    
    
    //Constructeurs

    public Commande() {
    }

    public Commande(Date date_commande) {
        this.date_commande = date_commande;
    }

    public Commande(int id_commande, Date date_commande) {
        this.id_commande = id_commande;
        this.date_commande = date_commande;
    }
    
    //Getters et setters

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public Date getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
    }
    
    
    
}
