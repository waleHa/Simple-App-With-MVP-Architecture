package com.wa7a.feb10

import android.view.LayoutInflater
import android.widget.Toast
import com.wa7a.feb10.databinding.ActivityMainBinding
import com.wa7a.model.data.User
import com.wa7a.model.data.Wisdom
import com.wa7a.ui.BaseActivity
import com.wa7a.ui.MainPresenter

class MainActivity() : BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String = "MainActivity"
    override val bindingInflator: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    private val presenter = MainPresenter(this)
    override fun setup() {
        presenter.getUserInfo()
        presenter.getWisdom()
    }

    override fun onUserInfoSuccess(user: User) {
        binding?.textUserName?.text = user.name
    }

    override fun onWisdomCallSuccess(wisdom: Wisdom) {
        binding?.textContent?.text = "${wisdom.quote}"
        binding?.textAuthor?.text = "By ${wisdom.author}"

    }

    override fun callback() {
            binding?.buttonFetchData?.setOnClickListener{
                Toast.makeText(this,"Clicked!",Toast.LENGTH_SHORT).show()
                presenter.getWisdom()
            }
        }


}