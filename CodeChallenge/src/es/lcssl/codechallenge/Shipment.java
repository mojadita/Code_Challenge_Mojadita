/*
 * Shipment.java -- TODO: add comment for this class.
 * es.lcssl.codechallenge
 * Author: Luis Colorado <luiscoloradourcola@gmail.com>
 * Date: 19/1/2019 16:10:05
 * Project: CodeChallenge
 * Copyright: (C) 2019 LUIS COLORADO.  All rights reserved.
 */
package es.lcssl.codechallenge;

/**
 * This is a simple POJO to represent a shipment.
 * 
 * @author luis
 *
 */
public class Shipment {
	
	private String reference;
	private Parcel[] parcels;
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public Parcel[] getParcels() {
		return parcels;
	}
	
	public void setParcels(Parcel[] parcels) {
		this.parcels = parcels;
	}
	
	public void verify() throws VerificationException {
		throw new UnsupportedOperationException();
	}
	
}
