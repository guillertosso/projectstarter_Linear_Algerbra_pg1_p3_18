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

}
