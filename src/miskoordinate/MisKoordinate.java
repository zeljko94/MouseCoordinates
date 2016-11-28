
package miskoordinate;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class MisKoordinate {

    public static void main(String[] args) {
        
        while(true)
        {
            Point point = MouseInfo.getPointerInfo().getLocation();
            if(point.x != MouseInfo.getPointerInfo().getLocation().x || point.y != MouseInfo.getPointerInfo().getLocation().y)
            {
                Point p = MouseInfo.getPointerInfo().getLocation();
                System.out.println("X = " + p.x);
                System.out.println("Y = " + p.y);
                System.out.println("*****************************");
            }
        }
        
    }

}
