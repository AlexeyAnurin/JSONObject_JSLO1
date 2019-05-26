package com.example.app.jsonobject_jslo1;

import java.util.ArrayList;


/**
 * Created by Zver on 26.05.2019.
 */

public class Person {

    private String name;
    private String surname;
    private Address address;
    private ArrayList<PhoneNumber> phoneList;

    Person(String name, String surname,Address address, ArrayList<PhoneNumber> phoneList){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneList = phoneList;
    }

    Person () {

    };

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }

    public ArrayList<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    // get and set

    public class Address {
        private String address;
        private String city;
        private String state;

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        //set
        public void setAddress(String address) {
            this.address = address;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }
        // get and set
    }

    public class PhoneNumber {
        private String type;
        private String number;

        public String getType() {
            return type;
        }

        public String getNumber() {
            return number;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        // get and set
    }
}