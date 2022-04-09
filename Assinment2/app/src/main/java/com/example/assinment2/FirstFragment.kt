package com.example.assinment2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

@Suppress("UNREACHABLE_CODE")
class FirstFragment:Fragment()
{
 override fun onCreateView(
     inflater: LayoutInflater,
     container: ViewGroup?,
     savedInstanceState: Bundle?
 ): View? {
     val view2= inflater.inflate(R.layout.fragment_first,container,false)
     return view2
     val button1= view2.findViewById<Button>(R.id.btnok)
     val edtxt3= view2.findViewById<EditText>(R.id.txtno)
     val result2=view2.findViewById<TextView?>(R.id.textView3)

 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}
