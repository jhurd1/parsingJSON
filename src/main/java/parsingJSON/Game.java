package parsingJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game
{
    private static int gameGold;
    private static int gameMana;
    private static String gameName;
    private static int gameHealth;
    private String fileName = "";
    Player p = new Player(gameName,gameHealth,gameMana,gameGold);

    public Game(Player p)
    {
        gameGold = p.getGold();
        gameMana = p.getMana();
        gameName = p.getName();
        gameHealth = p.getHealth();
    }

    private String saveGame()
    {
        fileName = "/Users/jamiehurd/desktop/byui/cs_246/cs246/parsingJSON/src/main/java/parsingJSON/parse.txt";
        Gson gson = new Gson();
        try
        {
            gson.toJson(p, new FileWriter(fileName));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return fileName;
    }

    public static Game loadGame(String fileName)
    {
        //Player pTest = new ObjectWrapper().readValue(fileName, Player.class);
        Player p = new Player(gameName,gameHealth,gameMana,gameGold);
        Game g = new Game(p.getPlayer());
        return g;
    }
}
