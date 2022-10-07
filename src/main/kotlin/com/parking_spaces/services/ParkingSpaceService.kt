package com.parking_spaces.services

import com.parking_spaces.repositories.ParkingSpaceRepository
import org.springframework.stereotype.Service


@Service
class ParkingSpaceService (
   private  val parkingSpaceRepository: ParkingSpaceRepository

        ){
}

