package com.zensar.coupunservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.coupunservice.entity.Coupon;
@Service
public interface CouponService {
	
	public Coupon createCoupon(Coupon coupon);
	public List<Coupon> getCoupon();
	public Coupon updateCoupon(Coupon coupon,int couponId);
	public String deleteCoupon();
	

}
