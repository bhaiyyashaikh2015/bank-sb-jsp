package com.bhaiyya.bank.model;

public class TransferModel {
	
	private Long senderAcc;
	private Long recieverAcc;
	private String amount;
	public Long getSenderAcc() {
		return senderAcc;
	}
	public void setSenderAcc(Long senderAcc) {
		this.senderAcc = senderAcc;
	}
	public Long getRecieverAcc() {
		return recieverAcc;
	}
	public void setRecieverAcc(Long recieverAcc) {
		this.recieverAcc = recieverAcc;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "TransferModel [senderAcc=" + senderAcc + ", recieverAcc=" + recieverAcc + ", amount=" + amount + "]";
	}
	

}
