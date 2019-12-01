package com.paomanz.breve.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentAccountPostsBinding

/**
 * A simple [Fragment] subclass.
 */
class AccountPostsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAccountPostsBinding>(
            inflater,R.layout.fragment_account_posts,container,false
        )

        return binding.root
    }


}
