package com.raniara.miuli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.raniara.miuli.appFragment.HomeFragment

class RegisterActivity : AppCompatActivity() {
    lateinit var btnToRegisterActivity: Button
    lateinit var etUserProfile: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        val homeFragment = HomeFragment()
        btnToRegisterActivity = findViewById(R.id.btn_submit)
        etUserProfile = findViewById(R.id.et_namaUser)

        btnToRegisterActivity.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("message", etUserProfile.text.toString())
            homeFragment.arguments = bundle
            fragmentTransaction.add(R.id.linearLayoutCompat, homeFragment).commit()
        }
    }
}