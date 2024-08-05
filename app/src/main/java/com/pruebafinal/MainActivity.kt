package com.pruebafinal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        when {
            BuildConfig.IS_QA_ENVIRONMENT -> {
                // Cambiar el color de la pantalla para el entorno QA
                window.decorView.setBackgroundColor(ContextCompat.getColor(this, R.color.qa_color))
            }
            BuildConfig.IS_DEBBUG_ENVIRONMENT -> {
                // Cambiar el color de la pantalla para el entorno Prod
                window.decorView.setBackgroundColor(ContextCompat.getColor(this, R.color.default_color))
            }
            else -> {
                // Color predeterminado para el entorno Dev
                window.decorView.setBackgroundColor(ContextCompat.getColor(this, R.color.prod_color))
            }
        }
    }
}