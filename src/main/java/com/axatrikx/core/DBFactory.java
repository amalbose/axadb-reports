package com.axatrikx.core;

import com.axatrikx.exception.MissingConfigFileException;
import com.axatrikx.exception.UnSupportedDatabaseException;

public class DBFactory {

	private String engine;

	DBFactory() throws MissingConfigFileException {
		engine = Utils.getConfig("DB_ENGINE");
	}

	public DBController getDBController() throws UnSupportedDatabaseException, ClassNotFoundException {
		if (engine.equalsIgnoreCase(Utils.POSTGRESQL))
			return new PostgresqlController();
		else
			throw new UnSupportedDatabaseException(engine);
	}

}
