package accessor;

import hiddenclass.PropertyAcessor;
import model.Person;

public class PersonPropertyAccessorTemplate implements PropertyAcessor<Person>{

	@Override
	public Object getValue(Person instance, String property) {
		// TODO Auto-generated method stub
		if (property.equals("name")) {
            return instance.getName();
        }
		
		if (property.equals("age")) {
            return instance.getAge();
        }

        if (property.equals("birthday")) {
            return instance.getBirthday();
        }

        if (property.equals("address")) {
            return instance.getAddress();
        }

        throw new IllegalArgumentException("Unknown property: " + property);
	}

}
