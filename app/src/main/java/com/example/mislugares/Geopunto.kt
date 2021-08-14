package com.example.mislugares

class Geopunto(var longitud: Double, var latitud: Double) {

    companion object{
        val SIN_POSICION = Geopunto(0.0,0.0)
    }

    fun distancia(punto: Geopunto): Double{
        val RADIO_TIERRA = 6371000.0 //metros
        val dLat = Math.toRadians(latitud - punto.latitud)
        val dLong = Math.toRadians(longitud - punto.longitud)
        val lat1 = Math.toRadians((punto.latitud))
        val lat2 = Math.toRadians(latitud)
        val a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.sin(dLong /2) * Math.sin(dLong / 2) *
                Math.cos(lat1) * Math.cos(lat2)
        val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a))
        return c * RADIO_TIERRA

    }
}