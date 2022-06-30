package com.example.weatherforecast.weatherlist

import android.os.SystemClock.sleep
import androidx.lifecycle.ComputableLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherforecast.viewmodel.AppState

class WeatherListViewModel(val liveData: MutableLiveData<AppState> = MutableLiveData<AppState>()): ViewModel() {

    fun sentRequest(){
        liveData.value = AppState.Loading
        Thread{
            sleep(2000L)
            liveData.postValue(AppState.Success(Any()))
        }.start()



    }
}