package com.example.turma2.repository

import com.example.turma2.api.UserService
import com.example.turma2.api.config.RetrofitConfig

class UserRepository {
    private val remote = RetrofitConfig.createService(UserService::class.java)

    fun getAllUsers() {
        // return Call<List<UserMode>> que sera feito o enqueue no viewmodel
    }
}