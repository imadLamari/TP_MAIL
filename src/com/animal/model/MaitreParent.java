package com.animal.model;

import com.parent.model.Parent;

public class MaitreParent extends Maitre {
	
	public MaitreParent() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the parent
	 */
	public Parent getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Parent parent) {
		this.parent = parent;
	}

	private Parent parent;
	
	
	

}
