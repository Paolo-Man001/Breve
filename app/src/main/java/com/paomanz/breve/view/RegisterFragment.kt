package com.paomanz.breve.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /* // Inflate the layout for this fragment
         return inflater.inflate(R.layout.fragment_register, container, false)*/
        val binding = DataBindingUtil.inflate<FragmentRegisterBinding>(
            inflater,R.layout.fragment_register,container,false
        )

        binding.buttonSubmitRegister.setOnClickListener {
            Toast.makeText(context,"Submit button clicked!",Toast.LENGTH_SHORT).show()
        }

        return binding.root
    } // End onCreateView

}
