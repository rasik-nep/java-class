package com.acem.jc;

import com.acem.jc.ball.BasketBall;
import com.acem.jc.ball.Football;
import com.acem.jc.ball.VolleyBall;
import com.acem.jc.musicalinstrument.Flute;
import com.acem.jc.musicalinstrument.Guitar;
import com.acem.jc.musicalinstrument.Voilin;

public class Main {
    public static void main(String args[]) {
        String input = args[0];
        Playable playable = null;
        switch (input) {
            case "football":
                playable = new Football();
                break;
            case "basketball":
                playable = new BasketBall();
                break;
            case "volleyball":
                playable = new VolleyBall();
                break;
            case "guitar":
                playable = new Guitar();
                break;
            case "voilin":
                playable = new Voilin();
                break;
            case "flute":
                playable = new Flute();
                break;
        }
        play(playable);
    }

    public static void play(Playable playable) {
        playable.play();
        if (playable instanceof Football) {
            Football football = (Football) playable;
            football.kick();
        }
        if (playable instanceof VolleyBall) {
            VolleyBall volleyball = (VolleyBall) playable;
            volleyball.serve();
        }
    }
}
