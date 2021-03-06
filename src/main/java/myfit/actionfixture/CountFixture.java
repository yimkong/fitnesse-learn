package myfit.actionfixture;

import fit.Fixture;

/**
 * author yg
 * description
 * date 2020/11/16
 */
public class CountFixture extends Fixture {
    private int counter = 0;

    public void count() {
        counter++;
    }

    public int counter() {
        return counter;
    }

    public void testEnter(int val) {
        counter += val;
    }
}
