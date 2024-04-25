package com.example.learn_jetpackcompose_di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.learn_jetpackcompose_di.ui.theme.LearnJetpackComposeDITheme
import com.example.learn_jetpackcompose_di.viewmodel.GithubViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.lifecycle.viewmodel.compose.viewModel


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetpackComposeDITheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ReposScreen()
                }
            }
        }
    }
}
@Composable
fun ReposScreen(viewModel: GithubViewModel = viewModel()){
    LazyColumn {
        item {
            Button(onClick = {
                viewModel.getRepos()
            }) {
                Text("레포지토리 가져오기")
            }
        }
        items(viewModel.repos){
            Text(it.name)
        }
    }
}