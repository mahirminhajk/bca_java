// Write an applette to display a rectangle with specify co-ordinate and color passed as parameter from the html file.

import java.awt.*;
import java.applet.*;

public class RectangleApplet extends Applet {

    int x, y, width, height;
    Color color;

    public void init() {
        // Get parameters from HTML
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        width = Integer.parseInt(getParameter("width"));
        height = Integer.parseInt(getParameter("height"));
        color = Color.decode(getParameter("color"));
    }

    public void paint(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}