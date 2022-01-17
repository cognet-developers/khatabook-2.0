package com.example.khatabook_20.ui.auth.signup

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.khatabook_20.database.KhataBook
import com.example.khatabook_20.database.repositories.AuthRepository
import com.google.firebase.auth.FirebaseUser

class SignUpViewModel(application: Application): ViewModel() {
    private var authRepository: AuthRepository

    val firebaseUser:LiveData<FirebaseUser?>
        get()= authRepository.getFirebaseUserMutableLiveData()


    init{
        authRepository= AuthRepository(application)
    }

    fun login(email:String,password:String){
        authRepository.login(email, password)
    }
}

