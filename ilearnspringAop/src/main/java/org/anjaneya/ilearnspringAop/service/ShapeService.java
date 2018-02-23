package org.anjaneya.ilearnspringAop.service;

import org.anjaneya.ilearnspringAop.model.Circle;
import org.anjaneya.ilearnspringAop.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
