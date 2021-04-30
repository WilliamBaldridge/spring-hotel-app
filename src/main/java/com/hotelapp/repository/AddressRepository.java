package com.hotelapp.repository;


import com.hotelapp.models.Address;
import com.hotelapp.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {



}
