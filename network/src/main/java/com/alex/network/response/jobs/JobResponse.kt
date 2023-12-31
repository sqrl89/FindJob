package com.alex.network.response.jobs

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JobResponse(
    @SerialName("category")
    val category: JobCategoryResponse? = null,
    @SerialName("salary_max")
    val salaryMax: Double? = null,
    @SerialName("location")
    val location: JobLocationResponse? = null,
    @SerialName("company")
    val company: JobCompanyResponse? = null,
    @SerialName("title")
    val title: String? = null,
    @SerialName("salary_is_predicted")
    val salaryIsPredicted: Int? = null,
    @SerialName("redirect_url")
    val redirectUrl: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("contract_time")
    val contractTime: String? = null,
    @SerialName("adref")
    val adref: String? = null,
    @SerialName("contract_type")
    val contractType: String? = null,
    @SerialName("created")
    val created: String? = null,
    @SerialName("id")
    val id: String? = null,
    @SerialName("salary_min")
    val salaryMin: Double? = null,
    @SerialName("salary")
    val salary: String? = null
)
