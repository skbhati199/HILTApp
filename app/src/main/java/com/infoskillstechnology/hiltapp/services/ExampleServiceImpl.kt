package com.infoskillstechnology.hiltapp.services

import com.infoskillstechnology.hiltapp.AuthInterceptorOkHttpClient
import okhttp3.OkHttpClient
import javax.inject.Inject

// As a dependency of a constructor-injected class.
class ExampleServiceImpl @Inject constructor(
    @AuthInterceptorOkHttpClient private val okHttpClient: OkHttpClient
) : ExService {


    override fun show() {

    }

}