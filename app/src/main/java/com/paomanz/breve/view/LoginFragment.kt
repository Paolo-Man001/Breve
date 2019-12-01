package com.paomanz.breve.view


import android.content.Intent
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
            inflater, R.layout.fragment_login, container, false
        )

        /** SAFE-ARGS:
        * Extract the SafeArg value(dummyEmail) from MainFragment's Direction class's argument
        */
        val args = LoginFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context,"Email from MainFragment: ${args.email}",Toast.LENGTH_SHORT).show()

        binding.apply {
            buttonLoginLogin.setOnClickListener {
                Toast.makeText(context, "Login Button Clicked!", Toast.LENGTH_SHORT).show()

                /** Start AccountActivity
                 * */
                val intent = Intent(context,AccountActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP and Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                activity!!.finish()     // Destroys the MainActivity task
            }

            textViewSignUpLogin.setOnClickListener {
                it.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
            }
        }

        return binding.root
    } // End onCreateView
}
