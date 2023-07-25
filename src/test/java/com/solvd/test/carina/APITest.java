package com.solvd.test.carina;

import com.solvd.test.carina.api.basketball.GetGamesMethod;
import com.solvd.test.carina.api.activity.GetActivityMethod;
import com.solvd.test.carina.api.basketball.GetPlayerMethod;
import com.solvd.test.carina.api.basketball.GetPlayoffsAssistsMethod;
import com.solvd.test.carina.api.basketball.GetReboundsMethod;
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
    @Test
    public void testGetBreeds() {
        GetBreedsMethod getBreedsMethods = new GetBreedsMethod();
        getBreedsMethods.callAPIExpectSuccess();
        getBreedsMethods.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getBreedsMethods.validateResponseAgainstSchema("api/breeds_get/rs.schema");
    }


    @TestRailCases(testCasesId = "2")
    @Test(testName = " Games reference " , description = "Reference from Asim.")
    public void testGetGames(){
        GetGamesMethod getGamesMethod = new GetGamesMethod();
        getGamesMethod.callAPIExpectSuccess();
        getGamesMethod.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
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
    public void testGetPlayoffsAssists() {
        GetPlayoffsAssistsMethod getPlayoffsAssistsMethods = new GetPlayoffsAssistsMethod();
        getPlayoffsAssistsMethods.callAPIExpectSuccess();
        getPlayoffsAssistsMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPlayoffsAssistsMethods.validateResponseAgainstSchema("api/playoffs_get/rs.schema");
    }

    @TestRailCases(testCasesId = "5")
    @Test
    public void testGetPlayer() {
        GetPlayerMethod getPlayerMethods = new GetPlayerMethod();
        getPlayerMethods.callAPIExpectSuccess();
        getPlayerMethods.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPlayerMethods.validateResponseAgainstSchema("api/player_get/rs.schema");
    }

    @TestRailCases(testCasesId = "6")
    @Test
    public void testGetTopRebounder() {
        GetReboundsMethod getReboundsMethods = new GetReboundsMethod();
        getReboundsMethods.callAPIExpectSuccess();
        getReboundsMethods.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getReboundsMethods.validateResponseAgainstSchema("api/rebounds_get/rs.schema");
    }

    @TestRailCases(testCasesId = "7")
    @Test
    public void testGetTopAssists() {
        GetTopAssistsMethod getTopAssistsMethods = new GetTopAssistsMethod();
        getTopAssistsMethods.callAPIExpectSuccess();
        getTopAssistsMethods.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getTopAssistsMethods.validateResponseAgainstSchema("api/player_get/rs.schema");
    }


}
