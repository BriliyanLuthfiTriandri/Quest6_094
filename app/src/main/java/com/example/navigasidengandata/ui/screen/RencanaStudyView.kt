package com.example.navigasidengandata.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigasidengandata.model.Mahasiswa
import com.example.navigasidengandata.model.RencanaStudy

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () ->Unit
){
    var chosenDropdonw by remember {
        mutableStateOf(
            " "
        )
    }
    var checked by remember { mutableStateOf(false)}
    var pilihanKelas by remember {
        mutableStateOf(" ")
    }
    var listData: MutableList<String> = mutableListOf(chosenDropdonw, pilihanKelas)
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), verticalAlignment = Alignment.CenterVertically
    ){
        Row(
            modifier = Modifier
        )
    }
}

