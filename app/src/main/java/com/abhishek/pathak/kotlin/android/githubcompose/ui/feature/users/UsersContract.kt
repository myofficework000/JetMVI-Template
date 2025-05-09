package com.abhishek.pathak.kotlin.android.githubcompose.ui.feature.users

import com.abhishek.pathak.kotlin.android.githubcompose.data.model.User
import com.abhishek.pathak.kotlin.android.githubcompose.ui.base.ViewEvent
import com.abhishek.pathak.kotlin.android.githubcompose.ui.base.ViewSideEffect
import com.abhishek.pathak.kotlin.android.githubcompose.ui.base.ViewState

class UsersContract {

    sealed class Event : ViewEvent {
        object Retry : Event()
        data class UserSelection(val user: User) : Event()
    }

    data class State(
        val users: List<User>,
        val isLoading: Boolean,
        val isError: Boolean,
    ) : ViewState

    sealed class Effect : ViewSideEffect {
        object DataWasLoaded : Effect()

        sealed class Navigation : Effect() {
            data class ToRepos(val userId: String): Navigation()
        }
    }
}
