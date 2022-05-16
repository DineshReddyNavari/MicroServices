package com.zensar.coupunservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.coupunservice.Repository.CouponRepository;
import com.zensar.coupunservice.entity.Coupon;

@Service(value = "CouponService.java")
public class CouponServiceImpl implements CouponService{

	@Autowired
	CouponRepository repository;
	@Override
	public Coupon createCoupon(Coupon coupon) {
		
		return repository.save(coupon);
	}

	@Override
	public List<Coupon> getCoupon() {
		
		 return repository.findAll();
	}

	@Override
	public Coupon updateCoupon(Coupon coupon, int couponId) {
		Coupon coupon1 = new Coupon();
		coupon1.setCouponId(coupon.getCouponId());
		coupon1.setCouponCode(coupon.getCouponCode());
		coupon1.setDiscount(coupon.getDiscount());
		coupon1.setExpDate(coupon.getExpDate());
		return repository.save(coupon1);
	}

	@Override
	public String deleteCoupon() {
		repository.deleteAll();
		return "Coupons Deleted";
	}

}
