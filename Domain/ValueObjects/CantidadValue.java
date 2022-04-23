package Domain.ValueObjects;

import kernel.core.BussinessRuleValidateExeption;
import kernel.core.ValueObject;

public class CantidadValue extends ValueObject {
    public Integer Value;

    public CantidadValue(Integer cantidad) {
        if (cantidad <= 0) {
            try {
                throw new BussinessRuleValidateExeption("La cantidad no puede ser negativa o cero");
            } catch (BussinessRuleValidateExeption e) {
                e.printStackTrace();
            }
        }
        Value = cantidad;
    }

}