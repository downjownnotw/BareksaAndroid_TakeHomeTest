package raderido.me.bareksaandroid_takehometest

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module
import raderido.me.bareksaandroid_takehometest.repo.IMainRepository
import raderido.me.bareksaandroid_takehometest.repo.MainRepository
import raderido.me.bareksaandroid_takehometest.ui.imbal_hasil.ImbalHasilViewModel
import raderido.me.bareksaandroid_takehometest.ui.main.MainViewModel

class ApplicationController: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Koin Android logger
            androidLogger()
            //inject Android context
            androidContext(this@ApplicationController)
            // use modules
            modules(listModules())
        }
    }

    private fun listModules(): List<Module>{
        return listOf(
            module {
                single<IMainRepository> { MainRepository() }
                viewModel { MainViewModel(get()) }
                viewModel { ImbalHasilViewModel(get()) }
            }
        )
    }
}