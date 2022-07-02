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

public class WorldFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = WorldFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String worldUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.world));
        Log.e(LOG_TAG, worldUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), worldUrl);
    }
}
