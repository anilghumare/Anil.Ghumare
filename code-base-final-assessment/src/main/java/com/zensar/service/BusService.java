package com.zensar.service;

import com.zensar.dto.BusDto;

public interface BusService {

	public BusDto createANewBus(BusDto busDto);

	public BusDto findBusesByRouteId(int routeId);

}
