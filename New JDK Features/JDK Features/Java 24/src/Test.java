public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(getHTTPCodeDescWithSwitch(404));
    }
    public static String getHTTPCodeDescWithSwitch(int code) {
        return switch (code) {
            case 100 -> "Continue";
            case 200 -> "Ok";
            case 301 -> "Moved Permanently";
            case 302 -> "Found";
            case 400 -> "Bad Request";
            case 500 -> "Internal Error";
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

/*    switch (code){
        case 100:
            return "Continue";
        case 200:
            return "Ok";
        case 301:
            return "Moved Permanently";
        case 302:
            return "Found";
        case 400:
            return "Bad Request";
        case 500:
            return "Internal Server Error";
        case 502:
            return "Bad gateway";
        default:
            if(code > 100 && code < 200)
            {
                return "Informational";
            }
            else if(code > 200 && code < 300)
            {
                return "Successful";
            }
            else if(code>302 && code <400)
            {
                return "Redirection";
            }
            else if(code >400 && code <500)
            {
                return "Client Error";
            }
            else if(code>502 && code<600)
            {
                return "Server error";
            }
            else
            {
                return "Unknown Error";
            }
    }*/