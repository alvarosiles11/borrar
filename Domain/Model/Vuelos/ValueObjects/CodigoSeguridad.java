package Domain.Model.Vuelos.ValueObjects;

import ShareKernel.core.BussinessRuleValidateExeption;
import ShareKernel.core.ValueObject;
import ShareKernel.rule.StringNotNullOrEmptyRule;

public class CodigoSeguridad extends ValueObject {
    public String Value;

    public CodigoSeguridad(String value) {
        try {
            CheckRule(new StringNotNullOrEmptyRule(value));
        } catch (BussinessRuleValidateExeption e) {
             e.printStackTrace();
        }
        Value = value;
    }

}