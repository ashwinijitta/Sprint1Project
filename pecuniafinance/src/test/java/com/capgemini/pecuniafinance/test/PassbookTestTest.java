package com.capgemini.pecuniafinance.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.capgemini.pecuniafinance.dao.PassbookDao;
import com.capgemini.pecuniafinance.dao.PassbookDaoImp;

class PassbookTestTest {
	static PassbookDao dao = new PassbookDaoImp();

	@Test
	void testGetPassbookById() {

		assertEquals(true, dao.getPassbookById(1728134277));

	}

	@Test
	void testUpdatePassbook() {
		fail("Not yet implemented");
	}

}
