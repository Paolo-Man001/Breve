package com.paomanz.breve.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)*/
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(
            inflater,R.layout.fragment_about,container,false
        )

        return binding.root
    }


}
