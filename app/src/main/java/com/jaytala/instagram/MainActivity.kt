package com.jaytala.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jaytala.instagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottom.setOnNavigationItemSelectedListener(object :BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {

                    R.id.home -> {
                        Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show()
                    }
                    R.id.search -> {
                        Toast.makeText(this@MainActivity, "Search", Toast.LENGTH_SHORT).show()
                    }
                    R.id.like -> {
                        Toast.makeText(this@MainActivity, "Like", Toast.LENGTH_SHORT).show()
                    }
                    R.id.profile -> {
                        Toast.makeText(this@MainActivity, "Profile", Toast.LENGTH_SHORT).show()
                    }
                }
                return false
            }

        })
    }
}