package com.infoskillstechnology.hiltapp

import android.util.Log

class logger {
    companion object {
        @JvmStatic
        fun info(format: String) {
            Log.i("Demo", format)
        }
    }

}