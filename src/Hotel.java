
public class Hotel {

	private   String hotelName;
	private  int rateForRegularCustomerWeekDays;
	public Hotel(String hotelName, int rateForRegularCustomerWeekDays) {
		super();
		this.hotelName = hotelName;
		this.rateForRegularCustomerWeekDays = rateForRegularCustomerWeekDays;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRateForRegularCustomerWeekDays() {
		return rateForRegularCustomerWeekDays;
	}
	public void setRateForRegularCustomerWeekDays(int rateForRegularCustomerWeekDays) {
		this.rateForRegularCustomerWeekDays = rateForRegularCustomerWeekDays;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rateForRegularCustomerWeekDays=" + rateForRegularCustomerWeekDays
				+ "]";
	}
	

}
