package com.PE3;

public class ThrowClassException {
    public static void main(String[]args){
        try {
            Exception exception = new Exception("It is a exception");
            throw exception;
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("Finally block.");
        }
    }
}
