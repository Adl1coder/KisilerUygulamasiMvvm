package com.example.kisileruygulamasimvvm.data.entity

import com.google.gson.annotations.SerializedName

data class KisilerCevap(@SerializedName("kisiler") var kisiler:List<Kisiler>,
                        @SerializedName("success") var succes:Int) {
}