package com.capgemini.pecuniafinance.dao;

import com.capgemini.pecuniafinance.bean.Passbook;

public interface PassbookDao
{
	
	public Passbook getPassbookById(long id);
	public boolean updatePassbook(Passbook account);
	
	
}
