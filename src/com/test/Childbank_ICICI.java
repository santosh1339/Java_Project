package com.test;

public class Childbank_ICICI extends MainBank {
	
	
	public double simple_intrest;
	public double updated_balance_ICICI;
	public double intrest_rate = 10.5;
	
	
	public double Intrest_calcualtion() {
		
		simple_intrest = (principal * intrest_rate * time /100);
		
		updated_balance_ICICI = simple_intrest + principal;
		
		return (updated_balance_ICICI);
		
	}
	

}
