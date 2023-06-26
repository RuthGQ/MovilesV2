package com.example.proyectomovil.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import java.io.Serializable

@Entity(tableName = "tb_tipoCelebracion")
data class TipoCelebracionEntity (
    @ColumnInfo(name = "idTipoCelebracion") val id: Int=0,
    @ColumnInfo(name = "descripcion") val descripcion: String?
        )