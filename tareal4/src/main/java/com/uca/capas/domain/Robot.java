package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="Ups, no puedes agregar tu producto porque ERES UN JUGUETE, digo robot, favor hacer click en regresar.")
	private Boolean soyRobot;
	
	public Robot() {
		super();
	}

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	

}
