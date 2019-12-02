/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Borna
 */
public class UserLomake {
    
    private String kayttajaNimi;
    private String bio;
    
    public String getKayttajaNimi(String kayttajaNimi){
        return this.kayttajaNimi;
    }
    
    public String getBio(){
        return bio;
    }
    
    public void setBio(String bio){
        this.bio = bio;
    }
    public void setkayttajaNimi(String kayttajaNimi) {
        this.kayttajaNimi = kayttajaNimi;

    }
    
}
