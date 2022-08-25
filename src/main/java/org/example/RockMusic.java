package org.example;

import org.springframework.stereotype.Component;

@Component("rockMusicFirstBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock Music";
    }
}
