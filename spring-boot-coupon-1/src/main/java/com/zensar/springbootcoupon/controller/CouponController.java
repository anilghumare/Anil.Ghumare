package com.zensar.springbootcoupon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springbootcoupon.dto.CouponDto;
import com.zensar.springbootcoupon.entity.Coupon;
import com.zensar.springbootcoupon.exceptionHandling.CouponNotFoundException;
import com.zensar.springbootcoupon.service.CouponService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
/*
 * @RequestMapping(value = "/coupon-api", produces = {
 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes
 * = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
 */
@RequestMapping(value = "/coupon-api")
public class CouponController {

	@Autowired
	private CouponService couponService;

	@ExceptionHandler(value = CouponNotFoundException.class)
	public ResponseEntity<Object> exception(CouponNotFoundException exception) {
		return new ResponseEntity<>("Coupon not found", HttpStatus.NOT_FOUND);
	}

	// @RequestMapping("/coupons/{couponId}")
	@GetMapping(value = "/coupons/{couponId}")
	@Operation
	public ResponseEntity<CouponDto> getCoupon(@PathVariable("couponId") int couponId) {
		return new ResponseEntity<CouponDto>(couponService.getCoupon(couponId), HttpStatus.OK);

	}

	// http://localhost:4321/coupon-api/coupons?pageNumber=0&pageSize=5&sortBy=couponCode&dir=DESC
	// @RequestMapping("/coupons")
	@GetMapping(value = { "/coupons", "/listOfCoupons" })
	@Operation
	public ResponseEntity<List<CouponDto>> getAllCoupons(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize,
			@RequestParam(value = "sortBy", required = false, defaultValue = "couponId") String sortBy,
			@RequestParam(value = "dir", required = false, defaultValue = "ASC") Direction dir) {
		return new ResponseEntity<List<CouponDto>>(couponService.getAllCoupons(pageNumber, pageSize, sortBy, dir),
				HttpStatus.OK);

	}

	// @RequestMapping(value="/coupons", method=RequestMethod.POST)
	@PostMapping(value = "/coupons")
	@Operation
	public ResponseEntity<CouponDto> insertCoupon(@RequestBody CouponDto couponDto) {
		return new ResponseEntity<CouponDto>(couponService.insertCoupon(couponDto), HttpStatus.CREATED);

	}

	// @RequestMapping(value="/coupons/{couponId}", method=RequestMethod.DELETE)
	@DeleteMapping("/coupons/{couponId}")
	@Operation
	public ResponseEntity<String> deleteCoupon(@PathVariable("couponId") int couponId) {
		couponService.deleteCoupon(couponId);
		return new ResponseEntity<String>("Coupon Deleted Successfully", HttpStatus.OK);

	}

	// @RequestMapping(value="/coupons/{couponId}", method=RequestMethod.PUT)
	@PutMapping(value = "/coupons/{couponId}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	@Operation
	public ResponseEntity<String> updateCoupon(@PathVariable("couponId") int couponId,
			@RequestBody CouponDto couponDto) {
		couponService.updateCoupon(couponId, couponDto);
		return new ResponseEntity<String>("Coupon Updated Successfully", HttpStatus.OK);

	}

	@GetMapping("/coupons/couponcode/{couponCode}")
	@Operation
	public ResponseEntity<List<CouponDto>> getByCouponCode(@PathVariable("couponCode") String couponCode) {

		return new ResponseEntity<List<CouponDto>>(couponService.getByCouponCode(couponCode), HttpStatus.OK);
	}

	@GetMapping("/coupons/{couponCode}/{couponExpDate}")
	@Operation
	public ResponseEntity<List<CouponDto>> getByCouponCodeAndCouponExpDate(@PathVariable String couponCode,
			@PathVariable String couponExpDate) {
		return new ResponseEntity<List<CouponDto>>(
				couponService.getByCouponCodeAndCouponExpDate(couponCode, couponExpDate), HttpStatus.OK);
	}

}
