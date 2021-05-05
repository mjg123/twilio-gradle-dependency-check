/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example.twilio.gradle;

import com.twilio.Twilio;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println("Twilio init");

        // this will throw an exception if the env vars
        // aren't present.
        Twilio.init(
            System.getenv("TWILIO_ACCOUNT_SID"),
            System.getenv("TWILIO_AUTH_TOKEN"));

        System.out.println(new App().getGreeting());
    }
}
