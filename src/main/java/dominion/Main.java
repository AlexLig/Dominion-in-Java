package dominion;


import dominion.game.Game;
import dominion.player.Player;

public class Main {

    public static void main(String[] args) {



        Game game = new Game(4);
        game.gameLoop();
    }
}
