package com.hotelapp;

import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.MenuService;
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
	@Autowired
	DeliveryService deliveryService;
	@Autowired
	MenuService menuService;

	@Override
	public void run(String... args) throws Exception {

//		Address address = new Address("22222 9th St", "Austin", 27648, "Texas");
//
//		Menu menu1 = new Menu("Pizza", 25);
//		Menu menu2 = new Menu("Alfredo", 15);
//		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
//
//		Delivery del1 = deliveryService.getDeliveryByPartner("Uber");
//		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(del1));
//
//		Hotel hotel = new Hotel("Hyatt", address, menuList, deliveryList);
//		hotelService.addHotel(hotel);

//		Hotel hotel = hotelService.getHotelById(102);
//		System.out.println(hotel);
//
//		hotel.getAddress().setCity("Miami");
//		hotelService.updateHotel(hotel);
//
//		hotel = hotelService.getHotelById(102);
//		System.out.println(hotel);

//		hotelService.getHotelsByCity("Orlando")
//				.stream()
//				.forEach((h) -> System.out.println(h.getHotelName() + h.getAddress().getCity()));
//		System.out.println();
//		hotelService.getHotelsByLocation("Austin")
//				.stream()
//				.forEach((h) -> System.out.println(h.getHotelName() + h.getMenuList()));


//		hotelService.getHotelsByMenu("Lobster")
//				.forEach((h) -> System.out.println(h.getHotelName() + " " + h.getAddress().getStreetName()));
//		System.out.println();
//		hotelService.getHotelsByDelivery("DoorDash")
//				.forEach((h) -> System.out.println(h.getHotelName() + " " + h.getAddress().getStreetName()));

//		hotelService.getHotelsByLocationAndMenu("555 6th St", "Pizza")
//				.forEach((h) -> System.out.println(h.getHotelName() + " " + h.getAddress().getCity()));


		menuService.getMenusByHotel("Hilton")
				.forEach((m) -> System.out.println(m.getMenuName() + " " + m.getPrice()));



	}

}

