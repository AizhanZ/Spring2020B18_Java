package Replit;

import java.util.Scanner;

public class R76_BuildARoute {
/*
Write a program that will print out route instructions.
Your program should take 2 parameters: start point and end point.
Use left, right, up and down for navigation. Insert ">" between commands.
If start point equals to end point - display: "start/end(start or end variable!) found".
Note: you may move only clock wise.
Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String rest = "";

        if (start.equals("A")) {
            if (end.equals("B")) {
                rest += "right: " + end + " found";
            } else if (end.equals("C")) {
                rest += "right > down: " + end + " found";
            } else if (end.equals("D")) {
                rest += "right > down > left: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("B")) {
            if (end.equals("C")) {
                rest += "down: " + end + " found";
            } else if (end.equals("D")) {
                rest += "down > left: " + end + " found";
            } else if (end.equals("A")) {
                rest += "down > left > up: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("C")) {
            if (end.equals("D")) {
                rest += "left: " + end + " found";
            } else if (end.equals("A")) {
                rest += "left > up: " + end + " found";
            } else if (end.equals("B")) {
                rest += "left > up > right: " + end + " found";
            } else {
                rest += start + " found";
            }

        } else if (start.equals("D")) {
            if (end.equals("A")) {
                rest += "up: " + end + " found";
            } else if (end.equals("B")) {
                rest += "up > right: " + end + " found";
            } else if (end.equals("C")) {
                rest += "up > right > down: " + end + " found";
            } else {
                rest += start + " found";
            }
        }

        System.out.println(rest);

    }

}
