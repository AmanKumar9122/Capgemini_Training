package com.example.capgemini.util;

import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

@Component
public class SessionManager {

    private Set<Integer> loggedUsers = new HashSet<>();

    public void login(Integer empId){
        loggedUsers.add(empId);
    }

    public void logout(Integer empId){
        loggedUsers.remove(empId);
    }

    public boolean isLoggedIn(Integer empId){
        return loggedUsers.contains(empId);
    }
}
