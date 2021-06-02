package com.emergya.wifieapconfigurator.config;

/**
 * Exception to indicate an error with a NetworkConfiguration using API 28
 *
 * This might indicate something wrong with the configuration, something in the device blocking
 * the creation of the network or a bug in the code where the API was called from a build target
 * higher than API 28, where this specific API is no longer available.
 */
public class NetworkConfigurationException extends NetworkException {
	NetworkConfigurationException() {
		super();
	}

	NetworkConfigurationException(String message) {
		super(message);
	}

	NetworkConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

	NetworkConfigurationException(Throwable cause) {
		super(cause);
	}

}
