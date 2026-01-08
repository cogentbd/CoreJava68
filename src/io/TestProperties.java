package io;

import java.util.Properties;
import java.util.Enumeration;

public class TestProperties {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.list(System.out);
    }
}
