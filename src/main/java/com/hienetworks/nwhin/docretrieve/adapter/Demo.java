package com.hienetworks.nwhin.docretrieve.adapter;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HIENDocRetrieveClient client = HIENDocRetrieveClient.getInstance();
        String response = client.sendData("498927-103336405798461718-2.16.840.1.113883.3.7120.10.8-15");
        System.out.println("END : "+response);
	}	
}
