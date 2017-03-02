package com.animal.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ComportementFelin implements IComportement{

	@Override
	public void animer() {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("log");
		logger.log(Level.SEVERE, "Miawwww miaowwwww grrrrrr",new RuntimeException("Error"));
	}

}
