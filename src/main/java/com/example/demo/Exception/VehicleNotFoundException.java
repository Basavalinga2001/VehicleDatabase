package com.example.demo.Exception;

public class VehicleNotFoundException extends RuntimeException{

	  /**
	   * 
	   */
	  private static final long serialVersionUID = 1L;

	  private String resourceName; //Vehicle
	  private String fieldName; // id
	  private int fieldValue; // 2
	  
	  
	  
	  public VehicleNotFoundException(String resourceName, String fieldName, int id) {
	    super(resourceName+"not found for" +fieldName+" with value "+id);
	    this.resourceName = resourceName;
	    this.fieldName = fieldName;
	    this.fieldValue = id;
	  }
	  
	  public String getResourceName() {
	    return resourceName;
	  }
	  public void setResourceName(String resourceName) {
	    this.resourceName = resourceName;
	  }
	  public String getFieldName() {
	    return fieldName;
	  }
	  public void setFieldName(String fieldName) {
	    this.fieldName = fieldName;
	  }
	  public int getFieldValue() {
	    return fieldValue;
	  }
	  public void setFieldValue(int fieldValue) {
	    this.fieldValue = fieldValue;
	  }
	  public static long getSerialversionuid() {
	    return serialVersionUID;
	  }
	  
	  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vehicle with this id not found";
	}
	  
	  

}
