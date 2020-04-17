package com.myapp.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {//FOR PRIORITY QUEUE WE MUST USE ENUM TO DECLARE PRIORITY

	private static final Comparator<Enquiry>//FINAL INDICATES CATEGORY CANT BE CHANGED
	BY_CATEGORY= Comparator.comparing(Enquiry::getCategory);
	
	private Queue<Enquiry> enquiries=//to set priority by category
			new PriorityQueue <>(BY_CATEGORY);
			
	public boolean registerComplaint(final Customer customer,final Category category) {//to register complain
		
		return enquiries.offer(new Enquiry(customer,category));//ins
	}
	public void processAllEnquiries() {//process enquiries
		
		Enquiry enquiry=null;
		
		while((enquiry=enquiries.poll())!=null) {
			enquiry.getCustomer().reply("have u tried switching on and off");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPriorityQueue helpdesk=
				new TestPriorityQueue();//PRIORITY QUEUE IS PRIORITIG BASIS ON CATEGORY
		
		helpdesk.registerComplaint(Customer.TOM,Category.TABLET);
		helpdesk.registerComplaint(Customer.HARY,Category.PRINTER);
		helpdesk.registerComplaint(Customer.DICK,Category.COMPUTER);
	    helpdesk.processAllEnquiries();
	

	}

}
