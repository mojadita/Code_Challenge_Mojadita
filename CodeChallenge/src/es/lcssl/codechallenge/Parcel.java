/*
 * Parcel.java -- TODO: add comment for this class.
 * es.lcssl.codechallenge
 * Author: Luis Colorado <luiscoloradourcola@gmail.com>
 * Date: 19/1/2019 16:13:36
 * Project: CodeChallenge
 * Copyright: (C) 2019 LUIS COLORADO.  All rights reserved.
 */
package es.lcssl.codechallenge;

/**
 * Simple POJO to represent a Parcel.
 * 
 * @author luis
 *
 */
public class Parcel {

	double weight;
	double width;
	double height;
	double lenght;  /* i think there's a typo here, but to conserver json parsing */
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	public void verify() throws VerificationException {
		throw new UnsupportedOperationException();
	}
	
}
