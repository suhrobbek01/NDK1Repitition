package com.example.mytoaster

import android.content.Context
import android.widget.Toast

object ToasterMessage {
    fun show(context: Context, str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }
}