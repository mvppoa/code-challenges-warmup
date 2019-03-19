package com.mvppoa.codechallengeswarmup.hackerrank.thirtydays;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Objective
//        Today, we're working with regular expressions. Check out the Tutorial tab for learning materials and an instructional video!
//
//        Task
//        Consider a database table, Emails, which has the attributes First Name and Email ID. Given  rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in .
//
//        Input Format
//
//        The first line contains an integer, , total number of rows in the table.
//        Each of the  subsequent lines contains  space-separated strings denoting a person's first name and email ID, respectively.
//
//        Constraints
//
//        Each of the first names consists of lower case letters  only.
//        Each of the email IDs consists of lower case letters ,  and  only.
//        The length of the first name is no longer than 20.
//        The length of the email ID is no longer than 50.
//        Output Format
//
//        Print an alphabetically-ordered list of first names for every user with a gmail account. Each name must be printed on a new line.
//
//        Sample Input
//
//        6
//        riya riya@gmail.com
//julia julia@julia.me
//julia sjulia@gmail.com
//julia julia@gmail.com
//samantha samantha@gmail.com
//tanya tanya@gmail.com
//Sample Output
//
//        julia
//        julia
//        riya
//        samantha
//        tanya

public class HackerRankCodeSimple28RegexPatternsDatabases {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Pattern emailPattern = Pattern.compile("((?:^|\\\\s)[a-z\\.]+(?:\\\\s|$)*@gmail\\.com(\\W|$)+$).{0,50}$");
        Pattern namePattern = Pattern.compile("((?:^|\\\\s)[a-z]+(?:\\\\s|$)).{0,20}$");

        List<String> nameArray = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            Matcher emailMatcher = emailPattern.matcher(emailID);
            Matcher firstNameMatcher = namePattern.matcher(firstName);

            if(emailMatcher.find() && firstNameMatcher.find()){
                nameArray.add(firstName);
            }
        }

        nameArray.sort(String::compareTo);

        scanner.close();

        for (String name:
                nameArray) {
            System.out.println(name);
        }
    }

}


