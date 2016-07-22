package com.axatrikx;

import com.axatrikx.core.AxaReporterImpl;
import com.axatrikx.exception.MissingConfigFileException;
import com.axatrikx.exception.UnSupportedDatabaseException;

public class AxaReporterFactory {

	public AxaReporter getReporter() throws MissingConfigFileException, UnSupportedDatabaseException, ClassNotFoundException {
		return new AxaReporterImpl();
	}

}
