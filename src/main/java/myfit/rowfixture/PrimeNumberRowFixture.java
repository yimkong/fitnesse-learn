package myfit.rowfixture;

import fit.RowFixture;

/**
 * author yg
 * description
 * date 2020/11/6
 */
public class PrimeNumberRowFixture extends RowFixture {
    public Object[] query() throws Exception {
        PrimeData[] array = new PrimeData[5];
        array[0] = new PrimeData(11);
        array[1] = new PrimeData(5);
        array[2] = new PrimeData(3);
        array[3] = new PrimeData(7);
        array[4] = new PrimeData(2);
        return array;
    }

    public Class getTargetClass() {
        return PrimeData.class;
    }
}
