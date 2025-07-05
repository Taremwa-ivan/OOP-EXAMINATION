import java.util.Arrays;
import java.util.Random;

public class AQIAnalyzer {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random rand = new Random();

        // i) Generate 30 random AQI readings between 1 and 300
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = rand.nextInt(300) + 1; // 1 to 300
        }

        // Display the AQI readings
        System.out.println("AQI Readings for 30 Days:");
        System.out.println(Arrays.toString(aqiReadings));

        // ii) Compute and display the median AQI
        Arrays.sort(aqiReadings);
        int middle1 = aqiReadings[14];
        int middle2 = aqiReadings[15];
        double median = (middle1 + middle2) / 2.0;
        System.out.println("Median AQI: " + median);

        // iii) Count hazardous days (AQI > 200)
        int hazardousDays = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousDays++;
            }
        }

        System.out.println("Number of hazardous days (AQI > 200): " + hazardousDays);
    }
}
