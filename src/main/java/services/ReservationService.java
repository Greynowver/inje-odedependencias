package services;

import exception.DomainException;

import java.util.Date;

public class ReservationService {

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Error in reservation: Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

}
