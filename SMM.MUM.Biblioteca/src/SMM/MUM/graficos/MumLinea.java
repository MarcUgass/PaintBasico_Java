/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMM.MUM.graficos;

import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Usuario
 */
public class MumLinea extends MumShape{
    Line2D shape;
    
    public MumLinea(){
    super();
    shape = new Line2D.Float();
    }
    public boolean isNear(Point2D p){
    if(shape.getP1().equals(shape.getP2())) return shape.getP1().distance(p)<=2.0; //p1=p2
        return shape.ptLineDist(p)<=2.0; // p1!=p2
    }
    @Override
    public boolean contains(Point2D p) {
        return isNear(p);
    }

    @Override
    public void crearShape(Point2D p1, Point2D p2) {
        (shape).setLine(p1, p2);
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public void setLocation(Point2D pos) {
        double dx=pos.getX()-shape.getX1();
        double dy=pos.getY()-shape.getY1();
        Point2D newp2 = new Point2D.Double(shape.getX2()+dx,shape.getY2()+dy);
        shape.setLine(pos,newp2);
    }
}
