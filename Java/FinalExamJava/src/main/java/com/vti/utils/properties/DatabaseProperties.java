package com.vti.utils.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is used for accessing properties file.
 * 
 * @Description: .
 * @author: N.H.Mạnh
 * @create_date: 2020/05/30
 * @version: 1.0
 * @modifer: N.H.Mạnh
 * @modifer_date: 2020/05/30
 */
public class DatabaseProperties {

	public static final String RESOURCE_FOLDER_URL = "D:\\VTIacademy\\Eclipse IDE for Enterprise Java Developers\\FinalExamJava\\src\\main\\resource";

	private Properties properties;
	
	/**
	 * Constructor for class DatabaseProperties.
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public DatabaseProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_FOLDER_URL + "database.properties"));
	}

	/**
	 * This method is used for get property from properties file. 
	 * 
	 * @Description: .
	 * @author: N.H.Mạnh
	 * @create_date: 2020/05/30
	 * @version: 1.0
	 * @modifer: N.H.Mạnh
	 * @modifer_date: 2020/05/30
	 * @param key
	 * @return
	 */
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
