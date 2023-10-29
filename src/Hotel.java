
public class Hotel {
private   String hotelName;
private  int rating;
private  int rateForRegularCustomerWeekDays;
private  int rateForRewardCustomerWeekDays;	
private   int rateForRegularCustomerWeekends;
private  int rateForRewardCustomerWeekends;
public Hotel(String hotelName, int rating, int rateForRegularCustomerWeekDays, int rateForRewardCustomerWeekDays,
		int rateForRegularCustomerWeekends, int rateForRewardCustomerWeekends) {
	super();
	this.hotelName = hotelName;
	this.rating = rating;
	this.rateForRegularCustomerWeekDays = rateForRegularCustomerWeekDays;
	this.rateForRewardCustomerWeekDays = rateForRewardCustomerWeekDays;
	this.rateForRegularCustomerWeekends = rateForRegularCustomerWeekends;
	this.rateForRewardCustomerWeekends = rateForRewardCustomerWeekends;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public int getRateForRegularCustomerWeekDays() {
	return rateForRegularCustomerWeekDays;
}
public void setRateForRegularCustomerWeekDays(int rateForRegularCustomerWeekDays) {
	this.rateForRegularCustomerWeekDays = rateForRegularCustomerWeekDays;
}
public int getRateForRewardCustomerWeekDays() {
	return rateForRewardCustomerWeekDays;
}
public void setRateForRewardCustomerWeekDays(int rateForRewardCustomerWeekDays) {
	this.rateForRewardCustomerWeekDays = rateForRewardCustomerWeekDays;
}
public int getRateForRegularCustomerWeekends() {
	return rateForRegularCustomerWeekends;
}
public void setRateForRegularCustomerWeekends(int rateForRegularCustomerWeekends) {
	this.rateForRegularCustomerWeekends = rateForRegularCustomerWeekends;
}
public int getRateForRewardCustomerWeekends() {
	return rateForRewardCustomerWeekends;
}
public void setRateForRewardCustomerWeekemds(int rateForRewardCustomerWeekemds) {
	this.rateForRewardCustomerWeekends = rateForRewardCustomerWeekemds;
}	
   
public void displayHotelDetails() {
	System.out.println("The Name of The hotel is :"+this.hotelName);
	System.out.println("The Rating of The hotel is :"+this.rating);
	System.out.println("The Rate for Weekdays for Regular Customer is :"+this.rateForRegularCustomerWeekDays);
	System.out.println("The Rate for Weekdays for Reward Customer is :"+this.rateForRewardCustomerWeekDays);
	System.out.println("The Rate for Weekends for Regular Customer is :"+this.rateForRegularCustomerWeekends);
	System.out.println("The Rate for Weekends for Reward Customer is :"+this.rateForRewardCustomerWeekends);
    System.out.println();
}

           public int costForDay(int i,String s) {
        	   if(s==null)
        		   return 0;
        	   if(s=="MONDAY"||s=="TUESDAY"||s=="WEDNESDAY"||s=="THURSDAY"||s=="FRIDAY") {
        		  if(i==1) {
        			  return this.rateForRegularCustomerWeekDays;
        		  }else {
        			  return this.rateForRewardCustomerWeekDays;
        		  }
        	   }else {
        		   if(i==1) {
         			  return this.rateForRegularCustomerWeekends;
         		  }else {
         			  return this.rateForRewardCustomerWeekends;
         		  }  
        	   }
        	   
			        	   
           }

}
