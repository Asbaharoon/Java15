package hiddenclass;

public interface PropertyAcessor<T> {

	Object getValue(T instance, String property);
}
