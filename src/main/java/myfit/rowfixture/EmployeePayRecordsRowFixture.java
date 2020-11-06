package myfit.rowfixture;

import fit.RowFixture;

/**
 * author yg
 * description
 * date 2020/11/6
 */
public class EmployeePayRecordsRowFixture extends RowFixture {
    public Object[] query() throws Exception {
        EmployeePayRecord[] records = new EmployeePayRecord[2];
        records[0] = new EmployeePayRecord(1, 1000);
        records[1] = new EmployeePayRecord(2,2000);
        return records;
    }
    public Class getTargetClass() {
        return EmployeePayRecord.class;
    }
}
