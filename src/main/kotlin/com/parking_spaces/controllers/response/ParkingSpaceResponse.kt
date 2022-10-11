package com.parking_spaces.controllers.response

import java.time.LocalDateTime

data class ParkingSpaceResponse (
    var id: Int? = null,

    var numeroVaga: String,

    var placaCarro:String,

    var marcaCarro: String,

    var modeloCarro: String,

    var corCarro: String,

    var dataRegistro: LocalDateTime? = null,

    var nomeResponsavel:String,

    var apartamento:String,

    var bloco:String
    )




