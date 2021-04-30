package com.hotelapp;

import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}


	@Autowired
	HotelService hotelService;

	@Override
	public void run(String... args) throws Exception {

		Address address = new Address("123 Drive", "Orlando", 27648, "Florida");

		Menu menu1 = new Menu("Hilton", 50);
		Menu menu2 = new Menu("Steak", 40);
		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));

		Delivery del1 = new Delivery("Hard Rock", 245);
		Delivery del2 = new Delivery("Disney", 750);
		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(del1, del2));

		Hotel hotel = new Hotel("Hilton", address, menuList, deliveryList);
		hotelService.addHotel(hotel);
	}

}

