package com.inventory;
import java.sql.Date;
import java.util.Scanner;


public class payment {

	public static boolean createInvoice()
	{
		boolean success = false; 

		// code for invoice creation
		// if successfully creates invoice then set success = true
		if(success)
			return true;
		else
			return false;
	}

	public static void generateReciept()
	{
		//code for generation of receipt
	}

	public static void inputDebitCardInfo()
	{
		//take debit card info
	}

	public static void inputCreditCardInfo()
	{
		//take credit card info
	}

	public static boolean paymentType(String PaymentType)
	{
		boolean success  = false;

		switch(PaymentType)
		{
		case("Debit"): inputDebitCardInfo();
		if(validateCard())
			success = true;

		case("Credit"):inputCreditCardInfo();
		if(validateCard())
			success = true;
		}

		return success;

	}
	public static boolean validateCard()
	{
		return false;
		//If valid then return true
		// else return false
	}


	public static void main(String args[])

	{
		int Bill_No;
		int Delivery_No;
		Float PaymentAmount;
		Scanner sc = new Scanner(System.in);
		Date Date;  // Edate is a defined structure
		boolean payment_success;
		if(createInvoice())
		{
			System.out.println("Enter the Payment Type");
			String PaymentType = sc.nextLine();
			int number_of_try = 0; // number of try is limited to 3
			do{
				payment_success = paymentType(PaymentType);
				number_of_try++;
				
			}while(payment_success || number_of_try < 3);


			generateReciept();



		}

	}
}