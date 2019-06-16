package com.accounting.javierpardo.domitilapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText

class ExpenseActivity : AppCompatActivity() {
    private lateinit var txtAmount: EditText
    private lateinit var txtDescription: EditText
    private lateinit var title: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense)
        txtAmount = findViewById(R.id.txtAmount)
        txtDescription = findViewById(R.id.txtDescription)
        this.setTitle(R.string.titleExpense)
    }

    fun addExpense(view: View){
        registerIncome()
    }

    private fun registerIncome(){
        val amount:String = txtAmount.text.toString()
        val description:String = txtDescription.text.toString()

        if(!TextUtils.isEmpty(amount) && !TextUtils.isEmpty(description)) {
        }
    }
}
