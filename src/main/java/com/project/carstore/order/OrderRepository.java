package com.project.carstore.order;

import com.project.carstore.payment.PaymentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;
@Repository

public interface OrderRepository extends JpaRepository<Order,Integer> {

 List<Order> findByOrderStatus(String status);
 List<Order> findByOrderDateBetween(LocalDate startDate,LocalDate endDate);

}
