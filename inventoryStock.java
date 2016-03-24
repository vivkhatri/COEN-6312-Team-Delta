package com.inventory;

import java.util.Scanner;

public class inventoryStock {


	public static boolean isInventoryEmpty(int product_id)
	{
		boolean notEmpty = false; 

		// code for checking Inventory for Stock

		// if stock is not available then empty return = true
		if(notEmpty)
			return true;
		else
			return false;
	}

	public static boolean add_stock(int product_id, String product_qty) {
		// TODO Auto-generated method stub

		boolean success  = false;

		// Code for adding a stock into Inventory
		// if product_id is present then make success = true
		// Perform a check operation If Product id is not available then adding a stock as new entry.

		// If stock address successfully then return true otherwise false value

		return success;
	}

	public static boolean update_stock(int product_id, String product_qty) {
		// TODO Auto-generated method stub

		boolean success  = false;

		// Code for updating a stock into Inventory

		// Perform a check operation If Product id is available then Updates an existing stock qty.

		// If stock address successfully then return true otherwise false value

		return success;
	}

	public static boolean remove_stock(int product_id) {
		// TODO Auto-generated method stub

		boolean success  = false;

		// Code for removing or deleting a stock from Inventory

		// If stock address successfully then return true otherwise false value

		return success;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inven_operation;
		boolean msg = false;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter operation");
		System.out.println("1 : Add");
		System.out.println("2 : Update");
		System.out.println("3 : Delete");

		inven_operation = sc.nextInt();
		
		System.out.println("Enter the Stock Id");
		int product_id = sc.nextInt();

		System.out.println("Enter the Stock Qty");
		String product_qty = sc.nextLine();


		switch(inven_operation)
		{

		case(1):
			if(isInventoryEmpty(product_id)){
				msg = add_stock(product_id,product_qty);
			}else{
				System.out.println("Stock Already available. Please perform an Update Operation");
			}
			
		case(2):

			msg = update_stock(product_id,product_qty);

		case(3):

			msg = remove_stock(product_id);

		if(msg)
			System.out.println("Operation Performed Successfully");
		else
			System.out.println("Operation Not Performed Successfully");

		}

	}
}




