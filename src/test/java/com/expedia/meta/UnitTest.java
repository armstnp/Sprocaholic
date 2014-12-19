package com.expedia.meta;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest{
	private Unit unit;

	@Before
	public void setUp() throws Exception{
		unit = Unit.Unit;
	}

	@Test
	public void isEqualToUnit(){
		assertEquals(Unit.Unit, unit);
		assertEquals(unit, Unit.Unit);
	}

	@Test
	public void isNotEqualToSampleObject(){
		assertNotEquals(new Object(), unit);
		assertNotEquals(unit, new Object());
	}

	@Test
	public void isNotEqualToZero(){
		assertNotEquals(0, unit);
		assertNotEquals(unit, 0);
	}

	@Test
	public void hasConstantHashCode(){
		assertEquals(Unit.Unit.hashCode(), unit.hashCode());
	}

	@Test
	public void hasAppropriateStringRepresentation(){
		assertEquals("()", unit.toString());
	}
}