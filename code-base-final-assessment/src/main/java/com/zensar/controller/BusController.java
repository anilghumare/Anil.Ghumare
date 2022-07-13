package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.BusDto;
import com.zensar.service.BusService;

@RestController
public class BusController {

	@Autowired
	private BusService busService;

	@PostMapping("/Buses")
	public ResponseEntity<BusDto> createANewBus(@RequestBody BusDto busEntity) {
		return new ResponseEntity<BusDto>(busService.createANewBus(busEntity), HttpStatus.CREATED);

	}

	@GetMapping("/Buses/{routeId}")
	public ResponseEntity<BusDto> findBusesByRouteId(@PathVariable("routeId") int routeId) {
		return new ResponseEntity<BusDto>(busService.findBusesByRouteId(routeId), HttpStatus.OK);

	}

}
