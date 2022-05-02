package com.example.ladm_u3_p1_basedatossqlite_edgar_alberto_valderrama_castillo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ladm_u3_p1_basedatossqlite_edgar_alberto_valderrama_castillo.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val insertarArea = insertarAreaFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(insertarArea)

        bottom_navigation.setOnNavigationItemSelectedListener {  }

    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment !=null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}

