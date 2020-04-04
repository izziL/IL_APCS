import java.util.*;

public class CleanTempSensorData {
    public static void main(String[] args) {
        // Create an empty array to hold the temperature data.
        SensorData data = new SensorData();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        // Only enter the data if it is less than or equal to 15, because the largest correct value is 15.
        for (int i : data.getTempSensorData()) {
            if (i <= 15) {
                temp.add(i);
            }
        }
        System.out.println("The correct data is: " + temp);
    }
}