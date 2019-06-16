package com.accounting.javierpardo.domitilapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerIncome(view: View){
        Toast.makeText(this, "Registrar Ingreso", Toast.LENGTH_LONG).show()
        startActivity(Intent(this, IncomeActivity::class.java))
    }

    fun registerExpense(view: View){
        Toast.makeText(this, "Registrar Gasto", Toast.LENGTH_LONG).show()
        startActivity(Intent(this, ExpenseActivity::class.java))
    }

    fun generateReport(view: View){
        Toast.makeText(this, "Generar Reporte", Toast.LENGTH_LONG).show()
        startActivity(Intent(this, ReportActivity::class.java))
    }

    fun exit(view: View){
        System.exit(0)
    }

}
