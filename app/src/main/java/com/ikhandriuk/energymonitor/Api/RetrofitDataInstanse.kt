package com.ikhandriuk.energymonitor.Api

import com.ikhandriuk.energymonitor.Util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitDataInstanse {
    private val retrofitData by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.DATA_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val APIData: EmeterApi by lazy {
        retrofitData.create(EmeterApi::class.java)
    }
}