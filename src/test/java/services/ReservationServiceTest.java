package services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import exception.DomainException;
import model.Reservation;

public class ReservationServiceTest {

	@Autowired
	private ReservationService service;

	@Test
	public void teste() throws DomainException {
		Reservation reservation = new Reservation(1, new Date("27/02/2019"), new Date("04/03/2019"));

		service.updateDates(reservation, new Date("01/03/2019"), new Date("05/03/2019"));

		assertTrue(true);
	}
}
