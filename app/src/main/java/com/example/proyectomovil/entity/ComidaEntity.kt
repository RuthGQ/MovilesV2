package com.example.proyectomovil.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "tb_comida")
data class ComidaEntity (
    @ColumnInfo(name = "idComida") val id: Int = 0,
    @ColumnInfo(name = "idTipoComida") val idTipoComida: Int,
    @ColumnInfo(name = "nombre") val nombre: String?,
    @ColumnInfo(name = "decripcion") val descripcion: String?
        )