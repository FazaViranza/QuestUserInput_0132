package com.example.p5

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.lang.reflect.Modifier

@Composable
fun FormDataDiri(modifier: Modifier){
    //variabel - variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf(value="") }
    var textAlamat by remember { mutableStateOf(value="") }
    var textJK by remember { mutableStateOf(value="") }
    val gender:List<R.string> = listOf("Laki-laki","Perempuan")

    //variabel - variabel untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember {mutableStateOf(value="")}

}