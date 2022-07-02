package com.example.newstime.fragment;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.loader.content.Loader;

import com.example.newstime.NewsLoader;
import com.example.newstime.NewsPreferences;
import com.example.newstime.R;
import com.example.newstime.model.News;

import java.util.List;


public class SportFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = SportFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String sportUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.sport));
        Log.e(LOG_TAG, sportUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), sportUrl);
    }
}