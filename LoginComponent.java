package com.oms.contextHolder;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import java.security.Principal;

@ManagedBean
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginComponent {

    private String login="";
    private String password="";
    private Principal principal;

    public boolean tryToLogin(){
        if(login.equals("admin")){
            return true;
        }
        return false;
    }
}
