package com.animal.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ComportementDefault implements IComportement {

	@Override
	public void animer() {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("log");
		logger.log(Level.SEVERE, "entrain de dormir khoooooo chuuuuuu",new RuntimeException("Error"));
	}

}
