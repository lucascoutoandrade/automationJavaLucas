package br.com.java.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Manipulador {
	
	public static Properties getProp() {
        Properties props = new Properties();
        FileInputStream file = null;
		try {
			file = new FileInputStream(
			        "./properties/dados.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			props.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return props;

}
	
}
