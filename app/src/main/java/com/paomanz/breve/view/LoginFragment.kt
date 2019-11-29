package com.paomanz.breve.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(
            inflater, R.layout.fragment_login, container, false)

          binding.apply {
              buttonLoginLogin.setOnClickListener {
                  Toast.makeText(context, "Login Button Clicked!", Toast.LENGTH_SHORT).show()
              }

              textViewSignUpLogin.setOnClickListener {
                  it.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
              }
          }

        return binding.root
    } // End onCreateView
}
