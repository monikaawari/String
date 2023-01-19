package com.string;

public final class ImmutableClass {
 
	final String pancardNumber;
	
	public ImmutableClass(String pancardNumber) {
		this.pancardNumber=pancardNumber;
	}
	
	public String getPanCardNumber() {
		return pancardNumber;
	}
	
}
