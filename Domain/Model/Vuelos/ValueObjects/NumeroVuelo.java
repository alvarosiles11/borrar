package Domain.Model.Vuelos.ValueObjects;

import SharedKernel.core.BussinessRuleValidateExeption;
import SharedKernel.core.ValueObject;
import SharedKernel.rule.StringNotNullOrEmptyRule;

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