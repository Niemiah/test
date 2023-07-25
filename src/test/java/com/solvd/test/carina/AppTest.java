package com.solvd.test.carina;

import com.solvd.test.carina.api.basketball.GetGamesMethod;
import com.solvd.test.carina.api.activity.GetActivityMethod;
import com.solvd.test.carina.api.basketball.GetPlayersBySeasonMethod;
import com.solvd.test.carina.api.basketball.GetPlayerMethod;
import com.solvd.test.carina.api.basketball.GetTopScorerMethod;
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
public class AppTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());




    @TestRailCases(testCasesId = "1")
    @Test
    public void testGetBreeds() {
        GetBreedsMethod getBreedsMethods = new GetBreedsMethod();
        getBreedsMethods.callAPIExpectSuccess();
        getBreedsMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getBreedsMethods.validateResponseAgainstSchema("api/breeds_get/rs.schema");
    }


    @TestRailCases(testCasesId = "2")
    @Test(testName = " Games reference " , description = "Reference from Asim.")
    public void testGetGames(){
        GetGamesMethod getGamesMethod = new GetGamesMethod();
        getGamesMethod.callAPIExpectSuccess();
        getGamesMethod.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getGamesMethod.validateResponseAgainstSchema("api/games/_get/rs.schema");
    }


    @TestRailCases(testCasesId = "3")
    @Test
    public void testGetActivity() {
        GetActivityMethod getActivityMethods = new GetActivityMethod();
        getActivityMethods.callAPIExpectSuccess();
        getActivityMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getActivityMethods.validateResponseAgainstSchema("api/activity_get/rs.schema");
    }

    @TestRailCases(testCasesId = "4")
    @Test
    public void testGetPlayersBySeason() {
        GetPlayersBySeasonMethod getPlayersBySeasonMethods = new GetPlayersBySeasonMethod();
        getPlayersBySeasonMethods.callAPIExpectSuccess();
        getPlayersBySeasonMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPlayersBySeasonMethods.validateResponseAgainstSchema("api/playersBySeason_get/rs.schema");
    }

    @TestRailCases(testCasesId = "5")
    @Test
    public void testGetPlayer() {
        GetPlayerMethod getPlayerMethods = new GetPlayerMethod();
        getPlayerMethods.callAPIExpectSuccess();
        getPlayerMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPlayerMethods.validateResponseAgainstSchema("api/player_get/rs.schema");
    }

    @TestRailCases(testCasesId = "6")
    @Test
    public void testGetTopScorer() {
        GetTopScorerMethod getTopScorerMethods = new GetTopScorerMethod();
        getTopScorerMethods.callAPIExpectSuccess();
        getTopScorerMethods.validateResponse(JSONCompareMode.NON_EXTENSIBLE, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getTopScorerMethods.validateResponseAgainstSchema("api/player_get/rs.schema");
    }


}
