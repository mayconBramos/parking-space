package com.parking_spaces.controllers

import com.parking_spaces.services.ParkingSpaceService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/parking-space")
 class ParkingSpotController (

    val parkingSpaceService: ParkingSpaceService

        ) {
}