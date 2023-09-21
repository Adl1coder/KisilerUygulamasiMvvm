package com.example.kisileruygulamasimvvm.data.entity

import com.google.gson.annotations.SerializedName

data class CRUDCevap(@SerializedName("success") var success:Int,
                     @SerializedName("message") var message:String) {
}