package myfit;

import fit.ColumnFixture;

/**
 * author yg
 * description
 * simple test
 * date 2020/11/4
 */
public class TestColumnFixture extends ColumnFixture {
    private double numerator;
    private double denominator;

    public double quotient() {
        return numerator / denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

}
