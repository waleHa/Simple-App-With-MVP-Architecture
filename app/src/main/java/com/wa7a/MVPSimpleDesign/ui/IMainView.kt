package com.wa7a.MVPSimpleDesign.ui

import com.wa7a.MVPSimpleDesign.data.model.User
import com.wa7a.MVPSimpleDesign.data.model.Wisdom

interface IMainView {
    fun onUserInfoSuccess(user: User)
    fun onWisdomCallSuccess(wisdom: Wisdom)
}