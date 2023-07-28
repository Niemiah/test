package com.solvd.test.carina.api;

import com.solvd.test.carina.api.activity.GetActivityMethod;
import com.solvd.test.carina.api.basketball.GetPlayerMethod;
import com.solvd.test.carina.api.basketball.GetPlayoffsAssistsMethod;
import com.solvd.test.carina.api.basketball.GetReboundsMethod;
import com.solvd.test.carina.api.pokemon.GetPokemonMethod;
import com.solvd.test.carina.api.basketball.GetTopAssistsMethod;
import com.solvd.test.carina.api.cats.GetBreedsMethod;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.report.testrail.TestRailCases;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

@MethodOwner(owner = "Niemiah")
public class APITest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());




    @TestRailCases(testCasesId = "1")
    @Test(testName = "Cat Breeds" , description = "Random Breed of Cats.")
    public void testGetBreeds() {
        GetBreedsMethod getBreedsMethods = new GetBreedsMethod();
        getBreedsMethods.callAPIExpectSuccess();
        getBreedsMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getBreedsMethods.validateResponseAgainstSchema("api/breeds_get/rs.schema");
    }



    @TestRailCases(testCasesId = "2")
    @Test(testName = "Get Activity" , description = "Get a random activity.")
    public void testGetActivity() {
        GetActivityMethod getActivityMethods = new GetActivityMethod();
        getActivityMethods.callAPIExpectSuccess();
        getActivityMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getActivityMethods.validateResponseAgainstSchema("api/activity_get/rs.schema");
    }

    @TestRailCases(testCasesId = "3")
    @Test(testName = "Playoffs Assists" , description = "Top 20 players by assists in playoffs.")
    public void testGetPlayoffsAssists() {
        GetPlayoffsAssistsMethod getPlayoffsAssistsMethods = new GetPlayoffsAssistsMethod();
        getPlayoffsAssistsMethods.callAPIExpectSuccess();
        getPlayoffsAssistsMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPlayoffsAssistsMethods.validateResponseAgainstSchema("api/playoffs_get/rs.schema");
    }

    @TestRailCases(testCasesId = "4")
    @Test(testName = "Player Stats" , description = "Stats of a specific player.")
    public void testGetPlayer() {
        GetPlayerMethod getPlayerMethods = new GetPlayerMethod();
        getPlayerMethods.callAPIExpectSuccess();
        getPlayerMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPlayerMethods.validateResponseAgainstSchema("api/player_get/rs.schema");
    }

    @TestRailCases(testCasesId = "5")
    @Test(testName = "Top Rebounders" , description = "Top 20 rebounders.")
    public void testGetTopRebounder() {
        GetReboundsMethod getReboundsMethods = new GetReboundsMethod();
        getReboundsMethods.callAPIExpectSuccess();
        getReboundsMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getReboundsMethods.validateResponseAgainstSchema("api/rebounds_get/rs.schema");
    }

    @TestRailCases(testCasesId = "6")
    @Test(testName = "Top Assists" , description = "Top 20 players by assists.")
    public void testGetTopAssists() {
        GetTopAssistsMethod getTopAssistsMethods = new GetTopAssistsMethod();
        getTopAssistsMethods.callAPIExpectSuccess();
        getTopAssistsMethods.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getTopAssistsMethods.validateResponseAgainstSchema("api/player_get/rs.schema");
    }

    @TestRailCases(testCasesId = "7")
    @Test(testName = "Pokemon" , description = "Pokemon data by version.")
    public void testGetPokemon() {
        GetPokemonMethod getPokemonMethods = new GetPokemonMethod();
        getPokemonMethods.callAPIExpectSuccess();
        getPokemonMethods.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPokemonMethods.validateResponseAgainstSchema("api/player_get/rs.schema");
    }


}
