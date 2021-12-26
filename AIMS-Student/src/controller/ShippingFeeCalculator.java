package controller;

import entity.order.Order;

/**
 * Shipping interface - NguyenVanDuong- 20173069
 */
public interface ShippingFeeCalculator{
   int calculateShippingFee(Order order);
}