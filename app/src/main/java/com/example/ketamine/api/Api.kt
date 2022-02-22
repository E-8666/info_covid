package com.example.ketamine.api

import com.example.ketamine.model.IndonesiaResponse
import com.example.ketamine.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>
    @GET ("indonesia/provinsi")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}