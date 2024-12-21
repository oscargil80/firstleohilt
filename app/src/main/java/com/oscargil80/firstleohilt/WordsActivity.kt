package com.oscargil80.firstleohilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import com.oscargil80.firstleohilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class WordsActivity : AppCompatActivity() {
    lateinit var  binding : ActivityMainBinding
    val viewmodel: WordsViewModel by viewModels()

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

  binding.btnWords.setOnClickListener { showAddWords() }

    }

    private fun showAddWords() {
        MaterialDialog(this).show {
            input { dialog, text ->
                //viewModel.saveWord(text.toString())
            }
            positiveButton( text = "Submit")
        }
    }

}







/*@Singleton
 class Clase2
 @Inject constructor()  {
    fun mostrarTexto() {
       // Log.Timber.tag("MainActivity").d("Concatenando ")
    }
}*/

 class MiInterfaceImpl
 //@Inject
constructor():MiInterface
 {
     override fun mostrartexto() {
         Log.d("MainActivity", "Texto con interface ")
     }
 }




interface MiInterface{
    fun mostrartexto()
}
/*class Clase1
@Inject
   constructor()
 {
        fun enviartexto(): String{
            return  "Texto Enviado"
        }
}*/



