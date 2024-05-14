
public class Reservation {
	private String start_datetime;
	private String end_datetime;
	private User user = new User();
	private Hotel hotel = new Hotel();
	private Room room = new Room();

	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public String getStart_datetime() {
		return start_datetime;
	}
	public void setStart_datetime(String start_datetime) {
		this.start_datetime = start_datetime;
	}
	public String getEnd_datetime() {
		return end_datetime;
	}
	public void setEnd_datetime(String end_datetime) {
		this.end_datetime = end_datetime;
	}

}
