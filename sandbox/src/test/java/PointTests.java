import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance01(){
        Point p1 = new Point(3,4);
        Point p2 = new Point(-3,-4);
        Assert.assertEquals(p1.distance(p2), 10);
    }
    
    @Test
    public void testDistance02(){
        Point p1 = new Point(0,3);
        Point p2 = new Point(0,-3);
        Assert.assertEquals(p1.distance(p2), 6);
    }

    @Test
    public void testDistance03(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);
        Assert.assertEquals(p1.distance(p2), 0);
    }

    @Test
    public void testDistance04(){
        Point p1 = new Point(Math.sqrt(2),Math.sqrt(2));
        Point p2 = new Point(-Math.sqrt(2),-Math.sqrt(2));
        Assert.assertEquals(p1.distance(p2), 4);
    }

}
