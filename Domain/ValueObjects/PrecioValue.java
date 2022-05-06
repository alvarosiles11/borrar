package Domain.ValueObjects;

import SharedKernel.core.*;
import SharedKernel.core.BussinessRuleValidateExeption;

public class PrecioValue extends ValueObject {
    public double Value;

    public PrecioValue(double precio) {
        if (precio < 0) {
            try {
                throw new BussinessRuleValidateExeption("Precio no puede ser negativo");
            } catch (BussinessRuleValidateExeption e) {
                e.printStackTrace();
            }
        }
        Value = precio;
    }

}
