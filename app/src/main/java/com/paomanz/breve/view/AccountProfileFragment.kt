package com.paomanz.breve.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentAccountProfileBinding

/**
 * A simple [Fragment] subclass.
 */
class AccountProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAccountProfileBinding>(
            inflater,R.layout.fragment_account_profile,container,false
        )

        return binding.root
    }
}
