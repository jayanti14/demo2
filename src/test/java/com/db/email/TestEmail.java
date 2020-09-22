package com.db.email;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmail {
	
	@Test
	public void validEmailId() {
		Email mail = new Email();
		boolean m = mail.emailid.contains("@");
		assertTrue(m);
	}

	@Test
	public void subjectLength() {
		Email mail = new Email();
		int expectedLength = 25;
		int actualLength = mail.emailSubject.length();
		assertTrue(actualLength <= expectedLength);
	}
	
	@Test(expected = Exception.class)
	public void surpassCharLength(){
		fail();
	}
	
	@Test
	public void specCharNotAllowed() {
		Email mail = new Email();
		String spec_Char = "[-/*&#_]";
        assertTrue(!mail.getEmailSubject().matches(spec_Char));
	}
	
	@Test
	public void emailBodyPresent() {
		fail();
	}
	@Test
	public void emailAttachment() {
		Email mail = new Email();
		assertTrue(mail.getEmailAttachment().size() <= 100);
	}
	
}
