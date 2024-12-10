package com.oscargil80.firstleohilt

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
   lateinit var miInterface:MiInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var clase1= Clase1()
        //var clase2 = Clase2(clase1)
        miInterface.mostrartexto()
    }
}

/*class Clase1
@Inject
   constructor()
 {
        fun enviartexto(): String{
            return  "Texto Enviado"
        }
}*/

 class MiInterfaceImpl
 @Inject
constructor():MiInterface
 {
     override fun mostrartexto() {
         Log.d("MainActivity", "Texto con interface ")
     }
 }


/* class Clase2
 @Inject
constructor(
 //val clase1: Clase1
@ApplicationContext  val context: Context
)
 {
    fun mostrarTexto(){
        Log.d("MainActivity", "Concatenando ${context.getString(R.string.prueba)} ")
    }
}*/

interface MiInterface{
    fun mostrartexto()

}
