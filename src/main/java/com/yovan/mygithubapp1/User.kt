package com.yovan.mygithubapp1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var username: String,
    var name: String,
    var avatar:Int,
    var company: String,
    var repository: String,
    var followers: String,
    var following: String,
    var location: String,

):Parcelable
