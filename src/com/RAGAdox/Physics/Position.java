package com.RAGAdox.Physics;


import com.RAGAdox.Examples.CustomExceptions.InvalidVectorException;

public class Position extends Vector{
    public Position() {
        super();
    }

    public Position(double x, double y, double z) {
        super(x, y, z);
    }

    public Position(String vector) throws InvalidVectorException {
        super(vector);
    }
    public Double getDistance(){
        return this.getMagnitude();
    }
    public Position getDisplacement(Position position){
        return (Position)this.getSum(position.getNegation());     //This throws error but not after typecasting
    }
    public Double getDistance(Position position){
        return this.getSum(position.getNegation()).getMagnitude();
    }

}
