package com.example.pumpsquareview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.RectF
import android.graphics.Color

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#311B92",
    "#BF360C",
    "#00C853",
    "#FFC107"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 6.9f
val lSizeFactor : Float = 9.8f
val depthFactor : Float = 15.7f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")


