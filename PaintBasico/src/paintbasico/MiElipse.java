/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbasico;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 *
 * @author Usuario
 */
public class MiElipse extends Ellipse2D.Float {
    public MiElipse(){
    }
    public void setLocation(Point2D pos){
        double dx=pos.getX()-this.getCenterX();
        double dy=pos.getY()-this.getCenterY();
        
        this.setFrame(this.getX()+dx, this.getY()+dy, this.getWidth(), this.getHeight());
    }
}
