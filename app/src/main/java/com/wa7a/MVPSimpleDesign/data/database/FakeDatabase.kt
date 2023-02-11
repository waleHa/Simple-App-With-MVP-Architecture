package com.wa7a.MVPSimpleDesign.data.database

import com.wa7a.MVPSimpleDesign.data.model.User

class FakeDatabase {
    fun getCurrentUser(): User {
        return User("Ahmed Ali",1992)
    }
}