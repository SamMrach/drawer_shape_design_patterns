package java2ddrawingapplication.FactoryPattern;

import java2ddrawingapplication.MyLine;
import java2ddrawingapplication.MyShapes;

import java.awt.*;

public class LineCreator implements ShapeCreator{
    @Override
    public MyShapes createShape(Point pntA, Point pntB, Paint paint, Stroke strk) {
        return new MyLine(pntA, pntB, paint, strk);
    }
}
