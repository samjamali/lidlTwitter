/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Borna
 */
public interface TwitterRepository extends JpaRepository<Tweet,Integer> {
    List<Tweet> FindPostTimeOrder();
    List<Tweet> findTop100ByTweetUser_UserIdInOrderByPostTimeDesc(List<String> tweetUserId);
}
