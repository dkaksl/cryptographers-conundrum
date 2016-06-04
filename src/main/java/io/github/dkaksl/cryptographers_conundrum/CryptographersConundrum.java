/** 
 * 
 * Copyright (C) 2016 Amani Kilumanga
 *
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 */
package io.github.dkaksl.cryptographers_conundrum;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @author Amani Kilumanga
 *
 */
public class CryptographersConundrum {

	public static void main(String[] args) throws InputException {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			if (!input.isEmpty()) {
				System.out.println(Solver.calculateTime(input));
				break;
			}
		}
		scanner.close();
	}

}
