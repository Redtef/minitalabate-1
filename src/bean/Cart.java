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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author delll
 */
@Entity
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private float prixTotal;
    @OneToOne(mappedBy = "cart")
    private Client client;
    @OneToMany(mappedBy = "cart")
    private List<LigneCart> ligneCarts;
    @OneToOne
    private Restaurant resto;

    public Cart(Client client, Restaurant resto) {
        this.client = client;
        this.resto = resto;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

 public List<LigneCart> getLigneCarts() {
        if(ligneCarts == null){
            ligneCarts = new ArrayList();
        }
        return ligneCarts;
    }

    public void setLigneCarts(List<LigneCart> ligneCarts) {
        this.ligneCarts = ligneCarts;
    }
    public Restaurant getResto() {
        return resto;
    }

    public void setResto(Restaurant resto) {
        this.resto = resto;
    }

    public Cart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        if (!(object instanceof Cart)) {
            return false;
        }
        Cart other = (Cart) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", prixTotal=" + prixTotal + ", client=" + client + ", ligneCarts=" + ligneCarts + ", resto=" + resto + '}';
    }

   

}
