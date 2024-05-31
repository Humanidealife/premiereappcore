/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.travauxpratiques.premiereappcore;

/**
 *
 * @author wangq
 */
public class PersonneInvitee {
    private String nom;
    private String prenom;

    public PersonneInvitee(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public PersonneInvitee() {
    }

    public String nomEntier(){
        return nom + " " + prenom;
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
    
}
