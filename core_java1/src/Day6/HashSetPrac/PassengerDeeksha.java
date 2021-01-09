package Day6.HashSetPrac;

public class PassengerDeeksha {
		
		private String PassengerName;
		private int PassengerId;
		
		public String getPassengerName() {
			return PassengerName;
		}
		public void setPassengerName(String passengerName) {
			PassengerName = passengerName;
		}
		public int getPassengerId() {
			return PassengerId;
		}
		public void setPassengerId(int passengerId) {
			PassengerId = passengerId;
		}
		public PassengerDeeksha(String passengerName, int i) {
			super();
			PassengerName = passengerName;
			PassengerId = i;
		}
		@Override
		public String toString() {
			return "Passenger [PassengerName=" + PassengerName + ", PassengerId=" + PassengerId + "]";
		}

}
