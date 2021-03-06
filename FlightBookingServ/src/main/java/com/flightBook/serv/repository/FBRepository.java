package com.flightBook.serv.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.flightBook.serv.entity.BookingDetails;

public interface FBRepository extends JpaRepository<BookingDetails, BigInteger>{


	@Query(value = "select * from bookingdetails b where b.mail=?1", nativeQuery = true)
	public ResponseEntity<?> findBookingByMailId(String emailId);
}
