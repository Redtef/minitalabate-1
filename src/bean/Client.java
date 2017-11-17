/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Boss
 */
@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String login;
    private String nom;
    private String prenom;
    private String telNumber;
    private String email;
    private String password;
    @OneToMany
    private List<Food> favoris;
    @ManyToOne
    private Adresse adresse;
    @OneToOne
    private Cart cart;

    public Client() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Food> getFavoris() {
        if(favoris == null){
            favoris = new ArrayList();
        }
        return favoris;
    }

    public void setFavoris(List<Food> favoris) {
        this.favoris = favoris;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Client(String login, String nom, String prenom, String telNumber, String email, String password) {
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.telNumber = telNumber;
        this.email = email;
        this.password = password;
    }
    

    public String getId() {
        return login;
    }

    public void setId(String id) {
        this.login = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "login=" + login + ", nom=" + nom + ", prenom=" + prenom + ", telNumber=" + telNumber +
                ", email=" + email + ", password=" + password + '}';
    }

   
    
}
