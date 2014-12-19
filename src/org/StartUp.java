package org;

import org.g4studio.core.properties.PropertiesFactory;
import org.g4studio.core.properties.PropertiesFile;
import org.g4studio.core.properties.PropertiesHelper;
import org.g4studio.core.server.G4Server;

/**
 * 系统启动
 * 
 * @author XiongChun
 * @since 2009-01-13
 */
public class StartUp {
	public static void main(String[] args) {
		PropertiesHelper pHelper = PropertiesFactory.getPropertiesHelper(PropertiesFile.G4SERVER);
		G4Server server = new G4Server(
				pHelper.getValue("g4server.WebResource"),
				pHelper.getValue("g4server.WebContext"),
				new Integer(pHelper.getValue("g4server.WebPort"))
				);
		server.stop();
		try {
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
