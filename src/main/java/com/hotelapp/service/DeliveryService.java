package com.hotelapp.service;

import com.hotelapp.models.Delivery;

public interface DeliveryService {

    void updateDelivery(Delivery delivery);

    Delivery getDeliveryById(int deliveryId);

    void deleteDelivery(int deliveryId);

    Delivery getDeliveryByPartner(String partnerName);


}
