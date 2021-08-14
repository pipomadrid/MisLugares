package com.example.mislugares

enum class TipoLugar private  constructor(val texto:String, val recurso:Int){
    OTROS("Otros",5),
    RESTAURANTE("Restaurante",2),
    BAR("Bar",6),
    COPAS("Copas",0),
    ESPECTACULO("Espectáculo",0),
    HOTEL("Hotel",0),
    COMPRAS("COmpras",0),
    EDUCACION("Educacion",0),
    DEPORTE("Deporte",0),
    NATURALEZA("Naturaleza",0),
    GASOLINERA("Gasolinera",0)

}