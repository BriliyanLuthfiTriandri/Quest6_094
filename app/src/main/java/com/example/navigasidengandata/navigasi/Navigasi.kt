package com.example.navigasidengandata.navigasi

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasidengandata.model.Mahasiswa
import com.example.navigasidengandata.ui.screen.MahasiswaFormView
import com.example.navigasidengandata.ui.screen.RencanaStudyView
import com.example.navigasidengandata.ui.screen.SplashView
import com.example.navigasidengandata.ui.screen.TampilanDataView
import com.example.navigasidengandata.ui.viewmodel.MahasiswaViewModel
import com.example.navigasidengandata.ui.viewmodel.RencanaStudyViewModel

enum class Halaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}


