package com.oscargil80.firstleohilt.di

// import com.oscargil80.firstleohilt.MiInterface
// import com.oscargil80.firstleohilt.MiInterfaceImpl
// import dagger.Module
// import dagger.Provides
// import dagger.hilt.InstallIn
// import dagger.hilt.components.SingletonComponent
// import retrofit2.Retrofit
// import javax.inject.Named
// import javax.inject.Singleton
//
// @Module
// @InstallIn(SingletonComponent::class)
// object MainModule {
//
//
// @Singleton
// @Provides
// @Named("Frase1")
// fun provideFrase1() : String{
// return "Nueva Frase"
// }
//
// @Singleton
// @Provides
// @Named("Frase2")
// fun provideFrase2() : String{
// return " Frase 2 "
// }
//
//
//
// @Singleton
// @Provides
// fun provideMiInterface():MiInterface{
// return MiInterfaceImpl()
// }
//
// @Singleton
// @Provides
// fun providesRetrofit(): Retrofit{
// return Retrofit.Builder()
// .baseUrl("http://api.github.com")
// .build()
// }
//
//
// }