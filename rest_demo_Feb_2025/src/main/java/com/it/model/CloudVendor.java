package com.it.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="cloud_vendor_info")
public class CloudVendor {

    @Id
    private int vendor_id;
    private String vendor_name;
    private String vendor_address;
    private String vendor_phoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(int vendor_id, String vendor_name, String vendor_address, String vendor_phoneNumber) {
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.vendor_address = vendor_address;
        this.vendor_phoneNumber = vendor_phoneNumber;
    }

    public int getVendor_id() {

        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }

    public String getVendor_address() {
        return vendor_address;
    }

    public void setVendor_address(String vendor_address) {
        this.vendor_address = vendor_address;
    }

    public String getVendor_phoneNumber() {
        return vendor_phoneNumber;
    }

    public void setVendor_phoneNumber(String vendor_phoneNumber) {
        this.vendor_phoneNumber = vendor_phoneNumber;
    }
}
