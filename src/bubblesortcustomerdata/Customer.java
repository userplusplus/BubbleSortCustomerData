/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortcustomerdata;

/**
 *
 * @author awall
 */
public class Customer {
    
    //Class fields
    private String name;
    private int rating;
    private String address;
    
    /**
     * An override of the .toString() method
     * @return all variables of the object formatted into one line for easy
     * reading
     */
    @Override
    public String toString(){
        return "[Name: " + name +
                "] [Rating: " + rating + 
                "] [Address: " + address + "]";
    }
    
    /**
     *
     * @param field - the field of Customer you are comparing to another, same
     * field of a different instance of customer.
     * Valid inputs for field: "name", "rating", "address"
     * 
     * @param direction - whether the list is ordered ascending or descending.
     * Valid inputs for direction: "A" for ascending, "D" for descending
     * 
     * @param c - the other customer instance that is being compared
     * @return
     */
    public boolean compare(String field, String direction, Customer c){
        
        int i = 0;
        
        switch(field) {
            case "name":
                //note that the .compareTo method gives the numeric difference
                //of the two strings being compared (this can happen as it is
                // comparing the Unicode values of the string).
                //
                //e.g. str1.compareTo(str2)
                //Returns 0 if str1 == str2.
                //Returns x>0 if str1 > str2.
                //Returns x<0 if str1 < str2.
                //
                //Note that through unicode values, b > a as b = 98 and a = 97
                if("A".equals(direction)){
                    //Comparing the two so that it appears as ascending
                        i = name.compareTo(c.name);

                } else if("D".equals(direction)){
                    //Comparing the two so that it appears as descending
                        i = c.name.compareTo(name);
                }
                break;
              
            case "rating":
                //Rating is easier to comapre as its an int.
                if("A".equals(direction)){
                //Comparing the two so that it appears as ascending
                    if(rating > c.rating){i=1;}

                } else if("D".equals(direction)){
                //Comparing the two so that it appears as descending
                    if(rating < c.rating){i=1;}
                }
                break;
              
              
            case "address":
                if("A".equals(direction)){
                    //Comparing the two so that it appears as ascending
                        i = name.compareTo(c.name);

                } else if("D".equals(direction)){
                    //Comparing the two so that it appears as descending
                        i = c.name.compareTo(name);
                }
                break;
        }
        
        //Return a true or false so that it can just be called as a condition
        // for an if statement.
        if(i > 0){
            return true;
        } else {
            return false;
        }
    }

    /**
     *Constructor for the customer class
     * 
     * @param name the customer name
     * @param rating the customer rating
     * @param address the customer address
     */
    public Customer(String name, int rating,
            String address){
        this.name = name;
        this.rating = rating;
        this.address = address;
    }
    
}
