package com.wa7a.MVPSimpleDesign.data.repository

import com.wa7a.MVPSimpleDesign.data.api.FakeApiService


class WisdomRepository {
    private val api = FakeApiService()

    fun getAWisdom() = api.getRandomWisdom()
}