package com.saudi.coronatracker.ui.country;

public class CovidCountry {

    String mCovidCountry, mCases, mDeaths, mTodayDeaths, mRecovered, mCritical;

    public CovidCountry(String mCovidCountry, String mCases)
    {
        this.mCovidCountry = mCovidCountry;
        this.mCases = mCases;

    }

    public String getmCovidCountry() {
        return mCovidCountry;
    }

    public String getmCases() {
        return mCases;
    }
}
