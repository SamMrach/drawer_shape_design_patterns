package java2ddrawingapplication.FactoryPattern;

import java2ddrawingapplication.MyOval;
import java2ddrawingapplication.MyShapes;

import java.awt.*;

public class CercleCreator extends BoundedShapeCreator {
    //Boolean isFilled;
    public CercleCreator(Boolean isFilled){
        this.isFilled=isFilled;
    }
    @Override
    public MyShapes createShape(Point pntA, Point pntB, Paint paint, Stroke strk) {
        return new MyOval(pntA, pntB, paint, strk, isFilled);
    }
}
