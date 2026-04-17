package com.examen.ultimatejereztiming.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.examen.ultimatejereztiming.data.model.GuideTopic
import com.examen.ultimatejereztiming.data.repository.GuideRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class HomeUiState(
    val topics: List<GuideTopic> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: GuideRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadTopics()
    }

    private fun loadTopics() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            repository.getTopics().collect { result ->
                result.fold(
                    onSuccess = { topics ->
                        _uiState.value = _uiState.value.copy(topics = topics, isLoading = false)
                    },
                    onFailure = { error ->
                        _uiState.value = _uiState.value.copy(error = error.message, isLoading = false)
                    }
                )
            }
        }
    }
}
