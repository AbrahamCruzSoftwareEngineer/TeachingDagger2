package com.example.teaching_dagger2_very_simple.DaggerModule;

import com.example.teaching_dagger2_very_simple.GameData;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Albrtx on 28/11/2017.
 * Component and the Module
 *  will define how the dependency injection will work
 */

    /*
    Module specifies all the providers of the injection, in our case,
    we will define a Provider that provides a new GameData().
    */
@Module
public class GameModule {

    //Provides annotation that tells Dagger that this function
    // is the one that will provide the GameData.
    @Provides
    GameData providesGameData() {
        return new GameData();
    }

}
