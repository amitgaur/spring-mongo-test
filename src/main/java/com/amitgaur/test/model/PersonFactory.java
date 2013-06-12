package com.amitgaur.test.model;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 6/11/13
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersonFactory {

    public  Person buildPerson(String firstName, String lastName, String addressLine1, String addressLine2, String city, String zip, String country){
        Person p = new Person();

        p.setFirstName(firstName);
        p.setLastName(lastName);
        Person.Address address   = new Person.Address();
        address.setAddressLine1(addressLine1);
        address.setAddressLine2(addressLine2);
        address.setCity(city);
        address.setZip(zip);
        address.setCountry(country);
        p.setAddress(address);



        return p;
    }
}
