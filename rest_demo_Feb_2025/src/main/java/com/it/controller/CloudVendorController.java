package com.it.controller;

import com.it.model.CloudVendor;
import com.it.response.ResponseHandler;
import com.it.service.CloudVendorService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

  CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
   /*    //Read Specific cloud vendor
    @GetMapping("{vendor_id}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendor_id") int vendor_id){
     return cloudVendorService.getCloudVendor(vendor_id);
    }
   */
    // same but apply here Custom Exception concept
   @GetMapping("{vendor_id}")
   public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendor_id") int vendor_id){

     return ResponseHandler.responseBuilder("Request Vendor details are given here", HttpStatus.OK,
               cloudVendorService.getCloudVendor(vendor_id));

   }


    //Read All cloud vendor
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendor();
    }


  @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        return cloudVendorService.createCloudVendor(cloudVendor);
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }


  @DeleteMapping("{vendor_id}")
    public String deleteCloudVendorDetails(@PathVariable("vendor_id") int vendor_id){
     cloudVendorService.deleteCloudVendor(vendor_id);
     return "Cloud Vendor Delete Successfully";
  }



}
