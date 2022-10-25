package com.example.permissioncontact.models

import android.graphics.Bitmap

class Contact {

    var name:String = ""
    var number:String = ""
    var image:Bitmap? = null

    constructor(name: String, number: String, image: Bitmap?) {
        this.name = name
        this.number = number
        this.image = image
    }

    constructor(name: String, number: String) {
        this.name = name
        this.number = number
    }

    override fun toString(): String {
        return "Contact(name='$name', number='$number', image=$image)"
    }
}