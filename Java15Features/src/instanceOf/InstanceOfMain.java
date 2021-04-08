package instanceOf;

public class InstanceOfMain {

	public static void main(String[] args) {
		
		Object obj = "Text";

        // before
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("String: " + s);
        }

        // after
        if (obj instanceof String s) {
            System.out.println("String: " + s);
        }
		
	}
}
