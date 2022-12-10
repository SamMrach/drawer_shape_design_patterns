package java2ddrawingapplication.FactoryPattern;

import java2ddrawingapplication.MyRectangle;
import java2ddrawingapplication.MyShapes;

import java.awt.*;

public class RectangleCreator extends BoundedShapeCreator {
    //Boolean isFilled;
    public RectangleCreator(boolean isFilled){
        this.isFilled=isFilled;
    }
    @Override
    public MyShapes createShape(Point pntA, Point pntB, Paint paint, Stroke strk) {
        return new MyRectangle(pntA, pntB, paint, strk, isFilled);
    }
}
