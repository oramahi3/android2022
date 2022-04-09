package com.example.assinment2
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import android.os.Bundle
import android.view.Menu
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        /*val inflater = menuInflater
        inflater.inflate(R.menu.my_first_menu, menu);
        return true;*/
        menuInflater.inflate(R.menu.my_first_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
       
        if (item.itemId == R.id.item2) {
            var a: FragmentTransaction = supportFragmentManager.beginTransaction()
            var b =FirstFragment()
            a.replace(R.id.container, b)
            a.commit()
        }
        if (item.itemId == R.id.item3) {
            var a: FragmentTransaction = supportFragmentManager.beginTransaction()
            var b =SecondFragment()
            a.replace(R.id.container, b)
            a.commit()
        }
        return super.onOptionsItemSelected(item)
    }

}

private fun Any.replace(container: Int, b: SecondFragment) {

}

private fun Any.replace(container: Int, b: FirstFragment) {

}
/*when (item.itemId)
{
    R.id.item1 -> supportFragmentManager.beginTransaction()
        .replace(R.id.First,

    R.id.item2 -> supportFragmentManager.beginTransaction()
        .replace(R.id.Second, SecondFragment.newInstance("", "")).commit();
}
return true
}

 */

