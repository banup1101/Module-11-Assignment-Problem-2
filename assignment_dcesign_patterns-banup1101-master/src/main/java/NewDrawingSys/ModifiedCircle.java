package NewDrawingSys;

public class ModifiedCircle implements Shape { //in shape, we have a x2 and y2. A circle has a x1, y1, and radius. So gotta just calculate radius with the extra stuff
    @Override
    public void drawShape(int x1, int y1, int x2, int y2) { //there is no more r because radius needs to be calculated due to drawShape parameters
        //using distance formula because Shape has a x2 x1 and y2 y1 and then dividing that by 2 for radius
        double radius = (Math.sqrt(Math.pow(x2-x1 ,2) + Math.pow(y2-y1,2)))/2;
        System.out.println("Circle from center (" + x1 + ";" + y1 + "), with radius(" + radius + ")");
    }
}
