package myfit.flowmode;

import fit.Fixture;
import fitlibrary.DoFixture;

import java.util.List;

/**
 * author yg
 * description
 * date 2020/11/23
 */
public class DoFixtureFlowTest extends DoFixture {
    public Fixture preparePlayers() {
        return new SetupFixtureTest();
    }

    public List<Player> listPlayers() {
        return PlayerHolder.playerList;
    }
}
