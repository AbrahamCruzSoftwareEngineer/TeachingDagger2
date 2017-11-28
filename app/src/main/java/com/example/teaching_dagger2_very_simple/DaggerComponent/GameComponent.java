package com.example.teaching_dagger2_very_simple.DaggerComponent;

import com.example.teaching_dagger2_very_simple.DaggerModule.GameModule;
import com.example.teaching_dagger2_very_simple.GameSession;

import dagger.Component;

/**
 * Created by Albrtx on 28/11/2017.
 */

/*
Component is an interface that Dagger will use to generate
the code that will do the dependency injection for you.
*/
@Component(modules = GameModule.class)
public interface GameComponent {
    //this inject function later with our GameSession, which will inject the
    // GameData we get from the GameModule.providesGameData() function.
    void inject(GameSession obj);

    /*Now is when all the magic happens. Dagger will understand that GameSession
    needs a GameData, that the GameModule defines how are we providing this
    GameData and how we want the injection functions to look like
    in the GameComponent.*/
}
