/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package io.github.dkaksl.cryptographers_conundrum;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Amani Kilumanga
 *
 */
public class SolverTest {

	private static final String SAMPLE_INPUT_1 = "SECRET";
	private static final int SAMPLE_OUTPUT_1 = 4;

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void sampleInput() throws Exception {
		assertEquals(SAMPLE_OUTPUT_1, Solver.calculateTime(SAMPLE_INPUT_1));
	}

	@Test
	public void inputNotDivisibleByThree() throws Exception {
		exception.expect(InputException.class);
		exception.expectMessage(SubMessage.DIVISION_ERROR.message());
		Solver.calculateTime("ab");
	}

	@Test
	public void tooLargeInpu() throws Exception {
		exception.expect(InputException.class);
		exception.expectMessage(SubMessage.MAX_LENGTH_EXCEEDED.message());
		Solver.calculateTime(
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
}
