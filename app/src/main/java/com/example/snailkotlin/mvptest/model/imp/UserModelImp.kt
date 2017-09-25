package com.example.snailkotlin.mvptest.model.imp

import android.os.Handler
import com.example.snailkotlin.mvptest.model.UserModel
import com.example.snailkotlin.mvptest.model.entity.UserBean
import com.example.snailkotlin.mvptest.presenter.OnUserListener

/**
 * Created by 张志强 on 2017/9/25.
 */
class UserModelImp : UserModel {

    override fun loadUserBean(id: Int, listener: OnUserListener) {
        //模拟网络请求根据id 获取用户信息
        Handler().postAtTime(Runnable {
            listener.onSuccess(UserBean("张志强", 25))
        }, 3000)
    }
}