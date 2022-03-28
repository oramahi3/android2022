package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button1)
        val edtxt2 : EditText = findViewById(R.id.IDtxt)
        val edtxt3 : EditText = findViewById(R.id.Scoretxt)
        val resultTV: TextView = findViewById(R.id.Data)
        var flag : String = "ID"
        val spinnerVal: Spinner = findViewById(R.id.MySpinner)
        var Data = arrayOf("STU ID","Score")
        spinnerVal.adapter = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, Data)
        button.setOnClickListener {
            var x: Int = edtxt2.text.toString().toInt();
            var y: Int = edtxt3.text.toString().toInt();
            if (flag == "ID")
                resultTV.text = ID(x).toString();
            else
                resultTV.text = Score(y).toString();
        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            var x: Int = edtxt2.text.toString().toInt();
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (flag =="ID")
                    Data.get(p2)


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}
public fun ID(a: Int): Int
{
    return a
}
public fun Score(b: Int): Int
{
    return b
}