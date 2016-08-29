/**
 * 
 */
package com.app.Logic;

import com.app.base.BaseProc;
import com.app.model.Product;
import com.app.model.User;

/**
 * @author deepakkumar
 *
 */
public class ManageCalculation extends BaseProc  {
	
	com.app.test.PerformProductSale.States stateCode;
	
	/**
	 * @param ca
	 */
	public ManageCalculation(com.app.test.PerformProductSale.States sts) {
		this.stateCode = sts;
	}

	@Override
	public void setProductTaxes(Product product) {
		// TODO Auto-generated method stub
		switch (stateCode) {
		case CA:
				product.setTaxRate(9);
			break;
				
		case OR:
				product.setTaxRate(8);
			break;

		case NV:
				product.setTaxRate(7);
			break;

		case WY:
			product.setTaxRate(6);
			break;
			
		default:
				product.setTaxRate(8);
			break;
		}
	}
	
	public void calculateFinalPrice(Product product, User user){
		Double price = 0.0;
		price = (product.getCost()-product.getDiscount()+product.getTaxRate());
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println( " "+user.getName()+" purchased "+product.getName()+" with final price:$"+price+" from "+this.stateCode+" Apple Store"); 
		System.out.println("----------------------------------------------------------------------------------");
		
	}

	
	

}
