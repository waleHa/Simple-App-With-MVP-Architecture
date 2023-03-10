package com.wa7a.MVPSimpleDesign.data.repository

import com.wa7a.MVPSimpleDesign.data.database.FakeDatabase

class UserRepository {
    private val database = FakeDatabase()

    fun getCurrentUser() = database.getCurrentUser()
}