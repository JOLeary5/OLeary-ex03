/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

/*
    - Declare 2 String variables
    - Ask the user for a quote, without quotations
    - Ask the user who said the quote
    - formulate the return string ( *They* said "*Quote*")
        - figure out how to display quotations in Java
 */


import java.util.Scanner;

public class Solution03
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        String Quote, Author;

        System.out.println("Enter a Quote (Please Exclude Quotations): ");
        Quote = Input.nextLine();

        System.out.println("Who said that quote? ");
        Author = Input.nextLine();

        System.out.println(Author + " said " + "\"" + Quote + "\"");
    }
}
