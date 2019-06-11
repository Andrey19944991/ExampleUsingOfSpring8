package ru.chekovandrey;

import org.springframework.stereotype.Component;

@Component("rockMusicBean")
public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
