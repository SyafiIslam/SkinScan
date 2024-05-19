package com.syafi.skinscan.domain.repository

import kotlinx.coroutines.flow.Flow

interface IUserRepository {

    suspend fun setUserSession(token: String, isCompleted: Boolean)
}