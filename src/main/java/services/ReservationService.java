package services;

import java.util.Date;

import org.springframework.stereotype.Service;

import exception.DomainException;
import model.Reservation;

@Service
public class ReservationService {

	public void updateDates(Reservation reservation, Date checkIn, Date checkOut) throws DomainException {

		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		reservation.setCheckIn(checkIn);
		reservation.setCheckOut(checkOut);
	}
}
