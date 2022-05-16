package com.zensar.coupunservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.coupunservice.entity.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer>{

}
