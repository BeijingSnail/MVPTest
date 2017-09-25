package com.example.snailkotlin.mvptest.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.example.snailkotlin.mvptest.R
import com.example.snailkotlin.mvptest.model.entity.UserBean
import com.example.snailkotlin.mvptest.presenter.UserPresenter
import com.example.snailkotlin.mvptest.presenter.imp.UserPresenterImp
import com.example.snailkotlin.mvptest.ui.view.UserView
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity(), UserView {
    lateinit var presenter: UserPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        presenter = UserPresenterImp(this)
        bt.setOnClickListener {
            presenter.getUsetInfo(100)
        }
    }

    override fun showLoading() {
        Log.d("zzq", "loading....")
    }

    override fun hideLoading() {
        Log.d("zzq", "loadingComplete")
    }

    override fun setUsetBean(userBean: UserBean) {
        name_tv.text = userBean.name
        age_tv.text = userBean.age.toString()
    }

}
