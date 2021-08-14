package com.example.mislugares

interface RepositorioLugares {

    fun elemento(id:Int): Lugar
    fun añade(lugar: Lugar)
    fun nuevo():Int
    fun borrar(id:Int)
    fun tamaño():Int
    fun actualiza(id:Int, lugar: Lugar)

    fun añadeEjemplos(){

        añade(Lugar("Escuela Politécnica Superior de Gandía ",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", Geopunto(0.166093,38.995656),
                TipoLugar.EDUCACION ," " ,962849300,
                "http://www.epsg.upv.es ",
                "Uno de los mejores lugares para formarse. ",
                System.currentTimeMillis() , valoracion = 3F))

        añade(Lugar("Al de Siempre' ",
            "Poligono Industrial junto a Molí Nou", Geopunto(-0.190642, 38.925857),
            TipoLugar.EDUCACION ," ''" ,636472405,
            "",
            "No te pierdas el arroz en calabaza ",
            System.currentTimeMillis() , valoracion = 3F))


    }

}