/*Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
*/
package com.stackroute.PE3;

public class ThrowClassException {
    public static void main(String[] args) {
        try {
            Exception exception = new Exception("It is a exception");
            throw exception;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Finally block.");
        }
    }
}
