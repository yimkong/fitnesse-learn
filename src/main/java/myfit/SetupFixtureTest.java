package myfit;

import fitlibrary.SetUpFixture;
import myfit.flowmode.PlayerHolder;

/**
 * author yg
 * description
 * date 2020/11/23
 */
public class SetupFixtureTest extends SetUpFixture {
    public SetupFixtureTest() {
        PlayerHolder.players.clear();
    }

    //declare a single method. The method name should be equal to all the property names from the table joined together,use CamelCase capitalisation to separate words
    public void namePostCodeBalance(String name, String postCode, String balance) {
        PlayerHolder.addPlayer(name, postCode, balance);
    }
}
