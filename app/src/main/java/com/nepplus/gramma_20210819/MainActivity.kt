package com.nepplus.gramma_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //코틀린 문법 연습용 프로젝트 (UI작업 X)

//        본인의 이름을 저장한 String  변수 myName으로 만들자.

        val myName : String

//        myName에 실제 이름 대입
        myName = "김현지"

        //myName = 코딩티처지니 불가 , val는 저장된 값 변경 불가

//        로그로 저장된 내 이름 출력
        Log.d("변수확인", myName)


//        본인의 출생 년도를 변수로 저장. (myBirtYear)

        var myBirthYear : Int

        myBirthYear = 1995
        Log.d("출생년도", myBirthYear.toString())



    }
}