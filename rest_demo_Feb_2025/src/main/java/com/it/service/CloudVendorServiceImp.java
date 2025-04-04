package com.it.service;

import com.it.exception.CloudVendorNotFoundException;
import com.it.model.CloudVendor;
import com.it.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImp implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImp(CloudVendorRepository cloudVendorRepository) {
        // more business logic
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // more business logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // more business logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(int cloudVendorId) {
        // more business logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(int cloudVendorId) {
        // more business logic
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty()) // After change this line
            throw  new CloudVendorNotFoundException("Request Cloud Vendor does not exit"); // After change this line
       return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        // more business logic
        return cloudVendorRepository.findAll();
    }
}
