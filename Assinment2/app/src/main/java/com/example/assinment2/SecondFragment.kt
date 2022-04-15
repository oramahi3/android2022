package com.example.assinment2
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

@Suppress("UNREACHABLE_CODE")
class SecondFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val spinner = view.findViewById<Spinner>(R.id.spinner)
        val items: Array<String> = arrayOf("sum", "multi")
        spinner.adapter = ArrayAdapter(
            requireActivity().applicationContext,
            android.R.layout.simple_spinner_item,
            items
        )
        return view

        /*spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


}*/
        val edtxt1 = view.findViewById<EditText>(R.id.txtno1)
        val edtxt2 = view.findViewById<EditText>(R.id.txtno2)
        val button = view.findViewById<Button>(R.id.btncal)
        var flag: String = "sum"
        val result = view.findViewById<TextView>(R.id.textView)

        button.setOnClickListener()
        {

            val x: Int = edtxt1.text.toString().toInt()
            val y: Int = edtxt2.text.toString().toInt()
            if (flag == "sum")
                result.text = sum(x, y).toString()
            else
                result.text = multi(x, y).toString()

        }

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = items.get(p2)

                fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }



//        fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//        }

    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun multi(a: Int, b: Int): Int {
        return a * b
    }
}
