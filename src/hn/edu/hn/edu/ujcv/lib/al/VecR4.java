package hn.edu.hn.edu.ujcv.lib.al;

public class VecR4 {
    private double x;
    private double y;
    private double z;
    private double w;

    //todo: Definir variables y constructores


    //todo: conformar al contrato de un vector

    public VecR4 add( VecR4 b){
        return new VecR4(x+b.x, y+b.y, z+b.z, w+b.w);
    }

    public VecR4 sub(VecR4 b){
        VecR4 retval = new VecR4();
        retval.setX(this.getX()+ b.getX());
        retval.setY(this.getY()+ b.getY());
        retval.setZ(this.getZ()+ b.getZ());
        retval.setW(this.getW()+ b.getW());
        return retval;
    }

    public VecR4 mul(double alpha){
        VecR4 retval = new VecR4(this.getX()* alpha, y *alpha, z*alpha, w*alpha);
        return retval;
    }

    public double dotProduct(VecR4 b){
        // segun google:
        // alpha = (u1 * v1) + (u2 * v2) + (u3 * v3) + (u4 * v4)
        // u es this.
        // v es b.
        // 1 es x.
        // 2 es y.
        // 3 es z.
        // 4 es w.
        double retval;
        retval = this.x * b.x + this.y * b.y + this.z * b.z + this.w * b.w;
        return retval;
    }

    public VecR4 div(double alpha){
        VecR4 retval = new VecR4(this.getX() /alpha, y /alpha, z /alpha, w /alpha);
        return retval;
    }

    public VecR4()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }

    public VecR4(double x, double y, double z, double w)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public VecR4(VecR4 v){
        x = v.x;
        y = v.y;
        z = v.z;
        w = v.w;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() { return y;}

    public void setY(double y) { this.y = y;}

    public double getZ() { return z; }

    public void setZ(double z) { this.z = z;}

    public double getW() { return w;}

    public void setW(double w) { this.w = w;}
}
