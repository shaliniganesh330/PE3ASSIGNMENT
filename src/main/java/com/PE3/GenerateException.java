package com.PE3;

import java.util.Scanner;
public class GenerateException
{
    public static void main(String[]args){
        try {
            System.out.println("Enter the size of array: ");
            int size;
            Scanner sc = new Scanner(System.in);
            size=sc.nextInt();
            if(size<0){
                NegativeArraySizeException exception = new NegativeArraySizeException("Negative Array Size Exception");
                throw exception;
            }
            if(size>100){
                IndexOutOfBoundsException exception = new IndexOutOfBoundsException("Index Out Of Bounds Exception");
                throw exception;
            }
            if(size==0){
                NullPointerException exception = new NullPointerException("Null Pointer Exception");
                throw exception;
            }
        } catch (IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        } catch (NegativeArraySizeException exception){
            System.out.println(exception.getMessage());
        } catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Finally block.");
        }
    }
}

