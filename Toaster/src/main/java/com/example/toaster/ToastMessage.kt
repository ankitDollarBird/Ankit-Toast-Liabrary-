package com.example.toaster

import android.content.Context
import android.widget.Toast


public class ToastMessage {
     fun ankitPleaseShowTheToastMessage(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}