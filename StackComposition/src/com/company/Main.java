package com.company;

import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
	    StackCompostion<Integer> stackCompostion =
                new StackCompostion<>();

	    for(int i = 0; i < 10; i++){
			System.out.println("push :");
	        stackCompostion.push(
	                new SecureRandom().nextInt(90));
	        stackCompostion.print();
        }

	    for (int i = 0; i < 11; i++){
			System.out.println("pop :");
	        stackCompostion.pop();
	        stackCompostion.print();
        }
    }
}
