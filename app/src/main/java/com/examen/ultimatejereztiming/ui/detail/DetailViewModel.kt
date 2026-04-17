package com.examen.ultimatejereztiming.ui.detail

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.examen.ultimatejereztiming.data.model.GuideTopic
import com.examen.ultimatejereztiming.data.repository.GuideRepository
import com.examen.ultimatejereztiming.ui.navigation.Route
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class DetailUiState(
    val topic: GuideTopic? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

@HiltViewModel
class DetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: GuideRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(DetailUiState())
    val uiState: StateFlow<DetailUiState> = _uiState.asStateFlow()

    init {
        val route = savedStateHandle.toRoute<Route.Detail>()
        loadTopic(route.id)
    }

    private fun loadTopic(id: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            val result = repository.getTopic(id)
            result.fold(
                onSuccess = { topic ->
                    _uiState.value = _uiState.value.copy(
                        topic = topic,
                        isLoading = false
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(error = error.message, isLoading = false)
                }
            )
        }
    }
}
