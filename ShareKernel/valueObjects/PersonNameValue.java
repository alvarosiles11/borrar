
package ShareKernel.valueObjects;

import ShareKernel.core.BussinessRuleValidateExeption;
import ShareKernel.core.ValueObject;
import ShareKernel.rule.StringNotNullOrEmptyRule;

 
public class PersonNameValue extends ValueObject{

    public static String Name;

    public PersonNameValue(String nombre) {
        try {
            CheckRule(new StringNotNullOrEmptyRule(nombre));
        } catch (BussinessRuleValidateExeption e1) {
            e1.printStackTrace();
        }
        if (nombre.length() < 500) {
            try {
                throw new BussinessRuleValidateExeption("PersonName can't be more than 500 characters");
            } catch (BussinessRuleValidateExeption e) {
                 e.printStackTrace();
            }
        }
        Name = nombre;
    }


 
}
