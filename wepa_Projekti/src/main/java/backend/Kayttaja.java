/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 *
 * @author Borna
 */
@Entity
public class Kayttaja {
    
    
    @Id
    @NotNull
    private String userId;
    
    @NotNull
    private String pass;
    
    @NotNull
    private String kayttaja;
    
   // @NotNull
    //role?
    
    private String bio;
    
    private String iconPath;
    
    @OneToMany(mappedBy = "twitterKayttaja")
    private List<Tweet> twiitit;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "relation",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "following_id"))
    
    private List<Kayttaja> following;

    public void User(String userId, String password, String kayttaja) {
        this.userId = userId;
        this.pass = password;
        this.kayttaja = (kayttaja == null || kayttaja.equals("")) ?
                "no name" : kayttaja;
       // this.roleName = RoleName.USER;
     //   this.iconPath = "/images/noicon.png";   //Util.getNoIcon();
    }
    
    public void User() {
    }
    
    public List<Tweet> getTweets() {
        return twiitit;
    }
    
    public void setTweets(List<Tweet> tweets) {
        this.twiitit = tweets;
    }
    
    public List<Kayttaja> getFollowing() {
        return following;
    }
}


