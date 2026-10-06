package com.abhishek.pathak.kotlin.android.githubcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.abhishek.pathak.kotlin.android.githubcompose.ui.feature.repos.ReposContract
import com.abhishek.pathak.kotlin.android.githubcompose.ui.feature.repos.ReposViewModel
import com.abhishek.pathak.kotlin.android.githubcompose.ui.feature.repos.composables.ReposScreen
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
fun ReposScreenDestination(userId: String, navController: NavController) {
    val viewModel = koinViewModel<ReposViewModel> { parametersOf(userId) }
    ReposScreen(
        state = viewModel.viewState.value,
        effectFlow = viewModel.effect,
        onEventSent = { event -> viewModel.setEvent(event) },
        onNavigationRequested = { navigationEffect ->
            if (navigationEffect is ReposContract.Effect.Navigation.Back) {
                navController.popBackStack()
            }
        },
    )
}
