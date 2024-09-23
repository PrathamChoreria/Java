package com.deloitte.lab05.ex01;

public class AgeNotValidException extends Exception {//exception parent class
	public AgeNotValidException(String message) {
        super(message);//calls parent class exception and pass message to it
    }
}
