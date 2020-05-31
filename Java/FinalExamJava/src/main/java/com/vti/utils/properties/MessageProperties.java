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
public class MessageProperties {

	private Properties properties;

	/**
	 * Constructor for class MessageProperties.
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
	public MessageProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(DatabaseProperties.RESOURCE_FOLDER_URL + "message.properties"));
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
	public String getPropesrty(String key) {
		return properties.getProperty(key);
	}
}
