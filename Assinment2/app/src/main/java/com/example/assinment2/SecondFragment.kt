package com.example.assinment2
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SecondFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
      var flag : String= "sum"
        super.onCreate(savedInstanceState)
    }


}
 fun sum(a:Int, b:Int): Int {
    return a+b;
}
fun multi(a:Int,b:Int): Int {
    return a*b;
}