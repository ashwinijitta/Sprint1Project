package com.capgemini.pecuniafinance.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.pecuniafinance.bean.AccountSummary;
import com.capgemini.pecuniafinance.bean.Passbook;

public class PassbookDaoImp implements PassbookDao {
	Map<Long, Passbook> Accounts=new HashMap<>();
	public PassbookDaoImp() {
		addSomeAccount();
	}
	public void addSomeAccount() {
		Passbook ac1=new Passbook(1728134277L,2000.0F,99586566L,"Ashu",
					Arrays.asList(new com.capgemini.pecuniafinance.bean.AccountSummary(1012121L,LocalDate.now(),10000),
							new AccountSummary(1728134L,LocalDate.now().minusDays(10),3000),
							new AccountSummary(1728135L,LocalDate.now().minusDays(1),7000),
		                    new AccountSummary(1728136L,LocalDate.now().minusDays(2),8000),
		                    new AccountSummary(1728137L,LocalDate.now().minusDays(12),800),
		                    new AccountSummary(1728138L,LocalDate.now().minusDays(8),90909),
		                    new AccountSummary(1728139L,LocalDate.now().minusDays(25),9000)));
		
		Accounts.put(ac1.getAccountId(), ac1);
			}

	

	
	@Override
	public Passbook getPassbookById(long id) {
		
		return Accounts.get(id);
	}

	@Override
	public boolean updatePassbook(Passbook account) {
		if(!Accounts.containsKey(account.getAccountId())) {
			return false;
		}
		Passbook accountToUpdate=Accounts.get(account.getAccountId());
		accountToUpdate.setBalance(account.getBalance());
		return true;
	
	}

		

}
