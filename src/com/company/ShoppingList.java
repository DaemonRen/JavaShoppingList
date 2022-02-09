package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();
        Scanner shopping = new Scanner(System.in);
        String item = "";
        String addMore = "";

        do {
            System.out.println("Name of item to add to shopping list:\n");
            item = shopping.nextLine();
            shoppingList.add(item);
            System.out.println("Would you like to add another item? yes/no:\n");
            addMore = shopping.nextLine();
        } while (addMore.equalsIgnoreCase("yes"));
        System.out.println(shoppingList);
    }
}
