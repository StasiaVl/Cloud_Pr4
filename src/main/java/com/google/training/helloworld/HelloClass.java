package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass (String name, String period) {
        
        this.message = "";
        for (int i = 0; i < Integer.parseInt(period); i++)
            this.message += "Hello " + name + "!";
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
