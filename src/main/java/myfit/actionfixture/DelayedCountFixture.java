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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
    }

    public int counter() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return counter;
    }

    public int enterCount(int counter) {
        this.counter += counter;
        return counter;
    }
}
