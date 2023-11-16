
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class AirLineReservationDetails {

	private String passengerName;
	private String country;
	private int passportId;
	private String bordingLocation;
	private String destinationLocation;
	private Double amount;
	private Date reservationDate;

	public AirLineReservationDetails(String passengerName, int passportId, String bordingLocation,
			String destinationLocation, Double amount, Date reservationDate) {
		this.setPassengerName(passengerName);
		this.setPassportId(passportId);
		this.setBordingLocation(bordingLocation);
		this.setDestinationLocation(destinationLocation);
		this.setAmount(amount);
		this.setReservationDate(reservationDate);

	}

	public AirLineReservationDetails() {
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getBordingLocation() {
		return bordingLocation;
	}

	public void setBordingLocation(String bordingLocation) {
		this.bordingLocation = bordingLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
}

class FlightDetails {

	private String flightNumber;
	private String airlinename;
	private String bordingLocation;
	private String destinationLocation;
	private Double amount;
	private String reservationDate;

	public FlightDetails(String flightNumber, String airlinename, String bordingLocation, String destinationLocation,
			Double amount, String reservationDate) {
		super();
		this.flightNumber = flightNumber;
		this.airlinename = airlinename;
		this.bordingLocation = bordingLocation;
		this.destinationLocation = destinationLocation;
		this.amount = amount;
		this.reservationDate = reservationDate;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirlinename() {
		return airlinename;
	}

	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}

	public String getBordingLocation() {
		return bordingLocation;
	}

	public void setBordingLocation(String bordingLocation) {
		this.bordingLocation = bordingLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}

	@Override
	public String toString() {
		return "FlightDetails [flightNumber=" + flightNumber + ", airlinename=" + airlinename + ", bordingLocation="
				+ bordingLocation + ", destinationLocation=" + destinationLocation + ", amount=" + amount
				+ ", reservationDate=" + reservationDate + "]";
	}

}

/**
 * 
 * class Passanger for storing passgenger information
 *
 */
class Passanger {
	private String passengerName;

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Passanger() {

	}

	public Passanger(String passengerName) {
		super();
		this.passengerName = passengerName;
	}

	@Override
	public String toString() {
		return "Passanger [passengerName=" + passengerName + "]";
	}

}

/**
 * 
 * class used for storing reservation information
 *
 */
class Ticket {
	private LocalDate departureDate;
	private FlightDetails flight;
	private Passanger passenger;
	private Seat seat;

	public Ticket() {
		departureDate = LocalDate.now();

	}

	public Ticket(LocalDate departureDate, FlightDetails flight, Passanger passenger, Seat seat) {
		super();
		this.departureDate = departureDate;
		this.flight = flight;
		this.passenger = passenger;
		this.seat = seat;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public FlightDetails getFlight() {
		return flight;
	}

	public void setFlight(FlightDetails flight) {
		this.flight = flight;
	}

	public Passanger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passanger passenger) {
		this.passenger = passenger;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return "Ticket [departureDate=" + departureDate + ", flight=" + flight + ", passenger=" + passenger + ", seat="
				+ seat + "]";
	}

}

class Reservation {

	private ArrayList<Seat> seats;
	private ArrayList<Passanger> passangers;
	private ArrayList<FlightDetails> flights;
	private ArrayList<Ticket> ticket;

	public Reservation() {

		seats = new ArrayList<Seat>();
		passangers = new ArrayList<Passanger>();
		flights = new ArrayList<FlightDetails>();
		ticket = new ArrayList<Ticket>();
		initFlights();
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

	public ArrayList<Passanger> getPassanger() {
		return passangers;
	}

	public void setPassanger(ArrayList<Passanger> passanger) {
		this.passangers = passanger;
	}

	public ArrayList<FlightDetails> getFlight() {
		return flights;
	}

	public void setFlight(ArrayList<FlightDetails> flight) {
		this.flights = flight;
	}

	public ArrayList<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(ArrayList<Ticket> ticket) {
		this.ticket = ticket;
	}

	public void addFlight(String flightNumber, String airlinename, String bordingLocation, String destinationLocation,
			Double amount, String reservationDate) {
		flights.add(new FlightDetails(flightNumber, airlinename, bordingLocation, destinationLocation, amount,
				reservationDate));

	}

	public void addFlight() {
		// get the input from the user
		try {
			System.out.println("Enter Flights Number:");
			Scanner scanner = new Scanner(System.in);
			String flightNumber = scanner.nextLine();
			System.out.println("Enter Flight Airline name:");

			String flightName = scanner.nextLine();
			System.out.println("Enter Flight From :");

			String bordingLocation = scanner.nextLine();
			System.out.println("Enter Flight To:");

			String destinationLocation = scanner.nextLine();
			System.out.println("Enter Ticket Charges:");

			double amount = scanner.nextDouble();

			System.out.println("Reservation date(dd-MM-yyyy)");
			Scanner scanner5 = new Scanner(System.in);
			String reservationDate = scanner5.nextLine();

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

			try {

				Date date = formatter.parse(reservationDate);
				addFlight(flightNumber, flightName, bordingLocation, destinationLocation, amount, reservationDate);

			} catch (ParseException e) {
				System.out.println("Please Enter date in dd-MM-yyyy format");
				e.printStackTrace();
			}

			System.out.println("***********************************************");
			System.out.println(" Flight is Added successfully");
			System.out.println("***********************************************");

		} catch (Exception i) {
			System.out.println("Please select proper input");
			i.printStackTrace();
		}

	}

	public boolean addPassenger(String passengerName) {
		boolean passengerExists = false;

		for (Passanger item : getPassanger()) {
			if (passengerName.equals(item.getPassengerName())) {
				passengerExists = true;
			}

		}
		if (passengerExists == false) {
			passangers.add(new Passanger(passengerName));
		}
		return passengerExists;
	}

	public void addSeat(int seatNumber) {

		seats.add(new Seat(seatNumber));
	}

	public String addTicket(LocalDate departureDate, String passengerName, String flightNumber, int seatNumber) {
		// find the passenger object
		Passanger ticketPassenger = null;
		for (Passanger item : getPassanger()) {
			if (passengerName.equals(item.getPassengerName())) {
				ticketPassenger = item;
			}
		}
		// Find the flight object
		FlightDetails ticketFlight = null;
		for (FlightDetails item : getFlight()) {
			if (flightNumber.equalsIgnoreCase(item.getFlightNumber())) {
				ticketFlight = item;
			}
		}

		// Find the seat object
		Seat ticketSeat = null;
		for (Seat item : getSeats()) {
			if (seatNumber == item.getSeatNo()) {
				ticketSeat = item;
			}
		}
		// combining information on ticket object
		Ticket tmpTicket = new Ticket();
		tmpTicket.setDepartureDate(departureDate);
		tmpTicket.setPassenger(ticketPassenger);
		tmpTicket.setFlight(ticketFlight);
		tmpTicket.setSeat(ticketSeat);

		// adding ticket object to Ticket arraylist
		ticket.add(tmpTicket);
		return tmpTicket.toString();
	}

	public ArrayList<Seat> getOpenSeats(LocalDate departureDate, String flightNumber) {
		ArrayList<Seat> openSeats = getSeats();
		for (Ticket item : getTicket()) {
			if (departureDate.equals(item.getDepartureDate())
					&& flightNumber.equalsIgnoreCase(item.getFlight().getFlightNumber())) {
				openSeats.remove(item.getSeat());
			}
		}
		return openSeats;
	}

	public void initFlights() {

		addSeat(1);
		addSeat(2);
		addSeat(3);
		addSeat(4);
		addSeat(5);
		addSeat(6);
		addFlight("KU678", "Kuwait Airways", "Dubai International Airport", "John F. Kennedy International Airport ",
				25000.5, "2022-12-11");
		addFlight("LH 639", "Lufthansa", "Dubai", "Manchester", 48798.0, "2022-12-11");
		addFlight("LH 419", "Lufthansa", "Dubai", "Cleveland", 23000.5, "2022-12-11");
		addFlight("LH 638", "Lufthansa", "Dubai", "Rome", 21000.5, "2022-12-11");
		addFlight("GF 515", "Gulf Air", "Dubai", "Mumbai", 26875.0, "2022-12-11");

	}

	public void PrintMenu() {
		System.out.println("	***********************************************");
		System.out.println("		Welcome AirLine Reservation System");
		System.out.println("	***********************************************");
		System.out.println("		Press 1 to Add Flight");
		System.out.println("		Press 2 to Create Flight Booking ");
		System.out.println("		Press 3 to Display Booking Details");
		System.out.println("		Press 4 to Display Flights Details");
		System.out.println("		Press 5 to exit");
		System.out.println("	***********************************************");
		System.out.println("Enter Your Choice:");
	}

	public void DisplayFlightDetails() {

		System.out.println("***********************************************");
		for (FlightDetails flight : getFlight()) {
			System.out.println(flight.getFlightNumber() + "\t" + flight.getAirlinename() + "\t"
					+ flight.getBordingLocation() + "\t To \t" + flight.getDestinationLocation() + "\t"
					+ flight.getAmount() + "\t" + flight.getReservationDate());
		}
		System.out.println("***********************************************");
	}

}

/**
 * 
 * This class is used for storing seat information
 *
 */
class Seat {
	private int seatNo;

	public Seat() {
		seatNo = 0;
	}

	public Seat(int seatNo) {
		super();
		this.seatNo = seatNo;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "Seat [seatNo=" + seatNo + "]";
	}

}

public class AirlineReservation {

	static Reservation reservation = new Reservation();
	String passengerName = null;
	int flightNumber = 0;
	int seatNumber = 0;
	static LocalDate departureDate = LocalDate.now();

	public static void main(String[] args) throws InterruptedException {

		reservation.PrintMenu();
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		do {
			switch (choice) {
			case 1:
				reservation.addFlight();
				break;
			case 2:
				createFlightBooking();
				break;
			case 3:
				displaybookingDetails();
				break;
			case 4:
				reservation.DisplayFlightDetails();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
			reservation.PrintMenu();
			scanner = new Scanner(System.in);
			choice = scanner.nextInt();
		} while (choice > 0 && choice < 9);
	}

	public static void displaybookingDetails() {

		for (Ticket t : reservation.getTicket()) {
			System.out.println(t.toString());
		}

	}

	public static void createFlightBooking() throws InterruptedException {

		System.out.println("Enter Your name");
		Scanner sc = new Scanner(System.in);
		String passengerName = sc.nextLine();

		boolean result = reservation.addPassenger(passengerName);

		if (result) {
			System.out.println("Welcome back: " + passengerName);
		} else {
			System.out.println("Welcome: " + passengerName);
		}
		// show flights and ask for flights
		System.out.println("\nHere are available flights: ");

		reservation.DisplayFlightDetails();

		System.out.println("Enter the flight no to book");

		Scanner scanner = new Scanner(System.in);
		String flightNumber = scanner.nextLine();

		System.out.println("\nAssuming you are flying today,");
		System.out.println("Here are available seats on that flight: ");
		ArrayList<Seat> openSeats = reservation.getOpenSeats(departureDate, flightNumber);
		for (Seat item : openSeats) {
			System.out.print(item.getSeatNo() + ",");
		}
		System.out.println("\nEnter the seat you want: ");

		Scanner scanner2 = new Scanner(System.in);
		int seatNo = scanner2.nextInt();

		String ticketInfo = reservation.addTicket(departureDate, passengerName, flightNumber, seatNo);
		System.out.println("\nReservations Successful!! Here are your ticket details");
		System.out.println(ticketInfo + "\n");

	}

}