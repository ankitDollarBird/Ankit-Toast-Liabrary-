package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class MyToast {

    public static void myToastShow( Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
