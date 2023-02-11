package com.wa7a.model.repository

import com.wa7a.model.FakeDatabase

class UserRepository {
    private val database = FakeDatabase()

    fun getCurrentUser() = database.getCurrentUser()
}