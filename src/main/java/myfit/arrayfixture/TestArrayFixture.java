package myfit.arrayfixture;

import fitlibrary.ArrayFixture;
import myfit.flowmode.PlayerHolder;

public class TestArrayFixture extends ArrayFixture {

    public TestArrayFixture() {
        setActualCollection(PlayerHolder.players);
    }
}
