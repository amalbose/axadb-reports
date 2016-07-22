package com.axatrikx.core;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.axatrikx.exception.MissingConfigFileException;

public class Utils {

	public static final String AXACONFIG = "axaconfig.properties";

	public static final String POSTGRESQL = "postgresql";

	public static final String POSTGRESQL_INIT = "init_postgresql.sql";

	public static final String DB_ENGINE = "db_engine";

	public static final String DB_HOST = "db_host";

	public static final String DB_PORT = "db_port";

	public static final String DB_NAME = "db_name";

	public static final String DB_USER = "db_user";

	public static final String DB_PASSWORD = "db_pwd";


	private static Properties prop;

	private static void loadProperties() throws MissingConfigFileException {
		prop = new Properties();
		try {
			prop.load(new FileReader(AXACONFIG));
		} catch (IOException e) {
			throw new MissingConfigFileException();
		}
	}

	/**
	 * Returns the property from axaconfig file
	 * 
	 * @param key
	 *            the key
	 * @return the value for the key from axaconfig file
	 * @throws MissingConfigFileException
	 *             Thrown when axaconfig file is missing
	 */
	public static String getConfig(String key) throws MissingConfigFileException {
		if (prop == null) {
			loadProperties();
		}
		return prop.getProperty(key);
	}
}
