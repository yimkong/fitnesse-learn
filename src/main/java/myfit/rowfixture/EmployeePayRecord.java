package myfit.rowfixture;

/**
 * author yg
 * description
 * date 2020/11/6
 */
public class EmployeePayRecord {
    public int id;
    private double salary;
    public EmployeePayRecord(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
    public double pay() {
        return salary;
    }
}
