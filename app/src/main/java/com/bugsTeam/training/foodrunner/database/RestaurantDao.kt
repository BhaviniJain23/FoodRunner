package com.bugsTeam.training.foodrunner.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RestaurantDao {
    @Insert
    fun insertRestaurant(restaurantEntity: RestaurantEntity)

    @Delete
    fun deleteRestaurant(restaurantEntity: RestaurantEntity)

    @Query("SELECT * FROM 'Favourite Restaurant'")
    fun getAllRestaurants():List<RestaurantEntity>

    @Query("SELECT * FROM 'Favourite Restaurant' WHERE id=:resId")
    fun getRestaurantById(resId:String):RestaurantEntity
}