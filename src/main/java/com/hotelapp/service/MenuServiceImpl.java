package com.hotelapp.service;

import com.hotelapp.models.Menu;
import com.hotelapp.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public List<Menu> getMenusByHotel(String hotelName) {

//        return menuRepository.findByHotelHotelName(hotelName); // Direct query
        return menuRepository.findByHotel(hotelName);
    }
}
