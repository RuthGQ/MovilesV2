package com.example.proyectomovil.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(tableName = "tb_detallePedido",
        foreignKeys = [
            ForeignKey(
                entity = ComidaEntity::class,
                parentColumns = ["idComida"],
                childColumns = []
            )
        ]
    )
class DetallePedidoEntity (
    @ColumnInfo(name = "idDetalle") val id: Int = 0,
    @ColumnInfo(name = "idComida") val idComida: Int,

        )