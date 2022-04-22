package Domain.Model.Vuelos.ValueObjects;

import ShareKernel.core.BussinessRuleValidateExeption;
import ShareKernel.core.ValueObject;
import ShareKernel.rule.StringNotNullOrEmptyRule;

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