package com.ikhandriuk.energymonitor.Repository

import com.ikhandriuk.energymonitor.Api.RetrofitInstance
import com.ikhandriuk.energymonitor.Model.Authorization.AuthorizationItem
import com.ikhandriuk.energymonitor.Model.Authorization.LogOutItem
import com.ikhandriuk.energymonitor.Model.Parameters.ParametersItem
import retrofit2.Response

class Repository {
    suspend fun setAuthorization(login: String, pass: String): Response<AuthorizationItem> {
        return RetrofitInstance.API.setAuthorization(login, pass)
    }

    suspend fun logOut(authorizationCode: String): Response<LogOutItem> {
        return RetrofitInstance.API.logOut(authorizationCode)
    }

    fun getDatta(
        code: String,
        notlast: String,
        action: String,
        date: String,
        ids: String,
        time: String
    ): Response<ParametersItem> {
        return RetrofitInstance.APIData.getDatta(code, notlast, action, date, ids, time)
    }
}