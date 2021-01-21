package parsingJSON;

import com.google.gson.Gson;

public class Main
{
    public static void main (String[] args)
    {

        Player p = new Player("Test", 1, 2, 1);
        Game game = new Game(p);
        game.saveGame("test.txt");
        p.display();
        game.loadGame("test.txt"); // errors
    }
}
