package com.paomanz.breve.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import com.paomanz.breve.R
import com.paomanz.breve.databinding.ActivityAccountBinding

class AccountActivity : AppCompatActivity() {

    /** Data-binding
     *  and
     *  NavController
     * */
    private lateinit var binding: ActivityAccountBinding
    private lateinit var accountNavControler: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_account)

    }
}
