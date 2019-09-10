/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

import java.util.ArrayList;

/**
 *
 * @author awall
 */
public class BubbleSortCustomerData {

    //Array containing all customer data
    private static ArrayList<Customer> customerData = new ArrayList<>();
    
    /**
     *
     * @param field the argument used to decide which field from the customer
     * is used to sort
     * 
     * e.g. .bubbleSort("rating", "A") refers to rating ascending,
     * whereas .bubbleSort("name", "D") refers to name descending
     */
    public static void bubbleSort(String field, String direction){
        
        int n = customerData.size();
        
        
        
        //Outer loop of buble sort
        for (int i = 0; i < n-1; i++){
            
            //Inner loop
            for (int j = 0; j < n-i-1; j++){
                
                //See the .compare method in the Customer class. Compares the
                //two object's fields against each other, depending on the
                //selected input field and direction. Outputs a boolean for the
                //if condition.
                if(customerData.get(j).compare(field, direction,
                        customerData.get(j+1))){
                    
                    //Create a temproary before the swap so that data is not
                    //over-written
                    Customer temp = customerData.get(j);
                    
                    //Set index j of the ArrayList to j+1 (aka move the data
                    // from j+1 "up" the ranks to a lower index.
                    // e.g. rank 5 (myList[5]) -> rank 4 (myList[4])
                    customerData.set(j, customerData.get(j+1));
                    
                    //Set the j+1 position of the array to be what used to be
                    // the data at index j of the array, completing the swap
                    customerData.set(j+1, temp);
                }
            }
        }
    }
    
    /**
     *For each entry in the array, use the .toString override method from the 
     * Customer class to print the contents 
     */
    public static void displayData(){
        for (int i = 0; i < customerData.size(); i++) {
            System.out.println(customerData.get(i).toString());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Adding all of the data manually to the array,
        //through instances of the customer class
        customerData.add(new Customer("Tama", 2, "Auckland"));
        customerData.add(new Customer("Amelia", 5, "Taranaki"));
        customerData.add(new Customer("Koas", 3, "Hamilton"));
        customerData.add(new Customer("Karl", 4, "Papatoetoe"));
        customerData.add(new Customer("Carlos", 5, "Glenfield"));
        customerData.add(new Customer("Alicia", 2, "Whangarai"));
        customerData.add(new Customer("Zion", 2, "Wellington"));
        customerData.add(new Customer("Sara", 3, "Auckland"));
        customerData.add(new Customer("Bob", 4, "Papakura"));
        customerData.add(new Customer("Wiremu", 5, "Auckland"));
        
        //Welcome message
        System.out.println("Welcome! This application uses BubbleSort to sort" +
                " an array.\nFirst displaying the unsorted list, then the list" +
                " sorted by \ncustomer rating(ascending), then by customer name" +
                "(descending)."
        );
        
        //Display the unordered list.
        System.out.println("\nHere is the unsorted list:");
        BubbleSortCustomerData.displayData();
        
        //Sort the list by customer rating(ascending) then display it
        BubbleSortCustomerData.bubbleSort("rating", "A");
        System.out.println("\nHere is the list, sorted by customer rating"
                + "\n(ascending 1-5):");
        BubbleSortCustomerData.displayData();
        
        //Sort the list by customer rating(ascending) then display it
        BubbleSortCustomerData.bubbleSort("name", "D");
        System.out.println("\nHere is the list, sorted by customer name"
                + "\n(descending Z-A):");
        BubbleSortCustomerData.displayData();
    }
    
}
