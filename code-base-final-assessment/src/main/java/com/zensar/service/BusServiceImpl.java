package com.zensar.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.BusDto;
import com.zensar.entity.BusEntity;
import com.zensar.repository.BusRpeo;

@Service
public class BusServiceImpl implements BusService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BusRpeo busRepo;

	@Override
	public BusDto createANewBus(BusDto busDto) {

		BusEntity busEntity = modelMapper.map(busDto, BusEntity.class);

		BusEntity insertedBus = busRepo.save(busEntity);

		return modelMapper.map(insertedBus, BusDto.class);

	}

	@Override
	public BusDto findBusesByRouteId(int routeId) {

		BusEntity busEntity = busRepo.findById(routeId).get();

		return modelMapper.map(busEntity, BusDto.class);
	}

}
