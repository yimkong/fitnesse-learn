package myfit.flowmode;

import java.util.ArrayList;
import java.util.List;

/**
 * author yg
 * description
 * date 2020/11/23
 */
public class PlayerHolder {
    static List<Player> playerList = new ArrayList<>();

    public static void addPlayer(Player player) {
        playerList.add(player);
    }
}
