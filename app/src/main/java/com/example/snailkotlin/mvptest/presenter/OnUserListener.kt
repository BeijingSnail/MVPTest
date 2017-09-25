package com.example.snailkotlin.mvptest.presenter

import com.example.snailkotlin.mvptest.model.entity.UserBean

/**
 * Created by 张志强 on 2017/9/25.
 */
interface OnUserListener {

    fun onSuccess(userBean: UserBean)

    fun onError()

}