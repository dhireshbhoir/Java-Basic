/*
  file name:BinarySearchTree.java
  Created by:Dhiresh Bhoir
  Create Date:-17-10-2016
  Purpose:Program for binary search tree
*/
package com.binary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class BinarySearchTree{
	public static void main(String[] args) throws IOException{
		BinaryTreeMethods tree = new BinaryTreeMethods();
		boolean check = true;
		Scanner scanner=new Scanner(System.in);

		while(check){
			System.out.println("Please Select Your choice:\n1.Add Element\n2.Possible no. of Combinations\n3.Exit");
			int choice = scanner.nextInt();
			switch(choice){
				case 1:{
					System.out.print("Please Enter Value: ");
					int value = scanner.nextInt();
					tree.insert(value);
					break;
				}
				case 2:{
					tree.getTreeCount();
					break;
				}

				case 3:{
					check = false;
					break;	
				}

				default: {
					System.out.println("Entered Wrong Choice");
				}

			}
		}
		
	}
}



