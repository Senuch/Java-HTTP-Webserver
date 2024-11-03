import java.util.HashMap;
import java.util.Map;

public class Request {
    private final Protocol protocol;
    private final RequestMethod requestMethod;
    private final Map<String, String> headers;
    private final Map<String, String> bodyParams;

    public Request(Protocol protocol, RequestMethod requestMethod) {
        headers = new HashMap<>();
        bodyParams = new HashMap<>();

        this.protocol = protocol;
        this.requestMethod = requestMethod;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value + "\r\n");
    }
}