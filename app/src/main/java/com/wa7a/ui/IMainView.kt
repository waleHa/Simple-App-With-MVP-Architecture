package com.wa7a.ui

import com.wa7a.model.data.User
import com.wa7a.model.data.Wisdom

interface IMainView {
    fun onUserInfoSuccess(user:User)
    fun onWisdomCallSuccess(wisdom:Wisdom)
}