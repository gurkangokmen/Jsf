import java.util.ArrayList;
import java.util.List;

public class ReservationBean {
	
	private Reservation reservation = new Reservation();
	
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	public void save() {
		reservations.add(reservation);
		System.out.print("New Entry: ");
		System.out.print(reservation.getUser().getName() + " ");
		System.out.print(reservation.getUser().getSurname()+ " ");
		System.out.print(reservation.getUser().getAge()+ " ");
		System.out.print(reservation.getUser().getGender()+ " ");
		System.out.print(reservation.getHotel().getName()+ " ");
		System.out.print(reservation.getRoom().getType()+ " ");
		System.out.print(reservation.getStart_datetime()+ " ");
		System.out.print(reservation.getEnd_datetime()+ " ");
		System.out.print("- ("+reservations.size()+")");
		System.out.println();
		
		reservation = new Reservation();
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	
	
	
}
