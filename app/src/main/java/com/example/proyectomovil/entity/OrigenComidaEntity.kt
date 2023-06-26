package com.example.proyectomovil.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "tb_OrigenComida")
data class OrigenComidaEntity (
    @ColumnInfo(name = "idOrigen") val id: Int=0,
    @ColumnInfo(name = "descripcion") val descripcion: String?
        )