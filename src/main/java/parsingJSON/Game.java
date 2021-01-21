package parsingJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;

public class Game
{
    private int gameGold;
    private int gameMana;
    private String gameName;
    private int gameHealth;

    public Game(Player p)
    {
        gameGold = p.getGold();
        gameMana = p.getMana();
        gameName = p.getName();
        gameHealth = p.getHealth();
    }

    private void saveGame()
    {
        Player p = new Player(gameName,gameHealth,gameMana,gameGold);
        Gson gson = new Gson();
        String json = gson.toJson(p, new FileWriter("/Users/jamiehurd/desktop/byui/cs_246/cs246/parsingJSON/src/main/java/parsingJSON"));
    }
}
