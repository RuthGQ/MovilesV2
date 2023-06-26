package com.example.proyectomovil.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "tb_tipoComida")
data class TipoComidaEntity (
    @ColumnInfo(name = "idTipoComida") val id: Int = 0,
    @ColumnInfo(name = "descripcion") val descripcion: String?
        )