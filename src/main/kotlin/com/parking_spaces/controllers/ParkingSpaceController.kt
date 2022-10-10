package com.parking_spaces.controllers

import com.parking_spaces.dto.PostParkingSpaceRequest
import com.parking_spaces.extension.toParkingSpaceModel
import com.parking_spaces.services.ParkingSpaceService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/parking-space")
 class ParkingSpaceController (

    val parkingSpaceService: ParkingSpaceService

        ) {

     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)
     fun create (@RequestBody @Valid parkingSpaceRequest: PostParkingSpaceRequest){
         parkingSpaceService.create(parkingSpaceRequest.toParkingSpaceModel())


     }
}

