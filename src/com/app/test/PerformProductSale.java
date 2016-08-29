package com.app.test;

import com.app.Logic.ManageCalculation;
import com.app.model.Product;
import com.app.model.User;

public class PerformProductSale {
	
	public enum States{
		CA,OR,NV,WY
	}
	
	States stateCode;

	public PerformProductSale() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Product pro1 = new Product("iPhone6","iPhone6 Silver",4567,true, 600.50);
		User usr = new User("Mark", "810 W Maude", "student");
		ManageCalculation calc =  new ManageCalculation(States.CA);
		calc.applyDiscount(pro1, usr);
		calc.calculateFinalPrice(pro1, usr);
		

	}

}
