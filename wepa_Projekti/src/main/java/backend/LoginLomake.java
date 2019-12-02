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
public class LoginLomake {
    
    private String userId;
    private String password;
    
    public String getUser(){
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;

    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String pass){
        this.password = pass;
    }
}
