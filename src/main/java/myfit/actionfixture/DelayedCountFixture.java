package myfit.actionfixture;

import fit.Fixture;

/**
 * author yg
 * description
 * date 2020/11/16
 */
public class DelayedCountFixture extends Fixture {
    private int counter = 0;

    public void count() {
        counter++;
    }

    public int counter() {
        return counter;
    }
}
