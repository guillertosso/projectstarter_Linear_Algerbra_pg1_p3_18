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


}
