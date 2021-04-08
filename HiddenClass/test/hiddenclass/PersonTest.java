package hiddenclass;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

import model.Person;

public class PersonTest {
	
	
	@Test
    public void testHiddenClass() throws Throwable {
        PropertyAcessor<Person> accessor = GenerateClass.getPropertyAccessor(Person.class);

        Person customer = new Person("Duke", LocalDate.of(1990, Month.APRIL, 28), "Main Street", 30);
        assertEquals("Duke", accessor.getValue(customer, "name"));
        assertEquals(LocalDate.of(1990, Month.APRIL, 28), accessor.getValue(customer, "birthday"));
        assertEquals("Main Street", accessor.getValue(customer, "address"));
        assertEquals(30, accessor.getValue(customer, "age"));

        System.out.println(accessor.getClass().isHidden());
        System.out.println(accessor.getClass().getCanonicalName());
        
        assertTrue(accessor.getClass().isHidden());
        assertNull(accessor.getClass().getCanonicalName());
    }

	@Test()
    public void testCannotLoadHiddenClass() {
        PropertyAcessor<Person> accessor = GenerateClass.getPropertyAccessor(Person.class);
        
        try {
        	accessor.getClass().getClassLoader().loadClass(accessor.getClass().getName());
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Cannot Load Hidden Class");
		}
        
    }
    
    
}
