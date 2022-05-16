package com.zensar.coupunservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.coupunservice.entity.Coupon;
import com.zensar.coupunservice.service.CouponService;

@RestController
@Controller
public class CouponController {
	@Autowired
	CouponService service;
	@PostMapping("/coupon")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return service.createCoupon(coupon);
	}
	@GetMapping("/coupon")
	public List<Coupon> getCoupon(){
		return service.getCoupon();
	}
	@PutMapping("/coupon/{couponId}")
	public Coupon updateCoupon(@PathVariable int couponId,@RequestBody Coupon coupon) {
		return service.updateCoupon(coupon, couponId);
	}
	@DeleteMapping("/coupon")
	public String deleteCoupon() {
		service.deleteCoupon();
		return "Coupon Deleted";
	}

}
