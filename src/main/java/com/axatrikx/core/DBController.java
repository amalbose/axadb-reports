package com.axatrikx.core;

import java.sql.SQLException;

public interface DBController {

	String getInitSQL();

	void initDataBase(String host, String port, String database, String userName, String password)
			throws SQLException;
	
	void executeUpdate(String statement);
	
}
