package myfit;

import fitlibrary.ConstraintFixture;

public class ConstraintFixtureTest extends ConstraintFixture {
    //ConstraintFixture is a variation of CalculateFixture that has an expected value of true for each calculation.
    public boolean firstPartSecondPart(int firstPart, int secondPart) {
        return firstPart < secondPart;
    }
}
