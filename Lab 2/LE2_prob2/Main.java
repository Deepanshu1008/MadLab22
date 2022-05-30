public class Main
{
	public static void main(String[] args) {
		Mother m = new Mother();
		m.show();   // function overridden
		Child ch = new Child();
		ch.show();  // function overriding
	}
}