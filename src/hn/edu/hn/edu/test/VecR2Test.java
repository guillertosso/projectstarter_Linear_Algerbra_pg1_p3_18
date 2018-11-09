package hn.edu.hn.edu.test;

import hn.edu.hn.edu.ujcv.lib.al.VecR2;

import static org.junit.Assert.*;

public class VecR2Test {
    private VecR2 a;
    private VecR2 b;
    private VecR2 c;
    private VecR2 d;
    private VecR2 e;
    private VecR2 f;
    private VecR2 fx2;
    private double delta;
    private VecR2 ex3;
    private double aDb;
    private double bDd;
    private double eDe;
    private double dDe;

    @org.junit.Before
    public void setUp() throws Exception {
        a = new VecR2();// constructor por defecto.
        b = new VecR2(2.2,1.1); //constructor de conveniencia.
        c = new VecR2(b); // constructor de copia.
        d = new VecR2(-2.2,-1.1);
        e = new VecR2(3,3);
        f = new VecR2(-10,50);
        fx2 = new VecR2(-20,100);
        ex3 = new VecR2(9,9);
        aDb = 0;
        bDd = -4.84 + -1.21;
        eDe = 3*3 +3*3;
        dDe = -2.2 * 3 + -1.1 * 3;

        delta = 0.00001;

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        VecR2 temp = a.add(b);
        assertEqualsVecR2(b,temp,delta);
        temp = b.add(d);
        assertEqualsVecR2(a,temp,delta);
        temp = f.add(f);
        assertEqualsVecR2(fx2,temp,delta);
        // probando constructor de copia.
        assertEqualsVecR2(b,c,delta);

    }

    @org.junit.Test
    public void sub() {
        VecR2 temp = a.add(b);
        assertEqualsVecR2(b,temp,delta);
        temp = b.add(d);
        assertEqualsVecR2(a,temp,delta);
        temp = f.add(f);
        assertEqualsVecR2(fx2,temp,delta);
    }

    @org.junit.Test
    public void mul() {
        VecR2 temp = e.mul(3);
        assertEqualsVecR2(ex3,temp,delta);
        temp = f.mul(2);
        assertEqualsVecR2(fx2,temp,delta);
    }

    @org.junit.Test
    public void dotProduct() {
        assertEquals(aDb,a.dotProduct(b),delta);
        assertEquals(bDd,b.dotProduct(d),delta);
        assertEquals(eDe,e.dotProduct(e),delta);
        assertEquals(dDe,d.dotProduct(e),delta);
    }

    @org.junit.Test
    public void div() {
        VecR2 temp = e.div(3);
        assertEqualsVecR2(new VecR2(1,1),temp,delta);
        temp = ex3.div(3);
        assertEqualsVecR2(e,temp,delta);
        temp = fx2.div(2.00000000000001);
        assertEqualsVecR2(f,temp,delta);
    }
    public static void assertEqualsVecR2(VecR2 expected, VecR2 actual, double delta){
        assertEquals(expected.getX(),actual.getX(),delta);
        assertEquals(expected.getY(),actual.getY(),delta);
    }
}
