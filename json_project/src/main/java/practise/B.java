/**
 * 
 */
package practise;

/**
 * @author Atal
 *
 */
public class B extends A {

	
	public void update() {
		System.out.println("KCH kriye");
		
	}
	public static void main(String args []) {
		B b = (B) new A();
		A a = new B();
		b.update();
		a.update();
		
	}
}
