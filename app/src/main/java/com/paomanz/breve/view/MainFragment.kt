package com.paomanz.breve.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.paomanz.breve.R
import com.paomanz.breve.databinding.FragmentMainBinding

/**
 * This fragment  will be hosted under MainActivity within the
 * <fragment> tags
 */
class MainFragment : Fragment() {

   override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?
   ): View? {
      /* // Inflate the layout for this fragment
      return inflater.inflate(R.layout.fragment_main, container, false)*/
      val binding = DataBindingUtil.inflate<FragmentMainBinding>(
         inflater, R.layout.fragment_main, container, false
      )

      /*SAFE-ARGS:
      * dummyEmail is the String data we send to LoginFragment for it to use as default in its EditText(email)
      */
      val dummyEmail = "johndoe@email.com"

      //  Data-binding can encapsulate all the view-objects(buttons) attached(bound) to this class:
      binding.apply {
         buttonLoginMain.setOnClickListener { view: View ->
            // !!! Make sure to reference the '<action> id' to navigate to the right fragment
            view.findNavController()
//                    .navigate(R.id.action_mainFragment_to_loginFragment)  // Without SafeArgs to pass data
               .navigate(MainFragmentDirections.actionMainFragmentToLoginFragment(dummyEmail)) // When using SafeArgs to pass data
         }
         buttonRegisterMain.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_registerFragment)
         }
         buttonAboutMain.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_aboutFragment)
         }
      }


      //------------------------------------------------//
      return binding.root // Fragments MUST return this.
   } // End onCreateView

}
