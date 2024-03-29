package com.example.peak.presentation

/**
 * @author yaya (@yahyalmh)
 * @since 20th September 2022
 */

sealed class UiState {
    object Loading : UiState()
    object Loaded : UiState()
    data class Error(val message: String) : UiState()
}