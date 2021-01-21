package parsingJSON;

import com.google.gson.Gson;

public class Main
{
    public static void main (String[] args)
    {
        // String name, int health, int mana, int gold
        Player p = new Player("Test", 1, 2, 1);
        /*int m = p.getMana();
        int h = p.getHealth();
        int g = p.getGold();
        String n = p.getName();*/
        Game game = new Game(p);
        game.saveGame("test.txt"); //parse.txt does not contain the values
        p.display();
        //game.loadGame("parse.txt"); // errors
    }
}
