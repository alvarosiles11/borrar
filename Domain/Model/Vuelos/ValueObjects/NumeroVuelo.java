package Domain.Model.Vuelos.ValueObjects;

import SharedKernel.core.BussinessRuleValidateExeption;
import SharedKernel.core.ValueObject;
import SharedKernel.rule.StringNotNullOrEmptyRule;

public class NumeroVuelo extends ValueObject {
    public String value;

    public NumeroVuelo(String _value) throws BussinessRuleValidateExeption {
        CheckRule(new StringNotNullOrEmptyRule(_value));
        this.value = _value;
    }

    @Override
    public String toString() {
        return value;
    }
}