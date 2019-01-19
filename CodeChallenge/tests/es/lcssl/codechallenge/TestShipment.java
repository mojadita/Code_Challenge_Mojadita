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

/**
 * @author luis
 *
 */
public class TestShipment {
	
	Shipment iut_ok;
	Shipment iut_ko;
	
	@Before
	public void prepare() {
		iut_ko = new Shipment();   /* uninitialize must fail verification */
		
		iut_ok = new Shipment();
		iut_ok.setReference("ABC123456");
		iut_ok.setParcels(new Parcel[] {
			new Parcel(),
			new Parcel(),
		});
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
