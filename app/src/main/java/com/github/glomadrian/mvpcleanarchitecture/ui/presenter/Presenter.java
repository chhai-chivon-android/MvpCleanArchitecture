package com.github.glomadrian.mvpcleanarchitecture.ui.presenter;

import com.github.glomadrian.mvpcleanarchitecture.ui.view.View;

/**
 * Presenter with lifecycle
 *
 * @author glomadrian
 */
public interface Presenter<T1 extends View> {

    void initialize();

    void onViewCreate();

    void onViewResume();

    void onViewDestroy();

    void setView(T1 view);
}