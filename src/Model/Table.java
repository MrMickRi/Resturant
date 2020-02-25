package Model;
/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class Table {

	private int tableID;
	private boolean smoking;
	private int capacity; 
	private
	boolean booked;
	private Customer bookedBy;
		public Table (int tableID) {
			this.tableID = tableID;
			this.smoking = true;
			this.capacity = 1;
			this.bookedBy = null;
		}

		/**
		 * @return the bookedBy
		 */
		public Customer getBookedBy() {
			return bookedBy;
		}

		/**
		 * @param bookedBy the bookedBy to set
		 */
		public void setBookedBy(Customer bookedBy) {
			this.bookedBy = bookedBy;
		}

		/**
		 * @return the tableID
		 */
		public int getTableID() {
			return tableID;
		}

		/**
		 * @param tableID the tableID to set
		 */
		public void setTableID(int tableID) {
			this.tableID = tableID;
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

		/**
		 * @return the capacity
		 */
		public int getCapacity() {
			return capacity;
		}

		/**
		 * @param capacity the capacity to set
		 */
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		/**
		 * @return the booked
		 */
		public boolean isBooked() {
			return booked;
		}

		/**
		 * @param booked the booked to set
		 */
		public void setBooked(boolean booked) {
			this.booked = booked;
		}
		public boolean booking(Customer customer) {
			if(booked) {
				return false;
			}else{
				this.booked = true;
				this.bookedBy = customer;
				return true;
			}
		}
		public String toString() {
			String toReturn =""+bookedBy;
			return toReturn;
		}
		
}
