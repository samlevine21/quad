public class QuadraticFunction {
    private int a = 1;
    private int b = 1;
    private int c = 1;

    //form ax^2+bx+c
    public QuadraticFunction(int aNew, int bNew, int cNew){
        a = aNew;
        b = bNew;
        c = cNew;
    }

    public double valueAt(double x) {
        return a*x*x + b*x + c;
    }
    
    @Override
    public String toString() {
        String q = a + "x^2";
        q = q.replace("1", "");
        if (b > 0) 
            q += "+" + b + "x";
        if (b < 0)
            q += b + "x";
        q = q.replace("1", "");
        if (c > 0) 
            q += "+" + c;
        if (c < 0)
            q += c;
        return q;
    }
    
    @Override 
    public boolean equals(Object o) {
        QuadraticFunction q = (QuadraticFunction) o;
        return (a == q.a & b == q.b && c == q.c);
    }
    
}
