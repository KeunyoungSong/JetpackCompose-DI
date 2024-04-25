package com.example.learn_jetpackcompose_di.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learn_jetpackcompose_di.service.GithubService
import com.example.learn_jetpackcompose_di.model.Repo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GithubViewModel @Inject constructor (private val githubService: GithubService) : ViewModel() {
    val repos = mutableStateListOf<Repo>()

    fun getRepos(){
        repos.clear()
        viewModelScope.launch {
            val result = githubService.listRepos("KeunyoungSong")
            repos.addAll(result)
        }
    }
}