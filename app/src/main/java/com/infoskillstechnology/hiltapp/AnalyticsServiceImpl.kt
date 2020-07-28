package com.infoskillstechnology.hiltapp

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AnalyticsServiceImpl @Inject constructor(
    @ApplicationContext context: Context
) : AnalyticsService {
}