package com.example.app.jsonobject_jslo1;

import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Zver on 26.05.2019.
 */

public class JsonUtil {

    public static JSONObject JOB;

    public static String toJSon(Person person) {
        try {
            // Here we convert Java Object to JSON
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("name", person.getName()); // Set the first name/pair
            jsonObj.put("surname", person.getSurname());

            JSONObject jsonAddress = new JSONObject(); // we need another object to store the address
            jsonAddress.put("address", person.getAddress().getAddress());
            jsonAddress.put("city", person.getAddress().getCity());
            jsonAddress.put("state", person.getAddress().getState());

            // We add the object to the main object
            jsonObj.put("address", jsonAddress);

            // and finally we add the phone number
            // In this case we need a json array to hold the java list
            JSONArray jsonArr = new JSONArray();

            for (Person.PhoneNumber pn : person.getPhoneList()) {
                JSONObject pnObj = new JSONObject();
                pnObj.put("num", pn.getNumber());
                pnObj.put("type", pn.getType());
                jsonArr.put(pnObj);
            }

            jsonObj.put("phoneNumber", jsonArr);
            JOB = jsonObj;
            return jsonObj.toString();

        } catch (JSONException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}