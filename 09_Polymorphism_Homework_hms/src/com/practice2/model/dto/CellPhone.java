package com.practice2.model.dto;

public interface CellPhone extends Phone, Camera {
	
	public default void charge() {
		
	}
}
