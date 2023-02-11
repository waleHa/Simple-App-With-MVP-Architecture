package com.wa7a.ui

import com.wa7a.model.FakeApiService
import com.wa7a.model.FakeDatabase

class MainPresenter(private val viewInterface: IMainView) {
    private val api = FakeApiService()
    private val database = FakeDatabase()

    fun getUserInfo() {
        viewInterface.onUserInfoSuccess(database.getCurrentUser())
    }

    fun getWisdom() {
        viewInterface.onWisdomCallSuccess(api.getRandomWisdom())
    }


}