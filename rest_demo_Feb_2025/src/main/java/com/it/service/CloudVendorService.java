package com.it.service;

import com.it.model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(int cloudVendorId);
    public CloudVendor getCloudVendor(int cloudVendorId);
    public List<CloudVendor> getAllCloudVendor();

}
