package com.Practical;

abstract class  Rectangle{
	public double length;
	public double breath;
	public Rectangle(double length, double breath) {
		
		this.length = length;
		this.breath = breath;
	}
	 public void area() {
	        System.out.println(breath * length);
	    }

	    public void perimeter() {
	        System.out.println(2 * (breath + length));
	    }
	
	
	
}

 class square extends Rectangle {
	 
    public square(double side) {
        super(side, side);
    }
}



public class RectangleAndParamiter {
	public static void main(String[] args) {
        
        Rectangle square = new square(10);
        square.area();
        square.perimeter();
        System.out.println();
        square.area();
        square.perimeter();
    }

}
