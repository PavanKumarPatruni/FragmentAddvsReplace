package com.pavankumarpatruni.fragmentaddvsreplace.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pavankumarpatruni.fragmentaddvsreplace.R
import kotlinx.android.synthetic.main.fragment.view.*

class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment, container, false)

        view.textView.text = "2"

        return view
    }


}
