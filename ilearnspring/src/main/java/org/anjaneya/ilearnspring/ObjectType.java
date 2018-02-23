package org.anjaneya.ilearnspring;

public class ObjectType implements Shape{

	private String objectName;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectName() {
		return objectName;
	}
	/*public void draw(Point point) {
		System.out.println(name + "coordinates is :"+ point);
		
	}*/
	
	public void draw() {
		System.out.println(getObjectName() + " coordinates are :" + getPointA().getXpoint() + ":" + getPointA().getYpoint());
		System.out.println(getObjectName() + " coordinates are :" + getPointB().getXpoint() + ":" + getPointB().getYpoint());
		System.out.println(getObjectName() + " coordinates are :" + getPointC().getXpoint() + ":" + getPointC().getYpoint());
		
	}

}
