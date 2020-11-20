package SquaresIntoRectangles;
import java.util.ArrayList;
import java.util.List;
/**
 * <a href="https://docs.google.com/document/d/1rZ8aTKWlYvHZj7bamhiDcmLd7L6SNTNWVtvmXaW44_Q/edit?usp=sharing">problem</a>
 * @author keithgroves
 *
 */
public class SquaresIntoRectangles {

    List<Integer> list;
    public SquaresIntoRectangles() {
        list = new ArrayList<Integer>();

    }

  public List<Integer> sqInRect(int length, int width) {
        if (length == width) return null;
        int longestSide = length > width ? length: width;
        int shortestSide = length < width ? length: width;
        int count = longestSide / shortestSide; //this is the quantity of squares that can be cut out
        for (int i = 0; i < count ; i++) {
            list.add(shortestSide);
        }

        int remainder = longestSide % shortestSide; //if the remainder is not zero, we can carve up the rectangle more

        while(remainder != 0) return sqInRect(shortestSide, remainder); //recursive call

        return list;
  }
}