package com.yovan.mygithubapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.yovan.mygithubapp1.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
    }

    private fun setData() {
        val dataUser = intent.getParcelableExtra<User>(KEY_USER) as User
        binding.apply {
            Glide.with(root)
                .load(dataUser.avatar)
                .circleCrop()
                .into(tvDetailAvatar)
            tvDetailNumberOfRepos.text = dataUser.repository
            tvDetailNumberOfFollowers.text = dataUser.followers
            tvDetailNumberOfFollowing.text = dataUser.location
            tvDetailName.text = dataUser.name
            tvDetailCompany.text = dataUser.company
            tvDetailLocation.text = dataUser.following
        }
    }

    companion object {
        const val KEY_USER = "key_user"
    }
}