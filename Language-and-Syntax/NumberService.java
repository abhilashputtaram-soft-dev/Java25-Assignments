public class NumberService {
	
	public static int process(Object value) {
		if (value instanceof Integer) {
			int i = (Integer) value;
			return i * 2;
		
		} else if (value instanceof Long) {
			long l = (Long) value;
			return (int) (l + 100);
		
		} else if (value instanceof Double) {
			double d = (Double) value;
			return (int) (d / 2);
		}
		throw new IllegalArgumentException("Unsupported type");
	}
}
