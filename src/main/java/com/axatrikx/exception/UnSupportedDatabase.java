package com.axatrikx.exception;

/**
 * Thrown when unsupported database engine is provided in axaconfig file.
 * 
 * @author amalbose
 *
 */
public class UnSupportedDatabase extends Exception {

	private static final long serialVersionUID = -562979900545555842L;

	public UnSupportedDatabase(String database) {
		super("Unsupported database " + database);
	}
}
