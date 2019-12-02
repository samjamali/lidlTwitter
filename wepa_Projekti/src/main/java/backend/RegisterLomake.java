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
public class RegisterLomake {
    private String userId;
    private String pass;
    
    private String kayttajaNimi;
    
    
    public String getKayttajaNimi(){
        return kayttajaNimi;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
}
