import e.a.b;
import x.y;

class Test {
    public static void main(String[] args) {
        new y();
        y.method();
        bar();

        new b();
        b.method();
        foo();
    }

    static x.y bar() {
        x.y.method();
        return new x.y();
    }

    static b foo() {
        b.method();
        return new b();
    }

}