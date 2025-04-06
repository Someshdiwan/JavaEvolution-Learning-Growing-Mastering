class Test2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(getHTTPCodeDescClassic(404));
    }
    public static String getHTTPCodeDescClassic(int code)
    {
        if (code == 100) return "Continue";
        else if (code == 200) return "Ok";
        else if (code == 301) return "Moved Permanently";
        else if (code == 302) return "Found";
        else if (code == 400) return "Bad Request";
        else if (code == 500) return "Internal Error";
        else if (code == 502) return "Bad Gateway";
        else if (code > 100 && code < 200) return "Informational";
        else if (code > 200 && code < 300) return "Successful";
        else if (code > 302 && code < 400) return "Redirection";
        else if (code > 400 && code < 500) return "Client Error";
        else if (code > 502 && code < 600) return "Server Error";
        else return "Unknown Error";
    }
}