package com.example.app.jsonobject_jslo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Not an enclosing class error - обошли вот так:
        Person.Address addressJSLO = new Person().new Address();
        addressJSLO.setAddress("адрес 1");
        addressJSLO.setCity("город 1");
        addressJSLO.setState("Страна 1");

        Person.PhoneNumber phoneNumber1 = new Person().new PhoneNumber();
        phoneNumber1.setNumber("111");
        phoneNumber1.setType("home");

        Person.PhoneNumber phoneNumber2 = new Person().new PhoneNumber();
        phoneNumber2.setNumber("222");
        phoneNumber2.setType("work");

        ArrayList <Person.PhoneNumber> phoneList =  new ArrayList<>();
        phoneList.add(phoneNumber1);
        phoneList.add(phoneNumber2);

        Person person = new Person("Alex", "JSLO", addressJSLO, phoneList);

        System.out.println(JsonUtil.toJSon(person));

        Gson fff = new Gson();

       Person personFromJson = fff.fromJson(JsonUtil.toJSon(person), Person.class);
        System.out.println(personFromJson.getName());

        try {
            JsonUtil.JOB.getJSONObject
                    ("name");
            System.out.println("JOB " + JsonUtil.JOB.getJSONObject("name"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
