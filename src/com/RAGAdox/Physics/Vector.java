package com.RAGAdox.Physics;

import com.RAGAdox.Examples.CustomExceptions.InvalidVectorException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.*;


public class Vector {
    private Double x;
    private Double y;
    private Double z;
    public  Vector(){
        x= Double.valueOf(0);
        y= Double.valueOf(0);
        z= Double.valueOf(0);
    }
    public Vector(double x, double y,double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(String vector) throws InvalidVectorException {
        Pattern pattern=Pattern.compile("[0-9.\\-]+");
        Matcher matcher=pattern.matcher(vector);
        if(matcher.find())
            this.x=Double.valueOf(matcher.group());
        if (matcher.find())
            this.y=Double.valueOf(matcher.group());
        if(matcher.find())
            this.z=Double.valueOf(matcher.group());
        if(this.x==null||this.y==null||this.z==null)
            throw new InvalidVectorException(vector);
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+x+","+y+","+z+")^";
    }
    public Vector getNegation(){
        return new Vector(this.x*-1,this.y*-1,this.z*-1);
    }
    public Double getMagnitude(){
        return sqrt(pow(x,2)+pow(y,2)+pow(z,2));
    }
    public Vector getSum(Vector v1){
        return new Vector(this.x+v1.getX(),this.y+v1.getY(),this.z+v1.getZ());
    }
    public Double getDotProduct(Vector v1){
        return this.x*v1.getX()+this.y*v1.getY()+this.z*v1.getZ();
    }
    public Double getAngle(Vector v1){
        return this.getDotProduct(v1)/(this.getMagnitude()*v1.getMagnitude());
    }
    public Vector getCrossProduct(Vector v1){
        return new Vector(this.y*v1.getZ()-this.z*v1.getY(),
                this.x*v1.getZ()*-1+this.z*v1.getX(),
                this.x*v1.getY()-this.y*v1.getX());
    }
}
