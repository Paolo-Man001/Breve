package com.paomanz.breve.view


import android.app.ActionBar
import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentAccountHomeBinding
import kotlinx.android.synthetic.main.activity_account.*

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
