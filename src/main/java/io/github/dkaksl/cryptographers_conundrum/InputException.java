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
@SuppressWarnings("serial")
public class InputException extends Exception {
	public InputException(String message, SubMessage subMessage) {
		super(message + " (" + subMessage.message() + ")");
	}
}
