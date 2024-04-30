/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMM.MUM.graficos;

import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Usuario
 */
public class MumRectangulo extends MumShape{
    Rectangle2D shape;
    
    public MumRectangulo(){
    super();
    shape = new Rectangle2D.Float();
    }

    @Override
    public void crearShape(Point2D p1, Point2D p2) {
        (shape).setFrameFromDiagonal(p1, p2);
    }

    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public void setLocation(Point2D pos) {
        double dx=pos.getX()-shape.getCenterX();
        double dy=pos.getY()-shape.getCenterY();
        
        shape.setFrame(shape.getX()+dx, shape.getY()+dy, shape.getWidth(), shape.getHeight());
    }

    @Override
    public boolean contains(Point2D p) {
        return shape.contains(p);
    }
    
}
