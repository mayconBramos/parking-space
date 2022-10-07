package com.parking_spaces.models

import java.time.LocalDateTime
import javax.persistence.*

@Entity(name= "parking-space")
@Table(name = "TB_PARKING_SPACE") // QUALQUER ERRO OLHAR NO MINUTO 41 DO VIDEO SPRING BOOT
data class ParkingSpaceModel (


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int,

    @Column (nullable = false, unique = true, length = 10)
    var numeroVaga: String,

    @Column (nullable = false, unique = true, length = 7)
    var placaCarro:String,

    @Column(nullable = false, length = 70)
    var marcaCarro: String,

    @Column(nullable = false, length = 70)
    var modeloCarro: String,

    @Column(nullable = false, length = 70)
    var corCarro: String,

    @Column(nullable = false)
    var dataRegistro: LocalDateTime,


    @Column(nullable = false, length = 130)
    var nomeResponsavel:String,


    @Column(nullable = false, length = 30)
    var apartamento:String,

    @Column(nullable = false, length = 30)
    var bloco:String

)