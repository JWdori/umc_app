package com.example.pj9_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    @Singleton
    class WeatherRepository @Inject constructor(
        private val weatherApi: WeatherApi
    ) {

        suspend fun getWeather(
            dataType : String, numOfRows : Int, pageNo : Int,
            baseDate : Int, baseTime : Int, nx : String, ny : String) : Response<Weather> {
            return weatherApi.getWeather(dataType,numOfRows,pageNo,baseDate,baseTime,nx,ny)
        }
    }

    class Constants {

        companion object{
            const val BASE_URL = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/"
            const val TAG = "tst5"
        }
    }
    class WeatherRepository @Inject constructor(
        private val weatherApi: WeatherApi
    ) {

        suspend fun getWeather(
            dataType : String, numOfRows : Int, pageNo : Int,
            baseDate : Int, baseTime : Int, nx : String, ny : String) : Response<Weather> {
            return weatherApi.getWeather(dataType,numOfRows,pageNo,baseDate,baseTime,nx,ny)
        }
    }




    class WeatherViewModel @Inject constructor(
        private val repository: WeatherRepository
    ) : ViewModel() {

        private val _weatherResponse : MutableLiveData<Response<Weather>> = MutableLiveData()
        val weatherResponse get() = _weatherResponse

        fun getWeather(dataType : String, numOfRows : Int, pageNo : Int,
                       baseDate : Int, baseTime : Int, nx : String, ny : String){
            viewModelScope.launch {
                val response = repository.getWeather(dataType, numOfRows, pageNo, baseDate, baseTime, nx, ny)
                _weatherResponse.value = response
            }
        }
    }
    private val dustViewModel by viewModels<DustViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dustViewModel.communicateNetWork(setUpDustParameter())
        observeDustData()
    }

    private fun observeDustData(){
        dustViewModel.dustData.observe(this){
            it?.let {
                Log.e("Parsing Dust ::", it.toString())
            }
        }
    }

    private fun setUpDustParameter(): HashMap<String, String>{

        return hashMapOf(
            "serviceKey" to "DUST_DECODING_SERVICE_KEY", // OPEN API 의 인증키 중 Decoding된 것을 사용
            "returnType" to "json",
            "numOfRows" to "100",
            "pageNo" to "1",
            "sidoName" to "서울",
            "ver" to "1.0"
        )

    }
}