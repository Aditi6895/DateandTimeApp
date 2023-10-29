package com.aditi.dateandtimeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditi.dateandtimeapp
.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val currentTime = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
        val currentDate = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())

        val dateTimeText = "Time: $currentTime\nDate: $currentDate"
        binding.timeDateTextView.text = dateTimeText
    }
}






