import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationSystem {
    List<Hotel> hotelList=new ArrayList<Hotel>();
   public void addHotel(Hotel hotel) {
	   hotelList.add(hotel);
   }

	public static void main(String[] args) {
           Hotel hotel1=new Hotel("Lakewood",3,110,80,90,80);
           Hotel hotel2=new Hotel("Bridegewood",4,160,110,60,50);
           Hotel hotel3=new Hotel("Ridgewood",5,220,100,150,40);
           HotelReservationSystem hrs=new HotelReservationSystem();
           hrs.addHotel(hotel1);
           hrs.addHotel(hotel2);
           hrs.addHotel(hotel3);
           Scanner sc=new Scanner(System.in);
           
         //  hrs.countMinimumRate(1, hrs.togetDay(), hrs.togetDay());
           
           System.out.println("What Type of Customer are you");
           System.out.println("1.For Regular Customer");
           System.out.println("2.For Reward Customer");
           System.out.println("Enter your choice");
           int choice=sc.nextInt();
           if(choice==1) {
           hrs.BestRated(1, hrs.togetDay(), hrs.togetDay());
           }else {
               hrs.BestRated(2, hrs.togetDay(), hrs.togetDay());
   
           }

	}
	private void BestRated(int i, String togetDay, String togetDay2) {
		int sum1=hotelList.get(0).costForDay(i, togetDay)+hotelList.get(0).costForDay(i, togetDay2);
		int sum2=hotelList.get(1).costForDay(i, togetDay)+hotelList.get(1).costForDay(i, togetDay2);
		int sum3=hotelList.get(2).costForDay(i, togetDay)+hotelList.get(2).costForDay(i, togetDay2);
        if(hotelList.get(0).getRating()>hotelList.get(1).getRating()&&hotelList.get(0).getRating()>hotelList.get(2).getRating()) {
        	System.out.println("The minimum rate for the hotel "+hotelList.get(0).getHotelName()+" and it is "+sum1+"$"+" and the Rating of Hotel is :"+hotelList.get(0).getRating());
        }else if(hotelList.get(1).getRating()>hotelList.get(2).getRating()) {
        	System.out.println("The minimum rate for the hotel "+hotelList.get(1).getHotelName()+" and it is "+sum2+"$"+" and the Rating of Hotel is :"+hotelList.get(1).getRating());

        }else {
        	System.out.println("The minimum rate for the hotel "+hotelList.get(2).getHotelName()+" and it is "+sum3+"$"+" and the Rating of Hotel is :"+hotelList.get(2).getRating());

        }

		
	}

	public String togetDay(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year:- ");
        int year=sc.nextInt();
        System.out.print("Enter the Month:- ");
        int month= sc.nextInt();
        System.out.print("Enter the Day:- ");
        int day=sc.nextInt();

        LocalDate date1= LocalDate.of(year, month, day);
        return String.valueOf(date1.getDayOfWeek());
    }
	
	public void countMinimumRate(int i,String day1, String day2) {
		int sum1=hotelList.get(0).costForDay(i, day1)+hotelList.get(0).costForDay(i, day2);
		int sum2=hotelList.get(1).costForDay(i, day1)+hotelList.get(1).costForDay(i, day2);
		int sum3=hotelList.get(2).costForDay(i, day1)+hotelList.get(2).costForDay(i, day2);
		
            if(sum1<sum2&&sum1<sum3) {
            	System.out.println("The minimum rate for the hotel "+hotelList.get(0).getHotelName()+" and it is "+sum1+"$"+" and the Rating of Hotel is :"+hotelList.get(0).getRating());
            }else if(sum2<sum3) {
            	System.out.println("The minimum rate for the hotel "+hotelList.get(1).getHotelName()+" and it is "+sum2+"$"+" and the Rating of Hotel is :"+hotelList.get(1).getRating());

            }else {
            	System.out.println("The minimum rate for the hotel "+hotelList.get(2).getHotelName()+" and it is "+sum3+"$"+" and the Rating of Hotel is :"+hotelList.get(2).getRating());

            }
	}

}
