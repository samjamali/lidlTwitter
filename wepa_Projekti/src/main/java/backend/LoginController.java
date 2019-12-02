/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Borna
 */
@Controller
public class LoginController {
    @RequestMapping("/loginForm")
    String loginLomake(){
        return "login";
    }

}
