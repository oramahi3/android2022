package com.example.assinment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import android.widget.*

class FirstFragment:Fragment()
{
 override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
 {
     return inflater.inflate(R.layout.fragment_first,container,false)
 }

    override fun onCreate(savedInstanceState: Bundle?) {
     val x  : Int
     val y: Int
     //val button1: Button =
        super.onCreate(savedInstanceState)
    }
}
