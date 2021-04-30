package com.hotelapp.repository;


import com.hotelapp.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {


    // Direct queries need to start with findBy/getBy/ReadBy
    // when properties are of primitive data types, just append property name to direct query
    // when properties are their own class (Address here), append class name first then appropriate property of that class property
    List<Hotel> findByAddressCity(String city);
    List<Hotel> findByAddressStreetName(String location);

    // JPQL (Java Persistence Query Language)
    // entity name (Hotel), not table name (hotel)
    @Query("FROM Hotel h JOIN h.menuList mn WHERE mn.menuName = ?1")
    List<Hotel> getHotelsByMenu(String menuName);

    @Query("FROM Hotel h JOIN h.delivery d WHERE d.partnerName = ?1")
    List<Hotel> getHotelsByDelivery(String partnerName);

    @Query("FROM Hotel h JOIN h.address a JOIN h.menuList mn WHERE a.streetName = ?1 AND mn.menuName = ?2")
    List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);

}
