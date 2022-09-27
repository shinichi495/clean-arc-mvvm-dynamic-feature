package com.hdbank.domain.demo.entities

sealed class UserDomainEntities {

    /*
    *   data class for user
    * */

    data class UserDomainResponse(
        var users: List<UserDomain> = ArrayList()
    ) : UserDomainEntities()

    data class UserDomain(
        var id: Int?,
        var name: String?,
        var username: String?,
        var email: String,
        var address: Address?,
        var phone: String?,
        var website: String?,
        var company: Company
    ) : UserDomainEntities() {

        data class Company(
            var name: String?,
            var catchPhrase: String?,
            var bs: String?
        ) : UserDomainEntities()

        data class Address(
            var street: String?,
            var suite: String?,
            var city: String?,
            var zipcode: String?,
            var geo: Geo
        ) : UserDomainEntities() {
            data class Geo(
                var lat: String?,
                var lng: String?
            ) : UserDomainEntities()
        }
    }
}