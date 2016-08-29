/**
 * 
 */
package com.app.model;

/**
 * @author deepakkumar
 *
 */
public class Product {

	/**
	 * 
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private String description;
	private int serialNumber;
	private Boolean isSerilized;
	private double cost;
	private float taxRate;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the serialNumber
	 */
	public int getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * @return the isSerilized
	 */
	public Boolean getIsSerilized() {
		return isSerilized;
	}
	/**
	 * @param isSerilized the isSerilized to set
	 */
	public void setIsSerilized(Boolean isSerilized) {
		this.isSerilized = isSerilized;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	private int discount;
	/**
	 * @param name
	 * @param description
	 * @param serialNumber
	 * @param isSerilized
	 * @param d
	 */
	public Product(String name, String description, int serialNumber,
			Boolean isSerilized, double d) {
		super();
		this.name = name;
		this.description = description;
		this.serialNumber = serialNumber;
		this.isSerilized = isSerilized;
		this.cost = d;
	}
	/**
	 * @return the taxRate
	 */
	public float getTaxRate() {
		return taxRate;
	}
	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	/**
	 * @param taxRate the taxRate to set
	 */
	public void setTaxRate(float taxRate) {
		this.taxRate = taxRate;
	}
	
	

}
