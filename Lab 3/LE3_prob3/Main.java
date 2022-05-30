/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		duck wd = new WD();
		duck rd = new RD();
		duck rhd = new RHD();
		duck ld = new LD();
		
		wd.display();
		wd.performFly();
		wd.performQuack();
		wd.swim();
		
		
		rd.display();
		rd.performFly();
		rd.performQuack();
		rd.swim();
		
		rhd.display();
		rhd.performFly();
		rhd.performQuack();
		rhd.swim();
		
		ld.display();
		ld.performFly();
		ld.performQuack();
		ld.swim();
	}
}
