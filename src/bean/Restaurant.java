/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.time.LocalTime;
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
public class Restaurant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private List<String> specialités;
    private LocalTime heureOuverture;
    private LocalTime heureFermeture;
    private Boolean livraison;
    private long prixLivraison;
    private float commission;
    @OneToOne
    private Adresse adresse;
    @ManyToOne
    private Owner owner;
    @OneToOne
    private Menu menu; 
    @OneToMany(mappedBy = "resto")
    private List<Ingredient> ingredientss;

    public Restaurant() {
    }

    public Restaurant(LocalTime heureOuverture, LocalTime heureFermeture, Boolean livraison, long prixLivraison, float commission) {
        this.heureOuverture = heureOuverture;
        this.heureFermeture = heureFermeture;
        this.livraison = livraison;
        this.prixLivraison = prixLivraison;
        this.commission = commission;
    }

    public List<String> getSpecialités() {
        return specialités;
    }

    public void setSpecialités(List<String> specialités) {
        if(specialités == null){
            specialités = new ArrayList();
        }
        this.specialités = specialités;
    }

    public LocalTime getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(LocalTime heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public LocalTime getHeureFermeture() {
        return heureFermeture;
    }

    public void setHeureFermeture(LocalTime heureFermeture) {
        this.heureFermeture = heureFermeture;
    }

    public Boolean getLivraison() {
        return livraison;
    }

    public void setLivraison(Boolean livraison) {
        this.livraison = livraison;
    }

    public long getPrixLivraison() {
        return prixLivraison;
    }

    public void setPrixLivraison(long prixLivraison) {
        this.prixLivraison = prixLivraison;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "id=" + id + ", specialit\u00e9s=" + specialités + ", heureOuverture=" + heureOuverture + 
                ", heureFermeture=" + heureFermeture + ", livraison=" + livraison + ", prixLivraison=" + prixLivraison + 
                ", commission=" + commission + '}';
    }

  

}
