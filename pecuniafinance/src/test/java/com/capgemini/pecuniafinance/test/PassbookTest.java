package com.capgemini.pecuniafinance.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.pecuniafinance.bean.AccountSummary;
import com.capgemini.pecuniafinance.bean.Passbook;
import com.capgemini.pecuniafinance.dao.PassbookDao;
import com.capgemini.pecuniafinance.dao.PassbookDaoImp;

class PassbookTest {
	PassbookDao dao;
	Passbook p = new Passbook();
	Passbook ac1=new Passbook(1728134277L,2000.0F,99586566L,"Ashu",
			Arrays.asList(new com.capgemini.pecuniafinance.bean.AccountSummary(1012121L,LocalDate.now(),10000),
					new AccountSummary(1728134L,LocalDate.now().minusDays(10),3000),
					new AccountSummary(1728135L,LocalDate.now().minusDays(1),7000),
                    new AccountSummary(1728136L,LocalDate.now().minusDays(2),8000),
                    new AccountSummary(1728137L,LocalDate.now().minusDays(12),800),
                    new AccountSummary(1728138L,LocalDate.now().minusDays(8),90909),
                    new AccountSummary(1728139L,LocalDate.now().minusDays(25),9000)));

	
	
	
	@BeforeEach
	public void addAccount() {
		dao = new PassbookDaoImp();
		
	}
	

	@Test
	void testAddSomeAccount() {
		assertEquals(0, p.getAccountId());
	}

}
