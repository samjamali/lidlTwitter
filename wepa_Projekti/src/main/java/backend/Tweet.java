/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author Borna
 */
@Entity
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tweetId;
    
    @CreationTimestamp
    private Timestamp postTime;
    
    @NotNull
    private String content;
    
    @ManyToOne
    private Kayttaja twitterKayttaja;
    
    public Kayttaja getTwittaaja(){
        return twitterKayttaja;
    }
    
    public void setTweetUser(Kayttaja twiittaaja){
        this.twitterKayttaja = twiittaaja;
    }
    
    public Tweet() {
    }
    
    public Tweet(String content, Kayttaja kayttaja){
        this.content = content;
        this.twitterKayttaja = kayttaja;
    }
    
    public Integer getTweetId() {
        return tweetId;
    }

    public void setTweetId(Integer tweetId) {
        this.tweetId = tweetId;
    }

    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
}
