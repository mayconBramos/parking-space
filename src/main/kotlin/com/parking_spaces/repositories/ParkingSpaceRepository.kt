package com.parking_spaces.repositories

import com.parking_spaces.models.ParkingSpaceModel
import org.springframework.data.jpa.repository.JpaRepository

interface ParkingSpaceRepository: JpaRepository<ParkingSpaceModel,Int> {



}