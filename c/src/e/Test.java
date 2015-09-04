package e;
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
        foo2();
    }

    static x.y bar() {
        x.y.method();
        return new x.y();
    }

    static e.a.b foo() {
        e.a.b.method();
        return new e.a.b();
    }

    static a.b foo2() {
        a.b.method();
        return new a.b();
    }

}