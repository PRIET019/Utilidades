package es.fpsumma.dam2.utilidades.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "Clase")
data class Clase(

    @ColumnInfo(name = "asignatura")
    val asignatura: String,

    @ColumnInfo(name = "trimestre")
    val trimestre: String,

    @ColumnInfo(name = "nota")
    val nota: Double,

)

