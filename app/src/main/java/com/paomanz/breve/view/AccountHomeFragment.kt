package com.paomanz.breve.view


import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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


      /** Options Menu */
      setHasOptionsMenu(true)

      return binding.root
   }


   override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
      super.onCreateOptionsMenu(menu, inflater)
      inflater.inflate(R.menu.account_options_menu, menu)
   }

   override fun onOptionsItemSelected(item: MenuItem): Boolean {
      return NavigationUI.onNavDestinationSelected(
         item,
         view!!.findNavController()
      ) || super.onOptionsItemSelected(item)
   }
}
