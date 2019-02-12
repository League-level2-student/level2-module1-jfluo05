package intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> words = new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("bake");
		words.add("soccer");
		words.add("awesome");
		words.add("beach");
		words.add("puppies");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < words.size(); i++){
			String s = words.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
		
		//4. Print all the Strings using a for-each loop
		for(String s : words){
			System.out.println(s);
		}
		System.out.println("\n");

		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < words.size(); i++){
			String s = words.get(i);
			if(i%2==0) {
				System.out.println(s);
			}
		}
		System.out.println("\n");

		//6. Print all the Strings in reverse order.
		for(int i = words.size()-1; i > -1; i--){
			String s = words.get(i);
			System.out.println(s);
		}
		System.out.println("\n");

		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < words.size(); i++){
			String s = words.get(i);
			System.out.println(s);
		}
		System.out.println("\n");
	}
}
