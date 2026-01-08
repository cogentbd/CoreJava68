package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreateProperty {

    public static void main(String[] args) {
        Properties prop = new Properties();
        OutputStream output = null;

        try {

            output = new FileOutputStream("config.properties");

            // set the properties value
            prop.setProperty("database", "localhost");
            prop.setProperty("dbuser", "user");
            prop.setProperty("dbpassword", "123");

            // save properties to project root folder
            prop.store(output, "database configuration");

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
