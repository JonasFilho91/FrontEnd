package resources.Outros;

import java.awt.*;

public class BoxSize extends Rectangle {
    private static int widthStandard = 200;
    private static int heightStandard = 30;
    private static Dimension SizeDimension = new Dimension(widthStandard,heightStandard);
    private static Rectangle SizeRectangle = new Rectangle(widthStandard,heightStandard);

    //Metodos
    public static int getWidthStandard() {
        return widthStandard;
    }

    public static int getHeightStandard() {
        return heightStandard;
    }

    public static Dimension getSizeDimension() {
        return SizeDimension;
    }

    public static Rectangle getSizeRectangle() {
        return SizeRectangle;
    }
}

