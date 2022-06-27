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
            case "guitar":
                playable = new Guitar();
                break;
            case "voilin":
                playable = new Voilin();
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
    }
}
