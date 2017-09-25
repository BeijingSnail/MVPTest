package com.example.snailkotlin.mvptest.presenter.imp

import com.example.snailkotlin.mvptest.model.UserModel
import com.example.snailkotlin.mvptest.model.entity.UserBean
import com.example.snailkotlin.mvptest.model.imp.UserModelImp
import com.example.snailkotlin.mvptest.presenter.OnUserListener
import com.example.snailkotlin.mvptest.presenter.UserPresenter
import com.example.snailkotlin.mvptest.ui.view.UserView

/**
 * Created by 张志强 on 2017/9/25.
 */
class UserPresenterImp(private var userView: UserView) : UserPresenter, OnUserListener {
    private var userModel: UserModel = UserModelImp()

    override fun getUsetInfo(id: Int) {
        userView.showLoading()
        userModel.loadUserBean(id, this)

    }

    override fun onSuccess(userBean: UserBean) {
        userView.hideLoading()
        userView.setUsetBean(userBean)
    }

    override fun onError() {

    }
}