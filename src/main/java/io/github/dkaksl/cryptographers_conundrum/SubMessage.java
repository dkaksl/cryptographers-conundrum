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
public enum SubMessage {
	MAX_LENGTH_EXCEEDED("length exceeded"),  //
	DIVISION_ERROR("division error"); //

	private final String message;

	private SubMessage(String message) {
		this.message = message;
	}

	public String message() {
		return this.message;
	}
}
