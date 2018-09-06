package com.deonico.footballclub2gdk.main

import com.deonico.footballclub2gdk.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}