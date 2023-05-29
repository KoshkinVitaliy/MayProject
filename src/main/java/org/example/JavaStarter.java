package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaStarter {
    public JavaStarter() {

    }

    public List<Map<String,Object>> execute(String request) throws Exception {
        switch (request.substring(0, 6)) {
            case "INSERT" -> insertValues(request);
            case "UPDATE" -> updateValues(request);
            case "DELETE" -> deleteValues(request);
            case "SELECT" -> selectValues(request);
            default -> System.out.println("Incorrect request");
        }

        return new ArrayList<>();
    }

    private void insertValues(String request) {
        //"INSERT VALUES ‘lastName’ = ‘Федоров’ ,‘id’=3, ‘age’=40,‘active’=true
        Map<String, Object> row = new HashMap<>();


        request = updateRequest(request);
        String[] requestArray = request.split(",");

        for (String letter: requestArray) {
            String key = letter.substring(0, letter.indexOf("="));
            String value = letter.substring(letter.indexOf("=")+1);


            row.put(key, value);

            System.out.println(row);
        }


    }

    private void updateValues(String request) {
        System.out.println("UPDATE");
    }

    private void deleteValues(String request) {
        System.out.println("DELETE");
    }

    private void selectValues(String request) {
        System.out.println("SELECT");
    }

    private String updateRequest(String request) {
        String updatedRequest = request.replaceAll(
                " ",
                "");
        updatedRequest = updatedRequest.replace(
                "INSERTVALUES",
                "");
        updatedRequest = updatedRequest.replaceAll(
                "‘",
                "");
        updatedRequest = updatedRequest.replaceAll(
                "’",
                "");

        return updatedRequest;
    }
}
