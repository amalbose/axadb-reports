package com.axatrikx;

import com.axatrikx.core.AxaReporterImpl;
import com.axatrikx.exception.MissingConfigFileException;
import com.axatrikx.exception.UnSupportedDatabase;

public class AxaReporterFactory {

	public AxaReporter getReporter() throws MissingConfigFileException, UnSupportedDatabase {
		return new AxaReporterImpl();
	}

}
