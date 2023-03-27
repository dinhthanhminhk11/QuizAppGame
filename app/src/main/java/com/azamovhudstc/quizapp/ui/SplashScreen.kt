package com.azamovhudstc.quizapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.azamovhudstc.quizapp.local_data.QuizPref

class SplashScreen : AppCompatActivity() {
    private lateinit var quizPref: QuizPref
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        quizPref = QuizPref.getInstance()
        splashAndroid()
    }

    fun splashAndroid() {
        Handler().postDelayed({
            if (quizPref.name.isEmpty()) {
                startActivity(Intent(applicationContext, LoginActivity::class.java))
            } else {
                startActivity(Intent(applicationContext, HomeActivity::class.java))
            }
            finish()
        }, 1000)
    }

}