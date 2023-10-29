import java.util.ArrayList;
import java.util.List;


public class HotelReservationSystem {
    List<Hotel> hotelList=new ArrayList<Hotel>();
   public void addHotel(Hotel hotel) {
	   hotelList.add(hotel);
   }


	public static void main(String[] args) {
        Hotel hotel1= new Hotel("Lakewood",110);
        Hotel hotel2= new Hotel("Bridgewood",160);
        Hotel hotel3= new Hotel("Ridgewood",220);
        HotelReservationSystem hrs=new HotelReservationSystem();
        hrs.addHotel(hotel1);
        hrs.addHotel(hotel2);
        hrs.addHotel(hotel3);
        System.out.println(hrs.hotelList);

	}

}
