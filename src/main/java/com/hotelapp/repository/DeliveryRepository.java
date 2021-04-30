package com.hotelapp.repository;


import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {


    // Derived Queries

    Delivery findByPartnerName(String partnerName);

//    getBy/
//
//    readBy

}
