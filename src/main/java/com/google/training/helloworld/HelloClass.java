package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass (String name, String period) {
        int p = Integer.parseInt(period);
        
        if (p%4 == 1) {
            this.message = "Good morning, ";
        } else if (p%4 == 2) {
            this.message = "Good day, ";
        } else if (p%4 == 3) {
            this.message = "Good evening, ";
        } else {
            this.message = "Good night, ";
        }
        
        this.message += name + "!";
        
    }
    
    public HelloClass (String name, String surname, int times) {
        this.message = "";
        
        for (int i = 0; i < times; i++)
            this.message += "Hello " + name + " " + surname + "! ";
    }

    public String getMessage() {
        return message;
    }
}
