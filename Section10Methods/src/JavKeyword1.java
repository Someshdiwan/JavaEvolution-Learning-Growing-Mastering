class Test {
    int x, y, res;

    void getData(int x, int y) {
        this.x = x; // 'this' it is keyword.
        this.y = y;
    }
    void display() {
        res = x+y;
        System.out.println(res);
    }
}
class JavKeyword1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.getData(5,7);
        t.display();
    }
}
