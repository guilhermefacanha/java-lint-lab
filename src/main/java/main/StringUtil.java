package main;

import java.io.Serializable;

public class StringUtil implements Serializable {

    private static final long serialVersionUID = -5354914333211341971L;

    public static boolean isAdmin(String str) {
        return str.equals("admin");
    }
    
    public static boolean isNullOrEmpty(String str) {
        return str.isEmpty();
    }
    
}
