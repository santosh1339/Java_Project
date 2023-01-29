package com.test;

public class Childbank_HDFC extends MainBank {

	public double simple_intrest;
	public double updated_balance_HDFC;
	public double intrest_rate = 12;
	
	
	
	public double Intrest_calcualtion() {
		
		simple_intrest = (principal * intrest_rate * time /100);
		
		updated_balance_HDFC = simple_intrest + principal;
		
		return (updated_balance_HDFC);
		
		
	
				
	}
	
	
	
}
