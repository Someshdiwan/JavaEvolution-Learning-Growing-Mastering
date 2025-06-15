class StringCC {
    public static void main(String[] args) {
        String x = "hello";
        char[] xArray = x.toCharArray();

        xArray[0] = 'j';
        x = new String(xArray);
        System.out.println(x);

        for(int i = 0; i < xArray.length; i++) {
            System.out.println(xArray[i]);
        }
    }
}
