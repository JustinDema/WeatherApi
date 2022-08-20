import java.io.IOException;
import java.net.URISyntaxException;

public interface TimelineRequest {
    final String apiEndPoint="https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";
    final String location="Fier,Fier,Albania";
    final String startDate="2022-08-14";
    final String endDate="2022-08-20";

    final String unitGroup="metric";
    final String apiKey="ZBNUN6MVSDYDRYS4P5YDLZCQ2";

    void timelineRequestHttpClient() throws IOException, URISyntaxException;

    void parseTimelineJson(String rawResult);
}
