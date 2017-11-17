/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
/**
 *
 * @author delll
 */
@Entity
public class Owner  extends Client implements Serializable {

    @OneToMany(mappedBy = "owner")
    private List<Restaurant> restaurants;

    



  

 

    
    
}
