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
        val iD1 : EditText = findViewById(R.id.ID)
        val score1 : EditText = findViewById(R.id.Scoretxt)
        val resultTV: TextView = findViewById(R.id.Result)
        val sspinner: Spinner = findViewById(R.id.MySpinner)
        var flag = "iD"
        val data = arrayOf("iD","score")
        sspinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , data)
        button.setOnClickListener()
        {
            val x: Int = iD1.text.toString().toInt()
            val y: Int = score1.text.toString().toInt()
            if (flag == "iD")
                resultTV.text = x.toString()
            else
                resultTV.text = y.toString()
        }
        sspinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                flag = data[p2]


            }



            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}
/*fun iD(a: Int): Int // this two functions i wrote them to try the spinner with also they didnt work
{
    return a
}
fun score(b: Int): Int
{
    return b
}
 */