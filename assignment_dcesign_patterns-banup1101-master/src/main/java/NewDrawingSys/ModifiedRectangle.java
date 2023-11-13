package NewDrawingSys;

public class ModifiedRectangle implements Shape {
    //width and height are basically x2 and y2
    @Override
    public void drawShape(int x1, int y1, int x2, int y2) {
        //need to calculate width and height
        int width = (x2-x1);
        int height = (y2-y1);


        System.out.println("Rectangle Width: " + width + ", " + "Rectangle Height: " + height);
    }
}
