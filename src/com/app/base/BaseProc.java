/**
 * 
 */
package com.app.base;

import com.app.model.Product;
import com.app.model.User;

/**
 * @author deepakkumar
 *
 */
public abstract class BaseProc {
	/**
	 * 
	 */
	private static int STUDENT_DISC = 5;
	private static int MILITARY_DISC = 8;
	private static int CORPORATE_DISC = 7;
	
	public abstract void setProductTaxes(Product product);
	
	public void applyDiscount(Product product, User user){
		if(user.getRole().equalsIgnoreCase("Student")){
			product.setDiscount(STUDENT_DISC);
		}else if(user.getRole().equalsIgnoreCase("Military")){
			product.setDiscount(MILITARY_DISC);
		}else if(user.getRole().equalsIgnoreCase("Corporate")){
			product.setDiscount(CORPORATE_DISC);
		}else{
			product.setDiscount(1);
		}
	}

}
