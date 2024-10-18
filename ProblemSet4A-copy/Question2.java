public class Question2 {
    public static void main (String[] args) {
        StdDraw.setScale(0, 500);
        
        int x = 0;
        int x2 = 0;
        int y = 0;
        int y2 = 500;
        
        /*  while(x<500){
             StdDraw.line(x, 0, x, 500);
             x = x+10;
             
        }
        while(y<500){
             StdDraw.line(0, y, 500, y);
             y = y+10;
             
        }
        */
       
        while(x<500){
            StdDraw.line(x, y, x2, y2);
             x = x+10;
             y = y-10;
        
        }
        while(y<500){
            StdDraw.line(0, y, 500, y2);
             y = y-10;
        
        }
    }
}

