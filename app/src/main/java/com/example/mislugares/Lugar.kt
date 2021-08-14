package com.example.mislugares

data class Lugar(val nombre:String,
                 val direccion:String="",
                 val posicion: Geopunto = Geopunto.SIN_POSICION,
                 var tipoLugar:TipoLugar,
                 val foto:String = "",
                 var telefono:Int = 0,
                 var url: String = "",
                 var comentarios:String ="",
                 var fecha:Long =System.currentTimeMillis(),
                 var valoracion:Float = 3.5F
)