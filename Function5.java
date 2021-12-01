public class Function5 extends Function {
    @Override
    public double fnValue(double x) {
        return 1/Math.sin(x);
    }
    @Override
    public String toString() {
        return "sin(1/x)";
    }
}
