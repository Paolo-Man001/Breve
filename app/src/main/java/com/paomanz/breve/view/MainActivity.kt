package com.paomanz.breve.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.paomanz.breve.R
import com.paomanz.breve.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    // Data-Binding is only possible when the XML of this have <layout> as the outermost tag.
    private lateinit var binding: ActivityMainBinding

    private lateinit var mainNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        /*setContentView(R.layout.activity_main)*/

        //Set 'Up Arrow' in Appbar
        mainNavController = Navigation.findNavController(this, R.id.mainNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, mainNavController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(mainNavController,null)
    }
}
