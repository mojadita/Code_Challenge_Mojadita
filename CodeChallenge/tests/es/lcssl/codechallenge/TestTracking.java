/*
 * TestShipment.java -- TODO: add comment for this class.
 * es.lcssl.codechallenge
 * Author: Luis Colorado <luiscoloradourcola@gmail.com>
 * Date: 19/1/2019 16:26:16
 * Project: CodeChallenge
 * Copyright: (C) 2019 LUIS COLORADO.  All rights reserved.
 */
package es.lcssl.codechallenge;

import org.junit.Before;
import org.junit.Test;

import es.lcssl.codechallenge.Tracking.Status;

/**
 * @author luis
 *
 */
public class TestTracking {
	
	Tracking iut_ok;
	Tracking iut_ko;
	
	@Before
	public void prepare() {
		iut_ko = new Tracking();   /* uninitialize must fail verification */
		
		iut_ok = new Tracking();
		iut_ok.setParcels(23);
		iut_ok.setReference("ABC123");
		iut_ok.setStatus(Status.WAITING_IN_HUB);
		iut_ok.setWeight(20.3);
	}
	
	@Test
	public void testVerifyOk() throws VerificationException {
		iut_ok.verify();
	}
	
	@Test(expected=VerificationException.class)
	public void testVerifyKO() throws VerificationException {
		iut_ko.verify();
	}

}
