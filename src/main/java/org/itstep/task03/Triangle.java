package org.itstep.task03;

import org.itstep.task03.exeption.CreateTriangleException;

public class Triangle {
    private static int a;
    private static int b;
    private static int c;
    public Triangle(int a,int b,int c) throws CreateTriangleException {
        if(a+b>c&&a+c>b&&b+c>a){
            this.a=a;
            this.b=b;
            this.c=c;
        }
        else{
            throw new CreateTriangleException("Треугольники с такими сторонами не может существовать");
        }

    }
}
