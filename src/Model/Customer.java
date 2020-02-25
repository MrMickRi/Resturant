package Model;
/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class Customer {

	private String name; 
	private String mobile;
	private int partySize;
	private boolean smoking;
	
	public Customer() {
		this.name = "";
		this.mobile ="";
		this.partySize=0;
		this.smoking=false;
	}
	public Customer(String name, String mobile,int partySize,boolean smoking) {
		this.name = name;
		this.mobile = mobile;
		this.partySize = partySize;
		this.smoking = smoking;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the partySize
	 */
	public int getPartySize() {
		return partySize;
	}
	/**
	 * @param partySize the partySize to set
	 */
	public void setPartySize(int partySize) {
		this.partySize = partySize;
	}
	/**
	 * @return the smoking
	 */
	public boolean isSmoking() {
		return smoking;
	}
	/**
	 * @param smoking the smoking to set
	 */
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + ", partySize=" + partySize + ", smoking=" + smoking
				+ "]";
	}

	
	
}
