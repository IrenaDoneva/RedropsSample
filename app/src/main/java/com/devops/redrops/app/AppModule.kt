package com.devops.redrops.app

import androidx.preference.PreferenceManager
import com.devops.redrops.app.account.AccountViewModel
import com.devops.redrops.app.addfeed.AddFeedsViewModel
import com.devops.redrops.app.feedsfolders.ManageFeedsFoldersViewModel
import com.devops.redrops.app.item.ItemViewModel
import com.devops.redrops.app.itemslist.MainViewModel
import com.devops.redrops.app.repositories.FreshRSSRepository
import com.devops.redrops.app.repositories.LocalFeedRepository
import com.devops.redrops.app.repositories.NextNewsRepository
import com.devops.redrops.app.utils.GlideApp
import com.icapps.niddler.core.AndroidNiddler
import com.icapps.niddler.core.Niddler
import com.readrops.app.notifications.NotificationPermissionViewModel
import com.readrops.db.entities.account.Account
import com.readrops.db.entities.account.AccountType
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    factory { (account: Account) ->
        when (account.accountType) {
            AccountType.LOCAL -> LocalFeedRepository(get(), get(), androidContext(), account)
            AccountType.NEXTCLOUD_NEWS -> NextNewsRepository(get(), get(), androidContext(), account)
            AccountType.FRESHRSS -> FreshRSSRepository(get(), get(), androidContext(), account)
            else -> throw IllegalArgumentException("Account type not supported")
        }
    }

    viewModel {
        MainViewModel(get())
    }

    viewModel {
        AddFeedsViewModel(get(), get())
    }

    viewModel {
        ItemViewModel(get())
    }

    viewModel {
        ManageFeedsFoldersViewModel(get())
    }

    viewModel {
        NotificationPermissionViewModel(get())
    }

    viewModel {
        AccountViewModel(get())
    }

    single { GlideApp.with(androidApplication()) }

    single { PreferenceManager.getDefaultSharedPreferences(androidContext()) }

    single<Niddler> {
        val niddler = AndroidNiddler.Builder()
                .setNiddlerInformation(AndroidNiddler.fromApplication(get()))
                .setPort(0)
                .setMaxStackTraceSize(10)
                .build()

        niddler.attachToApplication(get())

        niddler.apply { start() }
    }
}