package com.axatrikx.core;

import com.axatrikx.exception.MissingConfigFileException;
import com.axatrikx.exception.UnSupportedDatabase;

public class DBController {

	private String engine;

	DBController() throws MissingConfigFileException, UnSupportedDatabase {
		engine = Utils.getConfig("DB_ENGINE");
		initDatabase();
	}

	private void initDatabase() throws UnSupportedDatabase {
		executeSQLFile(getInitFile(engine));
	}

	private void executeSQLFile(String initFile) {

	}

	private String getInitFile(String engine) throws UnSupportedDatabase {
		String initFile = "";
		if (engine.equalsIgnoreCase(Utils.POSTGRESQL))
			initFile = Utils.POSTGRESQL_INIT;
		else
			throw new UnSupportedDatabase(engine);
		return initFile;
	}
}
