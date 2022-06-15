package com.zensar.springbootcoupon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springbootcoupon.entity.Coupon;
import com.zensar.springbootcoupon.service.CouponService;

@RestController
@RequestMapping(value = "/coupon-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class CouponController {

	@Autowired
	private CouponService couponService;

	// @RequestMapping("/coupons/{couponId}")
	@GetMapping(value = "/coupons/{couponId}")
	public Coupon getCoupon(@PathVariable("couponId") int couponId) {
		return couponService.getCoupon(couponId);

	}

	// @RequestMapping("/coupons")
	@GetMapping("/coupons")
	public List<Coupon> getAllCoupons() {
		return couponService.getAllCoupons();

	}

	// @RequestMapping(value="/coupons", method=RequestMethod.POST)
	@PostMapping(value = "/coupons")
	public void insertCoupon(@RequestBody Coupon coupon) {
		couponService.insertCoupon(coupon);

	}

	// @RequestMapping(value="/coupons/{couponId}", method=RequestMethod.DELETE)
	@DeleteMapping("/coupons/{couponId}")
	public void deleteCoupon(@PathVariable("couponId") int couponId) {
		couponService.deleteCoupon(couponId);

	}

	// @RequestMapping(value="/coupons/{couponId}", method=RequestMethod.PUT)
	@PutMapping(value = "/coupons/{couponId}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public void updateCoupon(@PathVariable("couponId") int couponId, @RequestBody Coupon coupon) {
		couponService.updateCoupon(couponId, coupon);

	}

}
