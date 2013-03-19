package com.github.valentin.fedoskin.fb2me.desktop.options;

import java.util.Locale;

import com.github.valentin.fedoskin.fb2me.desktop.ApplicationContext;

public class OptionsPresenter implements OptionsView.Presenter {

    private final ApplicationContext context;

    public OptionsPresenter(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void changeLanguageOption(Locale value) {
        context.optionsController.setLanguage(value);
    }

    @Override
    public void reloadViews() {
        context.viewController.reload();
    }
}