package com.oscargil80.firstleohilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.oscargil80.firstleohilt.databinding.ActivitySecondBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
 /*   @Inject
    lateinit var clase2: Clase2
*/
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Log.d("SecondActivity", "clase2: $clase2")

        binding.btnFinish.setOnClickListener {
            finish()
        }
    }
}