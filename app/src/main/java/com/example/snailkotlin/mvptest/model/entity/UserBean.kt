package com.example.snailkotlin.mvptest.model.entity

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by 张志强 on 2017/9/25.
 */
class UserBean(namee: String, agee: Int) {
    var name: String? = null
    var age: Int? = 0

    init {
        this.name = namee
        this.age = agee
    }

}