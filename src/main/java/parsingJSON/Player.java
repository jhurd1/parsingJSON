package parsingJSON;

import com.google.gson.Gson;

public class Player
{

    private String name = "";
    private int health = 2;
    private int mana = 1;
    private int gold = 2;

    Player()
    {

    }

    Player(String name, int health, int mana, int gold)
    {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.gold = gold;
    }

    public Player getPlayer()
    {
        Player p = new Player(name, health, mana, gold);
        return p;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public int getMana()
    {
        return mana;
    }

    public int getGold()
    {
        return gold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void display ()
    {
        System.out.print (name + " " + health + " " + mana + " " + gold);
    }
}
