package com.expedia.meta;

public final class Unit{
	private Unit(){}

	public static final Unit Unit = new Unit();

	public boolean equals(Object o){
		return o != null && o instanceof Unit;
	}

	public int hashCode(){
		return 0;
	}

	public String toString(){
		return "()";
	}
}
