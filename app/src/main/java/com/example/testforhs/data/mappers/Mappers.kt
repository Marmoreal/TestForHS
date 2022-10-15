package com.example.testforhs.data.mappers

import com.example.testforhs.data.model.MakeupApi
import com.example.testforhs.domain.model.Makeup

fun MakeupApi.toMakeup(): Makeup{
    return Makeup(
        this.id,
        this.name,
        this.price,
        this.image_link,
        this.description,
        this.category
    )
}