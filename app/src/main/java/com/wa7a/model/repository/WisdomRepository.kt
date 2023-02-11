package com.wa7a.model.repository

import com.wa7a.model.FakeApiService
import com.wa7a.model.FakeDatabase

class WisdomRepository {
    private val api = FakeApiService()

    fun getAWisdom() = api.getRandomWisdom()
}