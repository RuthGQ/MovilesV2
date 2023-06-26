package com.example.proyectomovil.entity

import androidx.room.ColumnInfo

class PedidoEntity (
    @ColumnInfo(name = "idTipoCelbracion") val idTipoCelebracion: Int,
    @ColumnInfo(name = "idOrigen") val idOrigen: Int
        )