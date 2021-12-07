package com.bhaiyya.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhaiyya.bank.entity.Account;
import com.bhaiyya.bank.model.TransferModel;
import com.bhaiyya.bank.service.AccountService;



@Controller
public class MainController {
	
	@Autowired
	private AccountService service;
	
	@GetMapping("/")
	public String home(Model model)
	{
		System.out.println("Hi...........");
		model.addAttribute("account", new Account());
		return "home";
	}
	
	@GetMapping("/displayAll")
	public String displayAll(Model model)
	{
		System.out.println("Hi..ssss........");
		List<Account> listaccount = service.listAll();
		System.out.println("listaccount....");
		System.out.println(listaccount);
		model.addAttribute("listaccount", listaccount);
		return "displayAll";
	}
	@GetMapping("/addaccount")
	public String addAccount(Model model) {
		model.addAttribute("account", new Account());
		return "addaccount";
	}

	@PostMapping("/save")
	public String saveAccount(@ModelAttribute("account") Account acc) {
		service.save(acc);
		return "redirect:displayAll";
	}
	
	@GetMapping("/showdelaccount")
	public String showDelAccount(Model model) {
		model.addAttribute("account", new Account());
		return "showdelaccount";
	}

	@GetMapping("/delAccount")
	public String delAccount(@RequestParam("email") String email) {	
		
//		Delete account by email
		service.delete(email);
		
//		Find accounts by email and delete first account
//		service.findAccByEmail(email);

//		To find account by Email
//		Account acc = service.findPhoneByEmail(email);
//		System.out.println("============>"+acc);
		
//		To find a list of account by Email
//		List<Account> acc = service.findPhoneByEmail(email);
//		System.out.println("============>"+acc);

//		find account if phone AND email both matches
//		service.deleteByEmailAndPhone(email);
		
//		Delete account if email OR phone matches
//		service.deleteByEmailOrPhone(email);
		
		return "redirect:displayAll";
	}
	
	@GetMapping("/showWithdraw")
	public String showWithdraw(Model model) {
		model.addAttribute("account", new Account());
		return "showWithdraw";
	}
	
	@GetMapping("/withdraw")
	public String withdraw(@RequestParam("accnumber") Long accnumber, @RequestParam("balance") String amount) {	
		
		service.findByAccnumberToWithdraw(accnumber,amount);
		return "redirect:displayAll";
	}
	
	@GetMapping("/showDeposit")
	public String showDeposit(Model model) {
		model.addAttribute("account", new Account());
		return "showDeposit";
	}
	
	@GetMapping("/deposit")
	public String deposit(@RequestParam("accnumber") Long accnumber, @RequestParam("balance") String amount) {	
		
		service.findByAccnumberToDeposit(accnumber,amount);
		return "redirect:displayAll";
	}
	
	@GetMapping("/showTransfer")
	public String showTransfer(Model model) {
		model.addAttribute("account", new TransferModel());
		return "showTransfer";
	}
	
	@GetMapping("/transfer")
	public String transfer(@ModelAttribute TransferModel tmodel) {	
		
		System.out.println("======"+tmodel);
		
		service.transferMoney(tmodel.getSenderAcc(), tmodel.getRecieverAcc(), tmodel.getAmount());

		return "redirect:displayAll";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("email") String email, Model model)
	{
		
		System.out.println("======"+email);
		
		List<Account> listaccount = service.search(email);
		System.out.println("listaccount....");
		System.out.println(listaccount);
		model.addAttribute("listaccount", listaccount);
		return "displayAll";
	}
}
