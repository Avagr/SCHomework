package hw.geoloc;

import com.google.api.client.util.Key;

public class GeoResponse {

    @Key("country_name")
    private String countryName;

    @Key("region_name")
    private String regionName;

    @Key("city")
    private String city;

    @Key("latitude")
    private double latitude;

    @Key("longitude")
    private double longitude;

    public String getCountryName() {
        return countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCity() {
        return city;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
