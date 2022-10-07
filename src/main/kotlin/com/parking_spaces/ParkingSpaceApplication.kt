package com.parking_spaces

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParkingSpaceApplication

fun main(args: Array<String>) {
	runApplication<ParkingSpaceApplication>(*args)
}
