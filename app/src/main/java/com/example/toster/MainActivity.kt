package com.example.toster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toaster.MyToast
import com.example.toaster.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
MyToast.myToastShow(this,"land")
    }
}