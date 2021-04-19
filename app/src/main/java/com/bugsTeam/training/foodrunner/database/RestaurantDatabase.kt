package com.bugsTeam.training.foodrunner.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [CartEntity::class,RestaurantEntity::class],version = 1)
internal abstract class RestaurantDatabase : RoomDatabase(){
    abstract fun cartDao():CartDao
    abstract fun restaurantDao():RestaurantDao
}