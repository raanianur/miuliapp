package com.raniara.miuli.appFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.raniara.miuli.R

class HomeFragment : Fragment() {

    private lateinit var tvNamaUser : TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        tvNamaUser = view.findViewById<View>(R.id.tv_namaUser) as TextView
        val bundle = arguments
        val message = bundle!!.getString("message")
        tvNamaUser.text = message

        return view
    }
}