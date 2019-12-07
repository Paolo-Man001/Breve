package com.paomanz.breve.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.paomanz.breve.R
import com.paomanz.breve.databinding.ActivityAccountBinding
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

   /** Data-binding
    *  and
    *  NavController
    * */
   private lateinit var binding: ActivityAccountBinding
   private lateinit var accountNavControler: NavController
   private lateinit var drawerLayout: DrawerLayout

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = DataBindingUtil.setContentView(this, R.layout.activity_account)


      drawerLayout = binding.drawerLayout
      //Set 'Up Arrow' in Appbar
      accountNavControler = Navigation.findNavController(this, R.id.accountNavHostFragment)
      NavigationUI.setupActionBarWithNavController(this, accountNavControler, drawerLayout)

      // Display Navigation Drawer
      NavigationUI.setupWithNavController(binding.navigationView, accountNavControler)
   }

   // Up-Arrow in Appbar
   override fun onSupportNavigateUp(): Boolean {
      return NavigationUI.navigateUp(accountNavControler, drawerLayout)
   }
}
