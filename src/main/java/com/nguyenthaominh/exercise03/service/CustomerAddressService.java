package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.CustomerAddress;

public interface CustomerAddressService {
    CustomerAddress createCustomerAddress(CustomerAddress customerAddress);
    CustomerAddress getCustomerAddressById(String customerAddressId);
    List<CustomerAddress> getAllCustomerAddresses();
    CustomerAddress updateCustomerAddress(CustomerAddress customerAddress);
    void deleteCustomerAddress(String customerAddressId);
}