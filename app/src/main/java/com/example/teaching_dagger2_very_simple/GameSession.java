package com.example.teaching_dagger2_very_simple;

import javax.inject.Inject;

/**
 * Created by Albrtx on 28/11/2017.
 * This class needs the GameData, and we will inject the dependency using Dagger,
 * rather than passing it as a parameter or creating it inside.
 */

public class GameSession {
    //Without dependency injection we would have something like this:
    //public GameData data = new GameData();

    //With DI and Dagger would be like this:
    @Inject
    public GameData data;
}
