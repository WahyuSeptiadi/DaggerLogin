package com.codeart.mydaggerlogin.di

import android.content.Context
import com.codeart.mydaggerlogin.SessionManager
import dagger.Module
import dagger.Provides

@Module
class StorageModule {
    @Provides
    fun provideSessionManager(context: Context): SessionManager = SessionManager(context)
}