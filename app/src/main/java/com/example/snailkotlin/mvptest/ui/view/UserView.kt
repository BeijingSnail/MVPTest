package com.example.snailkotlin.mvptest.ui.view

import com.example.snailkotlin.mvptest.model.entity.UserBean

/**
 * Created by 张志强 on 2017/9/25.
 */
interface UserView {

    fun showLoading()

    fun hideLoading()

    fun setUsetBean(userBean: UserBean)

}