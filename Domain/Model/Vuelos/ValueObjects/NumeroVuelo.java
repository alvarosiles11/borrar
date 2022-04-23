package Domain.Model.Vuelos.ValueObjects;

import kernel.core.BussinessRuleValidateExeption;
import kernel.core.ValueObject;
import kernel.rule.StringNotNullOrEmptyRule;

public class NumeroVuelo extends ValueObject {
    public String Value;

    public NumeroVuelo(String value) {
        try {
            CheckRule(new StringNotNullOrEmptyRule(value));
        } catch (BussinessRuleValidateExeption e) {
             e.printStackTrace();
        }
        Value = value;
    }

}