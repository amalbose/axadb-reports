package com.axatrikx.core;

import com.axatrikx.AxaReporter;
import com.axatrikx.AxaStatus;
import com.axatrikx.exception.MissingConfigFileException;
import com.axatrikx.exception.UnSupportedDatabaseException;

public class AxaReporterImpl implements AxaReporter {

	private DBController dbController;

	public AxaReporterImpl() throws MissingConfigFileException, UnSupportedDatabaseException, ClassNotFoundException {
		loadConfig();
	}

	/**
	 * Load data from config file
	 * 
	 * @throws MissingConfigFileException
	 * @throws UnSupportedDatabaseException
	 * @throws ClassNotFoundException 
	 */
	private void loadConfig() throws MissingConfigFileException, UnSupportedDatabaseException, ClassNotFoundException {
		dbController = new DBFactory().getDBController();
	}

	public void setScript(String scriptName) {
		// TODO Auto-generated method stub

	}

	public void setTestCase(String testCaseName) {
		// TODO Auto-generated method stub

	}

	public void reportEvent(String description) {
		// TODO Auto-generated method stub

	}

	public void reportEvent(String description, String screenshot) {
		// TODO Auto-generated method stub

	}

	public void reportEvent(String description, AxaStatus status) {
		// TODO Auto-generated method stub

	}

	public void reportEvent(String description, AxaStatus status, String screenshot) {
		// TODO Auto-generated method stub

	}

	public void reportEvent(String description, AxaStatus status, Throwable err) {
		// TODO Auto-generated method stub

	}

	public void reportEvent(String description, AxaStatus status, Throwable err, String screenshot) {
		// TODO Auto-generated method stub

	}

}
