/**
 * JobTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package dev.deutschlandapi.sdk;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TagAbstract;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobTag extends TagAbstract {
    public JobTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * Returns all available jobs
     */
    public JobCollection getAll(Integer page, String search, String location, String employer) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("page", page);
            queryParams.put("search", search);
            queryParams.put("location", location);
            queryParams.put("employer", employer);

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/job", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, new TypeReference<JobCollection>(){});
            }

            switch (resp.code) {
                case 400:
                    throw new ResponseException(this.parser.parse(resp.payload, new TypeReference<Response>(){}));
                case 404:
                    throw new ResponseException(this.parser.parse(resp.payload, new TypeReference<Response>(){}));
                case 500:
                    throw new ResponseException(this.parser.parse(resp.payload, new TypeReference<Response>(){}));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }


}
