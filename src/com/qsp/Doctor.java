package com.qsp;

public class Doctor {

	public void checkPulse() {
		System.out.println("Check Pulse");
		// TODO Auto-generated method stub

	}
	public void checkBloodPressure() {
		System.out.println("Check Blood Pressure");
	}

}
class Cardiology extends Doctor{
	public void byPassSurgery() {
		System.out.println("I am cardilogiest");
	}
}
