package com.capgemini.pecuniafinance.service;

import com.capgemini.pecuniafinance.bean.Passbook;

public interface PassbookService 
{
    
	public Passbook getPassbookById(long id);
	public boolean updatePassbook(Passbook account);

}
