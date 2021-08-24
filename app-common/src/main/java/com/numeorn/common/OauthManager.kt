package com.numeorn.common

import cn.numeron.okhttp.OAuthProvider

object OauthManager : OAuthProvider {

    private val _headers = mutableMapOf<String, String>()

    override val headers: Map<String, String>
        get() = _headers

    override fun refreshToken(): String? {
        return null
    }

}