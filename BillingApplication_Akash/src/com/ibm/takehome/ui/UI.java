package com.ibm.takehome.ui;

import java.util.Scanner;

import com.ibm.takehome.service.ProductService;
import com.ibm.takehome.util.CollectionUtil;
import com.ibm.takhome.problem.NullException;

public class UI {
	private static CollectionUtil util;
	private static ProductService service;
	private static Scanner scan;
	
	static	{
		service = new ProductService();
		util = new CollectionUtil(service);
		scan = new Scanner(System.in);
		
		util.startService();
	}
	
	public static void main(String[] args) {
		
		
		boolean errorOccured = false;
		
		do	{
			System.out.println("Choose Options:\n1: Generate Bill By Entering Product Code and Quantity\n2: Exit");
			try	{
				switch(Integer.parseInt(scan.nextLine()))	{
				case 1:
					try {
						UI.generateBill();
					}
					catch (NullException e) {
						System.out.println(e.toString());
					}
					errorOccured = true;
					break;
				case 2:
					errorOccured = false;
					break;
				default:
					System.out.println("You entered wrong input!, try again");				
				}
			}
			catch(NumberFormatException nfe)	{
				System.out.println(nfe);
				errorOccured = true;
			}
		}
		while(errorOccured == true);	
		
		scan.close();
	}
	
	public static void generateBill() throws NullException	{
		System.out.println("Enter Product Code: ");
		Integer productCode = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter Product Quantity: ");
		Integer productQuantity = Integer.parseInt(scan.nextLine());
		
		System.out.println(UI.service.printFinal(productCode, productQuantity));
	}
}
