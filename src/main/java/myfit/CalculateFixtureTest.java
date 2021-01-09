package myfit;

import fitlibrary.CalculateFixture;

public class CalculateFixtureTest extends CalculateFixture {

    //the method name must follow this rule: checkColumnHead + other columnHeaders in sequence
    public String togetherFirstPartSecondPart(String firstPart,String secondPart){
        return firstPart+ ", "+secondPart;
    }
}
