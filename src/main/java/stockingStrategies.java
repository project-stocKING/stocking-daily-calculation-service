import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

public class stockingStrategies {
    public static void main(String... args) throws IOException {

        String url = "http://localhost:5001/calculateDailyStrategies";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setReadTimeout(15*1000);
        int responseCode = con.getResponseCode();
    }
}
