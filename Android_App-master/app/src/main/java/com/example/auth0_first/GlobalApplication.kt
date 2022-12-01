package com.example.auth0_first

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Native App Key
        KakaoSdk.init(this, "af158323f45f12f20ad27ae0b7ab9d1c")
    }
}