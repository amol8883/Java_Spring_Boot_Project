package com.it.repository;

import com.it.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Integer> {
    List<CloudVendor> findByVendorName(String vendorName);

}
