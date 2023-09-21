package com.example.kisileruygulamasimvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasimvvm.data.repo.KisilerDaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class KisiKayitViewModel @Inject constructor(var krepo : KisilerDaRepository): ViewModel() {

    fun kayit(kisiAd:String, kisiTel:String){
        krepo.kisiKayit(kisiAd,kisiTel)
    }
}