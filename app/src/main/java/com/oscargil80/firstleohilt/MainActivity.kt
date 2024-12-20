package com.oscargil80.firstleohilt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.oscargil80.firstleohilt.databinding.ActivityMainBinding
import retrofit2.Retrofit


//@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var  binding : ActivityMainBinding
    val viewmodel: mainViewModel by viewModels()

    //@Inject
   lateinit var miInterface:MiInterface

   //@Inject
   lateinit var retrofit: Retrofit

   //@Inject
   //@Named("Frase2")
   lateinit var frase : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

      // Log.d("MainActivity", "Texto $frase ")
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



