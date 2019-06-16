package com.accounting.javierpardo.domitilapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ReportActivity : AppCompatActivity() {
    private lateinit var title: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)
        this.setTitle(R.string.titleReport)
    }
}
