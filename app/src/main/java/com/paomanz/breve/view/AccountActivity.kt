package com.paomanz.breve.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.paomanz.breve.R
import com.paomanz.breve.databinding.ActivityAccountBinding
import kotlinx.android.synthetic.main.navigation_header.*

class AccountActivity : AppCompatActivity() {

   /** Data-binding
    *  and
    *  NavController
    * */
   private lateinit var binding: ActivityAccountBinding
   private lateinit var accountNavController: NavController
   private lateinit var drawerLayout: DrawerLayout
   private lateinit var toolbar: Toolbar

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = DataBindingUtil.setContentView(this, R.layout.activity_account)


      // Toolbar Custom
      toolbar = binding.accountToolbar
      setSupportActionBar(toolbar)
      toolbar.title = ""

      drawerLayout = binding.drawerLayout

      //Set 'Nav Up Arrow' in Appbar
      accountNavController = Navigation.findNavController(this, R.id.accountNavHostFragment)
      NavigationUI.setupActionBarWithNavController(this, accountNavController, drawerLayout)

      // Display Navigation Drawer
      NavigationUI.setupWithNavController(binding.navigationView, accountNavController)

   }


   // Up-Arrow in Appbar
   override fun onSupportNavigateUp(): Boolean {
      return NavigationUI.navigateUp(accountNavController, drawerLayout)
   }

}
