public class Main
{
	public static void main(String[] args) {
		Mother m1 = new Child();
		m1.show();
		
		// in case both show functions of mother and child are not static runtime polymorphism(dynamic binding) will be followed
		// i.e. show function of the type of object will be shown
		
		// in case both show functions of mother and child are static compile time polymorphism(static binding) will be followed
		// i.e. show function of the type of reference variable will be shown
		
		// in case only one of the c;ass is static program will show an error and overriding won't be possible
	}
}