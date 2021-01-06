package myfit.arrayfixture;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public static List<Player> players = new ArrayList<>();

    static {
        players.add(new Player("John Smith", "SW4 66Z", "10"));
        players.add(new Player("Michael Jordan", "NE1 8AT", "23"));
    }

    private final String name;
    private final String postCode;
    private final String creditLimit;

    public Player(String name, String postCode, String creditLimit) {
        this.name = name;
        this.postCode = postCode;
        this.creditLimit = creditLimit;
    }
}
