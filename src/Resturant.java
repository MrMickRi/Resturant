import Model.Customer;
import Model.Table;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class Resturant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("michael","089",1,true);
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Table t1 = new Table(1);
		Table t2 = new Table(2);
		Table t3 = new Table(3);
		
		t1.booking(c1);
		if(t1.isBooked()==true) {
			System.out.println(t1.isBooked());
			System.out.println(t1.toString());
		}else {
			System.out.println("This tabie s NOT booked");
		}
	}
}
