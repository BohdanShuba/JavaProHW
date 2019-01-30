package client;

public class Utils {
    private static final String URL = "http://127.0.0.1";
    private static final int PORT = 8081;

    public static String getURL() {
        return URL + ":" + PORT ;
    }
}