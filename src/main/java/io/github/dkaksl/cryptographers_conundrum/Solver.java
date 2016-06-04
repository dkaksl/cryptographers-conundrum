/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package io.github.dkaksl.cryptographers_conundrum;

/**
 * @author Amani Kilumanga
 *
 */
public class Solver {
	public static int calculateTime(String cypher) throws InputException {
		if (cypher.length() > 300) {
			throw new InputException("length: " + cypher.length(), SubMessage.MAX_LENGTH_EXCEEDED);
		}
		if (cypher.length() % 3 != 0) {
			throw new InputException("length: " + cypher.length(), SubMessage.DIVISION_ERROR);
		}

		int time = 0;
		char[] cypherArray = cypher.toUpperCase().toCharArray();

		for (int i = 0; i < cypher.length();) {
			time = cypherArray[i++] != 'P' ? ++time : time;
			time = cypherArray[i++] != 'E' ? ++time : time;
			time = cypherArray[i++] != 'R' ? ++time : time;
		}

		return time;
	}
}
