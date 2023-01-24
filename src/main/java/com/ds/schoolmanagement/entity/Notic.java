package com.ds.schoolmanagement.entity;

import lombok.Data;

@Data
public class Notic {
	private Long id;
	private String subject;
	private String message;
	private String producedBy;
	private String rsvp;
	
}
