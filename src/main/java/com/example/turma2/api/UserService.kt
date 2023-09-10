package com.example.turma2.api

import com.example.turma2.model.UserModel

class UserService {
    @GET("users")
    fun list(): Call<List<UserModel>>
}