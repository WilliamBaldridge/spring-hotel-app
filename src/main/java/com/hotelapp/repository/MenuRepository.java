package com.hotelapp.repository;


import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

    //Derived Queries
//    List<Menu> findByHotelHotelName(String hotelName);

    // @Query w/ JPQL
//    @Query("FROM Menu m JOIN m.hotel h WHERE h.hotelName = ?1")
//    List<Menu> findByHotel(String hotelName);

    // @Query w/ SQL native query
    @Query(value = "SELECT * FROM menu m JOIN hotel h ON m.hotel_id = h.hotel_id WHERE h.hotel_name = ?1", nativeQuery = true)
    List<Menu> findByHotel(String hotelName);
}
