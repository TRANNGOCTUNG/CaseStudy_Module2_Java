package model.person;

import java.io.Serializable;

public class Address implements Serializable {
    private Address address;
    private String addressName;
    private int addressAge;
    public Address() {
    }

    public Address(Address address, String addressName, int addressAge) {
        this.address = address;
        this.addressName = addressName;
        this.addressAge = addressAge;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public int getAddressAge() {
        return addressAge;
    }

    public void setAddressAge(int addressAge) {
        this.addressAge = addressAge;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address=" + address +
                ", addressName='" + addressName + '\'' +
                ", addressAge=" + addressAge +
                '}';
    }
}
