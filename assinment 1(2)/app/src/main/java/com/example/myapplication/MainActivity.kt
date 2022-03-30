package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

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
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context : this,R.array.data , android.R.layout.simple_spinner_item)
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
/*fun iD(a: Int): Int
{
    return a
}
fun score(b: Int): Int
{
    return b
}
 */