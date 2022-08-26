package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class RockMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Initialization start");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroy start");
    }
    @Override
    public String getSong() {
        return "Rock Music";
    }
}
