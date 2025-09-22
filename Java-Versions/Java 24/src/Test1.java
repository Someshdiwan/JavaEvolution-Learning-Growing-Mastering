public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(getHTTPCodeDescWithSwitch(404));
    }
    public static String getHTTPCodeDescWithSwitch(int code) {
        return switch (code) {
            case 100 -> "Continue";
            case 200 -> "OK";
            case 301 -> "Moved Permanently";
            case 302 -> "Found";
            case 400 -> "Bad Request";
            case 500 -> "Internal Server Error";
            case 502 -> "Bad Gateway";

            case int i when i > 100 && i < 200 -> "Informational";
            case int i when i > 200 && i < 300 -> "Successful";
            case int i when i > 302 && i < 400 -> "Redirection";
            case int i when i > 400 && i < 500 -> "Client Error";
            case int i when i > 502 && i < 600 -> "Server Error";
            default -> "Unknown Error";
        };
    }
}
