package com.qsp;

public class DoctorDriver {

	public static void main(String[] args) {
		Doctor d=new Doctor();
		d.checkBloodPressure();
		d.checkPulse();
		Cardiology c=new Cardiology();
		System.out.println("==================cardiologist======================");
		c.checkBloodPressure();
		c.checkPulse();
		c.byPassSurgery();
	}

}