package com.paomanz.breve.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentAccountHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class AccountHomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAccountHomeBinding>(
            inflater, R.layout.fragment_account_home, container, false
        )

        binding.apply {
            btnAccProfile.setOnClickListener {
                findNavController().navigate(R.id.action_accountHome_to_accountProfile)
            }

            btnAccPosts.setOnClickListener {
                findNavController().navigate(R.id.action_accountHome_to_accountPosts)
            }

            btnAccCompose.setOnClickListener {
                findNavController().navigate(R.id.action_accountHome_to_accountCompose)
            }
        }

        return binding.root
    }


}
