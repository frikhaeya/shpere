package eya;

import java.lang.Math.*;

public class sphere {

	public double radius;
	
	public sphere(double radius) {
		this.radius = radius;
	}
	
	public double diameter() {
		return this.radius*2;
	}
	
	public double circumference() {
		return (this.radius*2*Math.PI);
	}
	
	public double surface_area() {
		return (4*Math.PI*Math.pow(this.radius,2));
	}
	
	public double volume() {
		return (4/3*Math.PI*Math.pow(this.radius,3));
	}
	
	public static void main(String[] args) {
		sphere s1 = new sphere(5.7);
		System.out.print("la sphére est de rayon: ");
		System.out.println(s1.radius);
		System.out.print("la sphére est de diametre: ");
		System.out.println(s1.diameter());
		System.out.print("la sphére est de circumference: ");
		System.out.println(s1.circumference());
		System.out.print("la sphére est de surface: ");
		System.out.println(s1.surface_area());
		System.out.print("la sphére est de volume: ");
		System.out.println(s1.volume());


	}
	
}
