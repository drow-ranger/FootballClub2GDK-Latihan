package com.deonico.footballclub2gdk.api

import java.net.URL

class ApiRespository {

    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}