public class AreasOfRectangles {
    public static void main(String[] args) {
        // Make variables for conversion.
        long rectangleDimension;
        double cmToIn;
        double inToCm;
        double cmToYards;
        double mmToYards;
        // Calculate the area of the following rectangles.
        // Rectangle 1
        double rec1AreaInInches = 5.5 * 7.8;
        System.out.println("The area of the rectangle is " + rec1AreaInInches + " inches.");
        // Rectangle 2
        double rec2AreaInCentimeters = 99.4 * 500.352;
        System.out.println("The area of the rectangle is " + rec2AreaInCentimeters + " centimeters.");
        // Rectangle 3
        rectangleDimension = 75;
        inToCm = 2.54 * rectangleDimension;
        double rec3AreaInCentimeters = inToCm * 800;
        System.out.println("The area of the rectangle is " + rec3AreaInCentimeters + " centimeters.");
        // Rectangle 4
        rectangleDimension = 90_029_384;
        cmToIn = 0.393701 * rectangleDimension;
        double rec4AreaInInches = cmToIn * 500_029.75;
        System.out.println("The area of the rectangle is " + rec4AreaInInches + " inches.");
        // Rectangle 5
        rectangleDimension = 600_000;
        cmToYards = rectangleDimension * 0.0109361;
        rectangleDimension = 8_343_491_034L;
        mmToYards = rectangleDimension * 0.00109361;
        double rec5AreaInYards = cmToYards * mmToYards;
        System.out.println("The area of the rectangle is " + rec5AreaInYards + " yards.");
    }
}
