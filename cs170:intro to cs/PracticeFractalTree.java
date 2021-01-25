public class PracticeFractalTree {

    public static void f(Turtle t, double x, int n) {
        if (n < 1) {
            return;
        } else {
            t.forward(x);
            f(t, x * 1.2, n -1);
            t.left(10 * n);
            f(t, x * 1.2, n-1);
            t.right(20 * n);
            f(t, x * .6, n-1);
            t.left(10 * n);
            t.backward(x);
        }
    }
    
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.delay(1);
        f(t, 50, 2);
    }
    
}