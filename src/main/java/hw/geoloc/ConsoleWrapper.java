package hw.geoloc;

import java.io.IOException;

public class ConsoleWrapper {

    public static void main(String[] args) throws IOException {
        GeoClient client = new GeoClient("https://freegeoip.app/json/");
        try {
            GeoResponse res = client.getResponse();
            System.out.println("Here is your locational data:");
            System.out.println("Country: " + res.getCountryName());
            System.out.println("Region: " + res.getRegionName());
            System.out.println("City: " + res.getCity());
            System.out.println("Latitude: " + res.getLatitude());
            System.out.println("Longitude: " + res.getLongitude());
        } catch (IOException ex) {
            System.err.println(
                "Something went wrong while trying to make a query: " + System.lineSeparator() + ex
                    .getMessage());
        }
    }
}
