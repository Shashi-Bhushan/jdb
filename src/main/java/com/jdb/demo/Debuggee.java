package com.jdb.demo;


import java.util.Scanner;

/**
 * Created by Shashi Bhushan on 12/22/2016.
 */
public class Debuggee {

    public static void main(String[] args) {
        DebuggeeInner debuggeeInner = new Debuggee.DebuggeeInner("abc");
        Scanner input = new Scanner(System.in);

        print(debuggeeInner.getName());

        print("Hello");
        String name = getUserResponse("what is the name ?", input);
        debuggeeInner.setName(name);
        print("New Name is : " + debuggeeInner.getName());
    }

    private static final void print(String msg){
        System.out.println(msg);
    }

    private static final String getUserResponse(String msgToPrint,Scanner input) {
        print(msgToPrint);
        return input.next();
    }

    public static final class DebuggeeInner{
        private String name;

        DebuggeeInner(String name) {
            this.name = name;
        }

        public DebuggeeInner setName(String name) {
            this.name = name;

            return this;
        }

        public String getName() {
            return this.name;
        }
    }
}
