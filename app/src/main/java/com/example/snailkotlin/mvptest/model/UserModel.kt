package com.example.snailkotlin.mvptest.model

import com.example.snailkotlin.mvptest.presenter.OnUserListener

/**
 * Created by 张志强 on 2017/9/25.
 */
interface UserModel {
    fun loadUserBean(id: Int, listener: OnUserListener)
}