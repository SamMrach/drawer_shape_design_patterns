package java2ddrawingapplication.FactoryPattern;

import java2ddrawingapplication.MyShapes;

import java.awt.*;

public interface ShapeCreator {
    public MyShapes createShape(Point pntA, Point pntB, Paint paint, Stroke strk);
}
