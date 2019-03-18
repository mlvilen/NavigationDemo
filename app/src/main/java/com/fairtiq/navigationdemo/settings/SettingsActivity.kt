package com.fairtiq.navigationdemo.settings

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fairtiq.navigationdemo.R
import kotlinx.android.synthetic.main.activity_settings.*


class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.fairtiq.navigationdemo.R.layout.activity_settings)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        toolbar.setTitle(R.string.title_activity_settings)
    }
}
