package com.infoskillstechnology.hiltapp

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.components.ApplicationComponent

class ExampleContentProvider : ContentProvider() {

    @EntryPoint
    @InstallIn(ApplicationComponent::class)
    interface ExampleContentProviderEntryPoint {
        fun analyticsService(): AnalyticsService
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {

    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        val appContext = context?.applicationContext ?: throw IllegalStateException()
        val hiltEntryPoint =
            EntryPointAccessors.fromApplication(appContext, ExampleContentProviderEntryPoint::class.java)

        val analyticsService = hiltEntryPoint.analyticsService()

        return analyticsService.url
    }

    override fun onCreate(): Boolean {
        TODO("Not yet implemented")
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {
        TODO("Not yet implemented")
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun getType(uri: Uri): String? {
        TODO("Not yet implemented")
    }
}