/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMM.MUM.graficos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;
/**
 *
 * @author Usuario
 */
public abstract class MumShape {
    //Atributos como relacionarlos con el Lienzo
    private Color color = Color.black;
    private boolean relleno=false;
    
    public MumShape(){}
    public abstract void crearShape(Point2D p1, Point2D p2);
    public abstract Shape getShape();
    public abstract void setLocation(Point2D pos);
    public abstract boolean contains(Point2D p);
    public void draw(Graphics2D g2d){
        //hay que poner el fill, draw, stroke, color...
        g2d.setPaint(color);
        g2d.draw(getShape()); 
    }
//otro metodo que sea getShape, public abstar
    //public 
}
