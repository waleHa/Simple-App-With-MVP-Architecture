package com.wa7a.model

import com.wa7a.model.data.User

class FakeDatabase {
    fun getCurrentUser(): User {
        return User("Ahmed Ali",1992)
    }
}