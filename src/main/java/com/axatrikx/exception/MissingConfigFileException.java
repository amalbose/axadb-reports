package com.axatrikx.exception;

import com.axatrikx.core.Utils;

/**
 * Thrown when axaconfig file is missing
 * 
 * @author amalbose
 *
 */
public class MissingConfigFileException extends Exception {

	private static final long serialVersionUID = -304259395399062759L;

	public MissingConfigFileException() {
		super("Config file '" + Utils.AXACONFIG + "' could not be found");
	}

}
