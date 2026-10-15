/*
    london-transit-reader - cli program that gets tfl line status
    Copyright (C) 2026  georgekt757

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

package api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TflApi {
    private StringBuilder arguments;
    private String jsonResponse;

    public TflApi() {
        this.arguments = new StringBuilder(20);
    }

    public void allLines() throws IOException, InterruptedException, URISyntaxException {
        // Passes every possible id to the TfL API. The max is 20, and 20 are here. If they add
        // more in the future, it may be worth sending two or more separate GET requests
        this.arguments.append("bakerloo,central,circle,district,hammersmith-city,jubilee,metropolitan,northern,piccadilly,victoria,waterloo-city,liberty,lioness,mildmay,suffragette,weaver,windrush,dlr,elizabeth,tram");
        this.getRequest(arguments);
    }

    public void selectLines(String[] lines) throws IOException, InterruptedException, URISyntaxException {
        for (String s : lines) {
            // Concatenate the strings from the array args (called lines here) and put that in the GET method
            this.arguments.append(s).append(",");
        }
        this.getRequest(arguments);
    }

    private void getRequest(StringBuilder lines) throws IOException, InterruptedException, URISyntaxException {
        // Code sets up for HTTP GET request, and then makes it. The respons is in JSON, which needs to be parsed correctly
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI("https://api.tfl.gov.uk/Line/"+lines+"/Status")).GET().build();
        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        
        // Converts response into a String, which can be parsed as JSON
        jsonResponse = getResponse.body();
        this.parseJson(jsonResponse);
    }

    private void parseJson(String jsonResponse) {
        Gson gson = new Gson();
        /*
          Type interface, TypeToken, and an anonymous class all needed here as the JSON data
          is actually an array of JSON, so extra steps needs to be taken. Lines.class alone,
          as was originally planned, wouldn't be good enough. Gson's TypeToken can capture the
          full generic type information (List<Line>) to allow fromJson to be able to deserialise
          the JSON array given by TfL into a List of Line objects. As for the anonymous class,
          it is what lets Gson's TypeToken capture the generic type information.
        */
        Type lineListType = new TypeToken<List<Line>>() {}.getType();
        List<Line> lines = gson.fromJson(jsonResponse, lineListType);

        for (Line line : lines) {
            for (LineStatus status : line.getLineStatuses()) {
                if (status.getStatusSeverity() == 10) {
                    System.out.println(line.getName() + " - " + status.getStatusSeverityDescription());
                } else {
                    System.out.println(status.getReason());
                }
            }
        }
    }
}
