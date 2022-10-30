package com.hienetworks.nwhin.docretrieve.adapter;

public class Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try
        {
            HIENDocRetrieveClient client = HIENDocRetrieveClient.getInstance();
            String response = client.sendData("12668-97921-2.16.840.1.113883.3.7120.10.8-10", "2.16.840.1.113883.3.7204.1.3.1.2");
            System.out.println("END : " + response);
        }
        catch(Exception e)
        {
            System.out.println("ERROR : " + e.getMessage());
        }
    }	
}
