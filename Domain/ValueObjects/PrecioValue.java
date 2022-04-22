package Domain.ValueObjects;

import ShareKernel.core.*;

public class PrecioValue extends ValueObject {
    public double Value;

    public PrecioValue(double precio) {
        if (precio < 0) {
            try {
                throw new BussinessRuleValidateExeption("Price value cannot be negative");
            } catch (BussinessRuleValidateExeption e) {
                 e.printStackTrace();
            }
        }
        Value = precio;
    }

}
