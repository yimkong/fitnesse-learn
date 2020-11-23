package myfit.flowmode;

import fit.ColumnFixture;

/**
 * author yg
 * description
 * date 2020/11/23
 */
public class SetupFixtureTest extends ColumnFixture {
    public String name;
    public String postCode;
    public String balance;

    @Override
    public void execute() throws Exception {
        PlayerHolder.addPlayer(new Player(name, postCode, balance));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
