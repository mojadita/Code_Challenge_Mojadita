/*
 * Tracking.java -- TODO: add comment for this class.
 * es.lcssl.codechallenge
 * Author: Luis Colorado <luiscoloradourcola@gmail.com>
 * Date: 19/1/2019 16:36:25
 * Project: CodeChallenge
 * Copyright: (C) 2019 LUIS COLORADO.  All rights reserved.
 */
package es.lcssl.codechallenge;

/**
 * Trackin POJO object.
 * 
 * @author luis
 *
 */
public class Tracking {
	static enum Status {
		WAITING_IN_HUB,
		DELIVERED,
	};
	
	Status 	i_status;		/* can be null */
	Integer i_parcels;   	/* can be null */
	Double  i_weight;    	/* can be null */
	String  i_reference;	/* can be null */
	
	public void verify() throws VerificationException {
		throw new UnsupportedOperationException();
	}

	public Status getStatus() {
		return i_status;
	}

	public void setStatus(Status status) {
		i_status = status;
	}

	public Integer getParcels() {
		return i_parcels;
	}

	public void setParcels(Integer parcels) {
		i_parcels = parcels;
	}

	public Double getWeight() {
		return i_weight;
	}

	public void setWeight(Double weight) {
		i_weight = weight;
	}

	public String getReference() {
		return i_reference;
	}

	public void setReference(String reference) {
		i_reference = reference;
	}

}
