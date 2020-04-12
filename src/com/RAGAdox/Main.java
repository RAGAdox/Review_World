package com.RAGAdox;

import com.RAGAdox.Examples.CustomExceptions.InvalidVectorException;
import com.RAGAdox.Physics.Position;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Position initialPos=new Position(10,0,10.901);
        Position finalPos;
        try {
            finalPos = new Position("(10,20,30.1)->");
        } catch (InvalidVectorException exception) {
            exception.printStackTrace();
            finalPos=new Position();
        }
        Position newPos;
        try {
            newPos = new Position("(10,100,-200)->");
        } catch (InvalidVectorException exception) {
            exception.printStackTrace();
            newPos=new Position();
        }
        Position p;
        try {
            p = new Position("abdknknv1234123");
        } catch (InvalidVectorException exception) {
            exception.printStackTrace();
            p=new Position();
            System.out.println(exception);
        }
        System.out.println(initialPos);
        System.out.println(finalPos);
        System.out.println(newPos);
        System.out.println(p);
        try {
            System.out.println(initialPos.getDistance(new Position("0,0,0")));
        } catch (InvalidVectorException exception) {
            exception.printStackTrace();
        }
        System.out.println(initialPos.getDistance());
        int x=10;
        Double y=x*10.111;
        System.out.println(y);
    }
}
