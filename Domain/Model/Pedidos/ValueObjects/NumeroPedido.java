package Domain.Model.Pedidos.ValueObjects;

 
// import ShareKernel.core.BussinessRuleValidateExeption;
// import ShareKernel.core.ValueObject;
// import ShareKernel.rule.StringNotNullOrEmptyRule;

import kernel.core.BussinessRuleValidateExeption;
import kernel.core.ValueObject;
import kernel.rule.StringNotNullOrEmptyRule;


public class NumeroPedido extends ValueObject {
    public String Value;

    public NumeroPedido(String value) {
        try {
            CheckRule(new StringNotNullOrEmptyRule(value));
        } catch (BussinessRuleValidateExeption e) {
             e.printStackTrace();
        }
        Value = value;
    }

}