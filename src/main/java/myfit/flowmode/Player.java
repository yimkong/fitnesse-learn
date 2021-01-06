package myfit.flowmode;

import java.util.ArrayList;
import java.util.List;

/**
 * author yg
 * description
 * date 2020/11/23
 */
public class Player {

    private String name;
    private String postCode;
    private String balance;

    public Player(String name, String postCode, String balance) {
        this.name = name;
        this.postCode = postCode;
        this.balance = balance;
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
