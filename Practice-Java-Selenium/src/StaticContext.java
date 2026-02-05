
class Test {
    static int x = 5;
    int y = 10;
}

class Driver{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        Test.x = 20;
        t1.y = 30;

        System.out.println(Test.x);
        System.out.println(t2.y);
    }
}
