package com.capgemini.pecuniafinance.service;

import com.capgemini.pecuniafinance.bean.Passbook;
import com.capgemini.pecuniafinance.dao.PassbookDaoImp;

public class PassbookServiceImp implements PassbookService {
	PassbookDaoImp dao = new PassbookDaoImp();


	@Override
	public Passbook getPassbookById(long id) {
		
		return dao.getPassbookById(id);
	}

	@Override
	public boolean updatePassbook(Passbook account) {
		String str = String.valueOf(account);
		if(str.matches("[1-9]{1}[0-9]{11}")){
			
		}else
			try {
				throw new Exception("Invalid account number");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		
		return dao.updatePassbook(account);
	}

}
