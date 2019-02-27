package services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import exception.DomainException;
import model.Reservation;

public class ReservationServiceTest {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Autowired
	private ReservationService service;

	@Test
	public void teste() throws DomainException, ParseException {


		Reservation reservation = new Reservation(1, sdf.parse("27/02/2019"), sdf.parse("04/03/2019"));

		service.updateDates(reservation,  sdf.parse("01/03/2019"), sdf.parse("05/03/2019"));

		assertTrue(true);
	}
}
