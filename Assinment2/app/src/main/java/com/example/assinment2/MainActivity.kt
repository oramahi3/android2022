package com.example.assinment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1:Button=findViewById(R.id.button)
        val result:TextView = findViewById(R.id.textView)
        val editText:EditText = findViewById(R.id.editTextTextPersonName)
        button1.setOnClickListener()
        {
            var name : String = editText.text.toString()
            result.text = name
        }
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
          val inflater = menuInflater
            inflater.inflate(R.menu.my_first_menu,menu);
            return true;
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {



        when (item.itemId)
        {
            R.id.item1 -> supportFragmentManager.beginTransaction()
                .replace(R.id.First, FirstFragment.newInstance("", "")).commit();

            R.id.item2 -> supportFragmentManager.beginTransaction()
                .replace(R.id.Second, SecondFragment.newInstance("", "")).commit();
        }
        return true
    }
    }