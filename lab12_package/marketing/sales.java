
package marketing;

import general.*;

public class sales extends Employee {
    public sales(String name, int id) {
        super(name, id);
    }

    public double tallowance(int basic) {
        double earn = this.earnings(basic);
        double t = 0.05 * earn;
        return t;
    }
}