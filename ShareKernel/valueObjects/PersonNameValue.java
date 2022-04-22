
package ShareKernel.valueObjects;

import ShareKernel.core.BussinessRuleValidateExeption;

public record PersonNameValue(String name) {

    public static String Name;

    public PersonNameValue{
        if(name.length()>500){
            try {
                throw new BussinessRuleValidateExeption("PersonName can't be more than 500 characters");
            } catch (BussinessRuleValidateExeption e) {
                 e.printStackTrace();
            }
        }
        Name= name;
    }

}
