/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rival8042023;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getName() {
        return "Square";
    }

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape square = new Square(1);

        System.out.println("Area of " + circle.getName() + ": " + circle.getArea());
        System.out.println("Area of " + square.getName() + ": " + square.getArea());
    }
}
