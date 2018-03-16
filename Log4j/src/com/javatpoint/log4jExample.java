package com.javatpoint;

import org.apache.log4j.Logger;

public class log4jExample {

	final static Logger logger = Logger.getLogger(log4jExample.class);

	public static void main(String[] args) {

		log4jExample obj = new log4jExample();
		obj.runMe("mkyong");

	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}

}