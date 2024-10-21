
/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Question3{
    public static void main(String[] args){
        StdDraw.setScale(0, 1);

        OrderedPair V1 = new OrderedPair (0, 1);
        OrderedPair V2 = new OrderedPair (1, 1);
        OrderedPair V3 = new OrderedPair (0.5, Math.sqrt(3) / 6);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(V1.getX(), V1.getY());
        StdDraw.point(V2.getX(), V2.getY());
        StdDraw.point(V3.getX(), V3.getY());

        StdDraw.line(0, 1, 1, 1);
        StdDraw.line(1, 1, 0.5, Math.sqrt(3)/6);
        StdDraw.line(0.5, Math.sqrt(3)/6, 0, 1);

        double currx = Math.random();
        double curry = Math.random()* Math.sqrt(3)/6;
        int count = 0;

        

        while(count>-1){

            int choice = (int)(Math.random()*3)+1;
            OrderedPair V = null;
            if (choice==1){
                V = V1;
            }else if (choice==2){
                V = V2;
            }else if (choice==3){
                V = V3;
            }

            currx = (currx + V.getX())/2;
            curry = (curry + V.getY())/2;

            StdDraw.point(currx, curry);

        }
    }
}