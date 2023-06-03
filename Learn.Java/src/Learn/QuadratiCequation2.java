package Learn;

public class QuadratiCequation2 {
    private int a ;
    private int b ;
    private int c ;

    public QuadratiCequation2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadratiCequation2() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public int getAi(int a,int b , int c){
        int delta = (b*b)-4*a*c;
        return delta;
    }

}
