package com.example.learn_jetpackcompose_di.service

import com.example.learn_jetpackcompose_di.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("users/{user}/repos")
    suspend fun listRepos(@Path("user") user: String) : List<Repo>
}