/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.repository;


/**
 *
 * @author Admin
 */
public interface OrderDetailRepository {
    int amountProductByProductId(int id);
    long totalRevenue(int id);
    boolean waitOrder(int id);
    boolean cancelOrder(int id);
}
