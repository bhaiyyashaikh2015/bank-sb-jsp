package com.bhaiyya.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhaiyya.bank.entity.Account;
import com.bhaiyya.bank.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repo;
	
	public List<Account> listAll() {
		System.out.println("********************inside service****************************************");
		return repo.findAll();
	}

	public void save(Account acc) {
		repo.save(acc);
	}

	@Transactional
	public void delete(String email) {
		repo.deleteByEmail(email);

	}
	@Transactional
	public void findAccByEmail(String email) {
		List<Account> findByEmail = repo.findByEmail(email);
		if(findByEmail!=null && findByEmail.size()>0)
		{
			Account account = findByEmail.get(0);
			repo.deleteById(account.getAccnumber());
		}
		
	}
	public List<Account> findPhoneByEmail(String email)
	{
		return repo.findByEmailOrPhone(email, "0123456789");
	}
	
	@Transactional
	public void deleteByEmailAndPhone(String email){
		repo.deleteByEmailAndPhone(email, "123");
	}
	
	@Transactional
	public void deleteByEmailOrPhone(String email){
		repo.deleteByEmailOrPhone(email, null);
	}
	
	public Account findByAccnumber(Long accnumber) {
		
		Account acc = repo.findByAccnumber(accnumber);
		System.out.println("------_"+acc);
		System.out.println("------_"+acc.getBalance());
		return acc;
	}
	
	public Account findByAccnumberToDeposit(Long accnumber, String amount) {
		
		System.out.println("************IN DEPOSIT");

		Account acc = repo.findByAccnumber(accnumber);
		System.out.println("------"+accnumber);
		System.out.println("------"+amount+10);
		int depositamount = Integer.parseInt(amount);
		
		System.out.println("------"+acc);
		System.out.println("------"+acc.getAccnumber());

		System.out.println("------"+acc.getBalance());
		int bal = Integer.parseInt(acc.getBalance());
		
		bal = bal + depositamount;
		
		String balance = Integer.toString(bal);
//		acc.setBalance(balance);
		System.out.println("------"+balance);
		
		// partial update in JPA (load and save approach)
	    acc.setBalance(balance);
	    repo.save(acc);
		return acc;
	}
	
	public Account findByAccnumberToWithdraw(Long accnumber, String amount) {
		
		System.out.println("************IN WITHDRAW");
		
		Account acc = repo.findByAccnumber(accnumber);
		System.out.println("------"+accnumber);
		System.out.println("------"+amount+10);
		int withdrawamount = Integer.parseInt(amount);
		
		System.out.println("------"+acc);
		System.out.println("------"+acc.getAccnumber());

		System.out.println("------"+acc.getBalance());
		int bal = Integer.parseInt(acc.getBalance());
		
		bal = bal - withdrawamount;
		
		String balance = Integer.toString(bal);
//		acc.setBalance(balance);
		System.out.println("------"+balance);
		
		// partial update in JPA (load and save approach)
	    acc.setBalance(balance);
	    repo.save(acc);
		return acc;
	}
	
		public void transferMoney(Long senderAcc, Long recieverAcc, String amount) {
		
		Account sAcc = repo.findByAccnumber(senderAcc);
		System.out.println("------_"+sAcc);
		System.out.println("------_"+sAcc.getBalance());
		
		int sAmount = Integer.parseInt(sAcc.getBalance()); 
		sAmount = sAmount - Integer.parseInt(amount);
		// partial update in JPA (load and save approach)
	    sAcc.setBalance(Integer.toString(sAmount));
	    repo.save(sAcc);
		
		Account rAcc = repo.findByAccnumber(recieverAcc);
		System.out.println("------_"+rAcc);
		System.out.println("------_"+rAcc.getBalance());
		
		int rAmount = Integer.parseInt(rAcc.getBalance()); 
		rAmount = rAmount + Integer.parseInt(amount);
		// partial update in JPA (load and save approach)
	    rAcc.setBalance(Integer.toString(rAmount));
	    repo.save(rAcc);
	    
//		return null;
	}
	
	
	public List<Account> search(String email)
	{
		return repo.findByEmail(email);
	}
}
