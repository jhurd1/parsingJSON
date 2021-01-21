package parsingJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Game
{
    /*private static int gameGold;
    private static int gameMana;
    private static String gameName;
    private static int gameHealth;*/
    //private String fileName = "";
    //Player p = new Player(gameName,gameHealth,gameMana,gameGold);
    Player p;

    public Game(Player player)
    {
        p = player; // constructs thd game class with this alone
        /*gameGold = p.getGold();
        gameMana = p.getMana();
        gameName = p.getName();
        gameHealth = p.getHealth();*/
    }

    public String saveGame(String fileName)
    {
        //fileName = "/Users/jamiehurd/desktop/byui/cs_246/cs246/parsingJSON/src/main/java/parsingJSON/parse.txt";
        Gson gson = new Gson();
        String test = gson.toJson(p);
        Path path = Paths.get(fileName);
        try
        {
            Files.writeString(path, test, StandardCharsets.UTF_8);
            //gson.toJson(p, new FileWriter(fileName));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return fileName;
    }

  /*  public static Game loadGame(String fileName)
    {
        Player p = new Player("");
        try
        {
            Reader reader = Files.newBufferedReader(Paths.get(fileName));
            Gson gson = new Gson();
            p = gson.fromJson(reader, Player.class);
            Game g = new Game(p.getPlayer());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Game(p);
    }*/
}
