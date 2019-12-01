package com.paomanz.breve.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentAccountComposeBinding

/**
 * A simple [Fragment] subclass.
 */
class AccountComposeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAccountComposeBinding>(
            inflater,R.layout.fragment_account_compose,container,false
        )

        return binding.root
    }


}
