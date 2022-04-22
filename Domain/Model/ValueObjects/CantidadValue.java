package Domain.Model.ValueObjects;

import ShareKernel.core.BussinessRuleValidateExeption;
import ShareKernel.core.ValueObject;

public   class CantidadValue extends ValueObject {
    public Integer Value;

    public CantidadValue(Integer precio) {
        if (precio <= 0) {
            try {
                throw new BussinessRuleValidateExeption("La cantidad no puede ser negativa o cero");
            } catch (BussinessRuleValidateExeption e) {
                 e.printStackTrace();
            }
        }
        Value = precio;
    }

}