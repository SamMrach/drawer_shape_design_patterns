package java2ddrawingapplication.FactoryPattern;

import java2ddrawingapplication.MyLine;
import java2ddrawingapplication.MyOval;
import java2ddrawingapplication.MyRectangle;
import java2ddrawingapplication.MyShapes;

import java.awt.*;

public class ShapeFactory {
    public static MyShapes getShape(int shape_selected, Point start, Point end, Paint paint, Stroke stroke, boolean isFilled){
        switch (shape_selected) {

            case 0: // rectangle
                 RectangleCreator recCreator=new RectangleCreator(isFilled);
                 return recCreator.createShape(start,start,paint,stroke);

            case 1: // oval
                CercleCreator cercleCreator=new CercleCreator(isFilled);
                return cercleCreator.createShape(start,start,paint,stroke);

            case 2: // line
                LineCreator lineCreator=new LineCreator();
                return lineCreator.createShape(start,start,paint,stroke);
            default:return null;
        }
    }
}
