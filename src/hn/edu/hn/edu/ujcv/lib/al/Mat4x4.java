package hn.edu.hn.edu.ujcv.lib.al;

public class Mat4x4 {

    private VecR4 colX;
    private VecR4 colY;
    private VecR4 colZ;
    private VecR4 colW;

    public Mat4x4(){
        colX = new VecR4(1,0,0,0);
        colY = new VecR4(0,1,0,0);
        colZ = new VecR4(0,0,1,0);
        colW = new VecR4(0,0,0,1);
    }

    public VecR4 getColX() {
        return colX;
    }

    public void setColX(VecR4 colX) {
        this.colX = colX;
    }

    public VecR4 getColY() {
        return colY;
    }

    public void setColY(VecR4 colY) {
        this.colY = colY;
    }

    public VecR4 getColZ() { return colZ; }

    public void setColZ(VecR4 colZ) { this.colZ = colZ; }

    public VecR4 getColW() { return colW; }

    public void setColW(VecR4 colW) { this.colW = colW; }

    public VecR4 getFilaX(){
        VecR4 retval = new VecR4(colX.getX(),colY.getX(),colZ.getX(),colW.getX());
        return retval;
    }

    public void  setFilaX(VecR4 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
        this.colZ.setX(filaX.getZ());
        this.colW.setX(filaX.getW());
    }

    public VecR4 getFilaY(){
        VecR4 retval = new VecR4(colX.getY(),colY.getY(),colZ.getY(),colW.getY());
        return retval;
    }

    public void  setFilaY(VecR4 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
        this.colZ.setY(filaY.getZ());
        this.colW.setY(filaY.getW());
    }

    public VecR4 getFilaZ(){
        VecR4 retval = new VecR4(colX.getZ(),colY.getZ(),colZ.getZ(),colW.getZ());
        return retval;
    }

    public void  setFilaZ(VecR4 filaZ){
        this.colX.setZ(filaZ.getX());
        this.colY.setZ(filaZ.getY());
        this.colZ.setZ(filaZ.getZ());
        this.colW.setZ(filaZ.getW());
    }

    public VecR4 getFilaW(){
        VecR4 retval = new VecR4(colX.getW(),colY.getW(),colZ.getW(),colW.getW());
        return retval;
    }

    public void  setFilaW(VecR4 filaW){
        this.colX.setZ(filaW.getX());
        this.colY.setZ(filaW.getY());
        this.colZ.setZ(filaW.getZ());
        this.colW.setZ(filaW.getW());
    }

    // suma
    public Mat4x4 suma (Mat4x4 b){
        Mat4x4 retval = new Mat4x4();
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

        //col 1
        retval.colX.setX(this.colX.getX() + b.colX.getX());
        retval.colX.setY(this.colX.getY() + b.colX.getY());
        retval.colX.setZ(this.colX.getZ() + b.colX.getZ());
        retval.colX.setW(this.colX.getW() + b.colX.getW());
        //col 2
        retval.colY.setX(this.colY.getX() + b.colY.getX());
        retval.colY.setY(this.colY.getY() + b.colY.getY());
        retval.colY.setZ(this.colY.getZ() + b.colY.getZ());
        retval.colY.setW(this.colY.getW() + b.colY.getW());
        //col 3
        retval.colZ.setX(this.colZ.getX() + b.colZ.getX());
        retval.colZ.setY(this.colZ.getY() + b.colZ.getY());
        retval.colZ.setZ(this.colZ.getZ() + b.colZ.getZ());
        retval.colZ.setW(this.colZ.getW() + b.colZ.getW());
        //col 4
        retval.colW.setX(this.colW.getX() + b.colW.getX());
        retval.colW.setY(this.colW.getY() + b.colW.getY());
        retval.colW.setZ(this.colW.getZ() + b.colW.getZ());
        retval.colW.setW(this.colW.getW() + b.colW.getW());

        return retval;
    }

    // resta
    public Mat4x4 resta (Mat4x4 b){
        Mat4x4 retval = new Mat4x4();

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

        //col 1
        retval.colX.setX(this.colX.getX() - b.colX.getX());
        retval.colX.setY(this.colX.getY() - b.colX.getY());
        retval.colX.setZ(this.colX.getZ() - b.colX.getZ());
        retval.colX.setW(this.colX.getW() - b.colX.getW());
        //col 2
        retval.colY.setX(this.colY.getX() - b.colY.getX());
        retval.colY.setY(this.colY.getY() - b.colY.getY());
        retval.colY.setZ(this.colY.getZ() - b.colY.getZ());
        retval.colY.setW(this.colY.getW() - b.colY.getW());
        //col 3
        retval.colZ.setX(this.colZ.getX() - b.colZ.getX());
        retval.colZ.setY(this.colZ.getY() - b.colZ.getY());
        retval.colZ.setZ(this.colZ.getZ() - b.colZ.getZ());
        retval.colZ.setW(this.colZ.getW() - b.colZ.getW());
        //col 4
        retval.colW.setX(this.colW.getX() - b.colW.getX());
        retval.colW.setY(this.colW.getY() - b.colW.getY());
        retval.colW.setZ(this.colW.getZ() - b.colW.getZ());
        retval.colW.setW(this.colW.getW() - b.colW.getW());

        return retval;
    }

    // multiplicacion escalar
    public  Mat4x4 mul(double alpha){
        Mat4x4 retval = new Mat4x4();

        //col 1
        retval.colX.setX(this.colX.getX() * alpha);
        retval.colX.setY(this.colX.getY() * alpha);
        retval.colX.setZ(this.colX.getZ() * alpha);
        retval.colX.setW(this.colX.getW() * alpha);
        //col 2
        retval.colY.setX(this.colY.getX() * alpha);
        retval.colY.setY(this.colY.getY() * alpha);
        retval.colY.setZ(this.colY.getZ() * alpha);
        retval.colY.setW(this.colY.getW() * alpha);
        //col 3
        retval.colZ.setX(this.colZ.getX() * alpha);
        retval.colZ.setY(this.colZ.getY() * alpha);
        retval.colZ.setZ(this.colZ.getZ() * alpha);
        retval.colZ.setW(this.colZ.getW() * alpha);
        //col 4
        retval.colW.setX(this.colW.getX() * alpha);
        retval.colW.setY(this.colW.getY() * alpha);
        retval.colW.setZ(this.colW.getZ() * alpha);
        retval.colW.setW(this.colW.getW() * alpha);

        return retval;
    }

    // multiplicacion vector columna
    public VecR4 mul(VecR4 v){
        VecR4 retval = new VecR4();

        retval.setX(colX.getX()*v.getX() + colX.getY()*v.getY() + colX.getZ()*v.getZ() + colX.getW()*v.getW());
        retval.setY(colY.getX()*v.getX() + colY.getY()*v.getY() + colY.getZ()*v.getZ() + colY.getW()*v.getW());
        retval.setZ(colZ.getX()*v.getX() + colZ.getY()*v.getY() + colZ.getZ()*v.getZ() + colZ.getW()*v.getW());
        retval.setW(colW.getX()*v.getX() + colW.getY()*v.getY() + colW.getZ()*v.getZ() + colW.getW()*v.getW());

        return retval;
    }

    public Mat4x4 mul (Mat4x4 b){
        Mat4x4 retval =  new Mat4x4();

        //            cx cy              cx cy
        // dado A  x| 1  2 |  dado b  |  1  1 | fx
        //          y| 2  3 |          |  0  0 | fy
        //             x  y
        //   retval:
        //   |   a.fx.dot(b.cx)   a.fx.dot(b.cy) |
        //   |   a.fy.dot(b.cx)   a.fy.dot(b.cy) |
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   x es   getX , setX
        //   y es   getY , setY

        //col 1
        retval.colX.setX(this.getFilaX().dotProduct(b.colX));
        retval.colX.setY(this.getFilaY().dotProduct(b.colX));
        retval.colX.setZ(this.getFilaZ().dotProduct(b.colX));
        retval.colX.setW(this.getFilaW().dotProduct(b.colX));
        //col 2
        retval.colY.setX(this.getFilaX().dotProduct(b.colY));
        retval.colY.setY(this.getFilaY().dotProduct(b.colY));
        retval.colY.setZ(this.getFilaZ().dotProduct(b.colY));
        retval.colY.setW(this.getFilaW().dotProduct(b.colY));
        //col 3
        retval.colZ.setX(this.getFilaX().dotProduct(b.colZ));
        retval.colZ.setY(this.getFilaY().dotProduct(b.colZ));
        retval.colZ.setZ(this.getFilaZ().dotProduct(b.colZ));
        retval.colZ.setW(this.getFilaW().dotProduct(b.colZ));
        //col 4
        retval.colW.setX(this.getFilaX().dotProduct(b.colW));
        retval.colW.setY(this.getFilaY().dotProduct(b.colW));
        retval.colW.setZ(this.getFilaZ().dotProduct(b.colW));
        retval.colW.setW(this.getFilaW().dotProduct(b.colW));

        return retval;
    }

}
