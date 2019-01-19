/*
 * VerificationException.java -- TODO: add comment for this class.
 * es.lcssl.codechallenge
 * Author: Luis Colorado <luiscoloradourcola@gmail.com>
 * Date: 19/1/2019 16:19:22
 * Project: CodeChallenge
 * Copyright: (C) 2019 LUIS COLORADO.  All rights reserved.
 */
package es.lcssl.codechallenge;

/**
 * Exception generated upon verification of data entities.
 * @author luis
 *
 */
public class VerificationException extends Exception {

	private static final long serialVersionUID = 4978275316852511372L;

	/**
	 * @see Exception#Exception(String, Throwable)
	 */
	public VerificationException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * @see Exception#Exception(String)
	 */
	public VerificationException(String message) {
		super(message);
		
	}

	/**
	 * @see Exception#Exception(Throwable)
	 */
	public VerificationException(Throwable cause) {
		super(cause);
		
	}

	/**
	 * @see Exception#Exception()
	 */
	public VerificationException() {
		super();
		
	}

}
