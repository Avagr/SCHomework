package hw.geoloc;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import java.io.IOException;

/**
 * Class for requesting geolocation data
 */
public class GeoClient {

    private final HttpTransport transport = new NetHttpTransport();
    private final JsonFactory jsonFactory = new GsonFactory();

    private final GeoUrl url; // Address to request geo data from

    public GeoClient(String address) {
        url = new GeoUrl(address);
    }

    /**
     * @return GeoResponse from a query
     * @throws IOException if unable to receive a response
     */
    public GeoResponse getResponse() throws IOException {
        HttpRequestFactory factory = transport.createRequestFactory(
            (HttpRequest request) -> request.setParser(new JsonObjectParser(jsonFactory)));
        var res = factory.buildGetRequest(url).execute();
        return res.parseAs(GeoResponse.class);
    }

}

/**
 * Class for wrapping url requests, useless for now but in the future, who knows?
 */
class GeoUrl extends GenericUrl {

    GeoUrl(String url) {
        super(url);
    }

    // Maybe add something later?
}
