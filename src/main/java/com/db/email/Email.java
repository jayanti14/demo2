package com.db.email;

import java.util.ArrayList;
import java.util.Random;

public class Email {
	
	String emailid;
	String emailSubject;
	String emailBody;
	ArrayList<String> emailAttachment=new ArrayList<String>();
	
	public String getEmailid() {
		return emailid;
	}
	public String getEmailSubject() {
		return emailSubject;
	}
	public String getEmailBody() {
		return emailBody;
	}
	public ArrayList<String> getEmailAttachment() {
		return emailAttachment;
	}
	
	public Email() {
		this.emailid = "abc123@gmail.com";
		this.emailSubject = "A B C D";
	}
}
