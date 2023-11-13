/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

/**
 *
 * @author Brandon Anup
 */
public class ModifiedSystem {
    public static void main(String[] args) {
        //the difference is OriginalSys uses Object[]. In modified system there is Shape[] but there is no shape class yet
        Shape[] shapes = {new ModifiedCircle(), new ModifiedRectangle()}; //add your code here;
        //shapes have a x1 and y1
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60; //this is different from OriginalSys. There was no x2 and x1. This would make things easier when working with different shapes

        for (Shape shape : shapes) {
            shape.drawShape(x1, y1, x2, y2); //all we need is a x1, y1, x2, and y2 for these Shapes. There is no need for Circle to just have radius
        }
    }
}
