package com.RAGAdox.Examples.CustomExceptions;


public class InvalidVectorException extends Exception {
    private static final String exception="InvalidVectorException"; //if we want to use any member object that is used before the object has been initialized then it should be decleared as static
    private static final String DummyString="This is a dummy string for exception :- Your code is full of errors ";
    public InvalidVectorException(String string) {
        super(exception +" :- "+ string);
    }
}
