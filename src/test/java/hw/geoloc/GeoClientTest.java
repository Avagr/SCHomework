package hw.geoloc;

import com.google.api.client.http.HttpResponse;
import java.io.IOException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GeoClientTest {

    static GeoResponse response;
    static String rawResponse;

    @BeforeAll
    static void testResponse() {
        GeoClient client = new GeoClient("https://freegeoip.app/json/");
        try {
            response = client.getResponse();

        } catch (IOException ex) {
            System.err.println(
                "Something went wrong while trying to make a query: " + System.lineSeparator() + ex
                    .getMessage());
        }
    }

    @Test
    public void testLatitude() {
        System.out.println(rawResponse);
    }
}
