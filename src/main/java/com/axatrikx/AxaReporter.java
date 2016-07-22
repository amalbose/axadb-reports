package com.axatrikx;

/**
 * 
 * @author amalbose
 *
 */
public interface AxaReporter {

	public void setScript(String scriptName);

	public void setTestCase(String testCaseName);

	public void reportEvent(String description);

	public void reportEvent(String description, String screenshot);

	public void reportEvent(String description, AxaStatus status);

	public void reportEvent(String description, AxaStatus status, String screenshot);

	public void reportEvent(String description, AxaStatus status, Throwable err);

	public void reportEvent(String description, AxaStatus status, Throwable err, String screenshot);

}
