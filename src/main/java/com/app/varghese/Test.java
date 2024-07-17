package com.app.varghese;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test { // Test class is created for log demo
	@SuppressWarnings("unused")
	private static final Logger Log = LogManager.getLogger(Test.class);

	public static void main(String[] VargheseBaby) {
		processData();

	}

	public static void processData() { // just gave processData method
		Log.trace("FROM TRACE METHOD"); // Log Priority method
		Log.debug("FROM DEBUG METHOD");
		Log.info("FROM INFO METHOD");
		Log.warn("FROM WARN METHOD");
		Log.error("FROM ERROR METHOD");
		Log.fatal("FROM FATAL METHOD");
		// .. read input
		// .. validate them
		// .. store in db
		// .. return results
		/* Download dependinces from maven log4j-core 2.11.2 & Log4j API » 2.11.2 */
		/*
		 * Next Step Create Log4j 2 xml fie in src/main/resources -right click create a
		 * file name is -> log4j2.xml add all and right click on project refresh log folder avail
		 * able in that we can see log in file format and location available
		 */

	}
}
