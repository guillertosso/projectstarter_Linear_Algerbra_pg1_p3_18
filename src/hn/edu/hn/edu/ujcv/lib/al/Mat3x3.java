package hn.edu.hn.edu.ujcv.lib.al;

public class Mat3x3 {

    private VecR3 colX;
    private VecR3 colY;
    private VecR3 colZ;

    public Mat3x3(){
        colX = new VecR3(1, 0,0);
        colY = new VecR3(0,1,0);
        colZ = new VecR3(0,0,1);
    }

    public VecR3 getColX() {
        return colX;
    }

    public void setColX(VecR3 colX) {
        this.colX = colX;
    }

    public VecR3 getColY() {
        return colY;
    }

    public void setColY(VecR3 colY) {
        this.colY = colY;
    }

    public VecR3 getColZ() { return colZ; }

    public void setColZ(VecR3 colZ) { this.colZ = colZ; }

    public VecR3 getFilaX(){
        VecR3 retval = new VecR3(colX.getX(),colY.getX(),colZ.getX());
        return retval;
    }

    public void  setFilaX(VecR3 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
        this.colZ.setX(filaX.getZ());
    }

    public VecR3 getFilaY(){
        VecR3 retval = new VecR3(colX.getY(),colY.getY(),colZ.getY());
        return retval;
    }

    public void  setFilaY(VecR3 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
        this.colZ.setY(filaY.getZ());
    }

    public VecR3 getFilaZ(){
        VecR3 retval = new VecR3(colX.getZ(),colY.getZ(),colZ.getZ());
        return retval;
    }

    public void  setFilaZ(VecR3 filaZ){
        this.colX.setZ(filaZ.getX());
        this.colY.setZ(filaZ.getY());
        this.colZ.setZ(filaZ.getZ());
    }

    // suma
    public Mat3x3 suma (Mat3x3 b){
        Mat3x3 retval = new Mat3x3();
        //            cx cy              cx cy
        // dado A  | 1  2 |  dado b  |  1  1 | x
        //          | 2  3 |          |  0  0 |  y
        //
        //   retval:
        //   |  a.cx.x + b.cx.x     a.cy.x +  b.cy.x |
        //   |  a.cx.y + b.cx.y     a.cy.y + b.cy.y  |
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   x es   getX , setX
        //   y es   getY , setY

        retval.colX.setX(this.colX.getX() + b.colX.getX());
        retval.colX.setY(this.colX.getY() + b.colX.getY());
        retval.colX.setZ(this.colX.getZ() + b.colX.getZ());
        retval.colY.setX(this.colY.getX() + b.colY.getX());
        retval.colY.setY(this.colY.getY() + b.colY.getY());
        retval.colY.setZ(this.colZ.getZ() + b.colY.getZ());
        retval.colZ.setX(this.colZ.getX() + b.colZ.getX());
        retval.colZ.setY(this.colZ.getY() + b.colZ.getY());
        retval.colZ.setZ(this.colZ.getZ() + b.colZ.getZ());

        return retval;
    }

    // resta
    public Mat3x3 resta (Mat3x3 b){
        Mat3x3 retval = new Mat3x3();

        //            cx cy              cx cy
        // dado A  | 1  2 |  dado b  |  1  1 | x
        //          | 2  3 |          |  0  0 |  y
        //
        //   retval:
        //   |  a.cx.x - b.cx.x     a.cy.x -  b.cy.x |
        //   |  a.cx.y - b.cx.y     a.cy.y - b.cy.y  |
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   x es   getX , setX
        //   y es   getY , setY

        retval.colX.setX(this.colX.getX() - b.colX.getX());
        retval.colX.setY(this.colX.getY() - b.colX.getY());
        retval.colX.setZ(this.colX.getZ() - b.colX.getZ());
        retval.colY.setX(this.colY.getX() - b.colY.getX());
        retval.colY.setY(this.colY.getY() - b.colY.getY());
        retval.colY.setZ(this.colZ.getZ() - b.colY.getZ());
        retval.colZ.setX(this.colZ.getX() - b.colZ.getX());
        retval.colZ.setY(this.colZ.getY() - b.colZ.getY());
        retval.colZ.setZ(this.colZ.getZ() - b.colZ.getZ());

        return retval;
    }

    // multiplicacion escalar
    public  Mat3x3 mul(double alpha){
        Mat3x3 retval = new Mat3x3();

        retval.colX.setX(this.colX.getX() * alpha);
        retval.colX.setY(this.colX.getY() * alpha);
        retval.colX.setZ(this.colX.getZ() * alpha);
        retval.colY.setX(this.colY.getX() * alpha);
        retval.colY.setY(this.colY.getY() * alpha);
        retval.colY.setZ(this.colZ.getZ() * alpha);
        retval.colZ.setX(this.colZ.getX() * alpha);
        retval.colZ.setY(this.colZ.getY() * alpha);
        retval.colZ.setZ(this.colZ.getZ() * alpha);

        return retval;
    }

}
