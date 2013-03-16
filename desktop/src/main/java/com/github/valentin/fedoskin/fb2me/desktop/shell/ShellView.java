package com.github.valentin.fedoskin.fb2me.desktop.shell;

import javafx.scene.Node;
import javafx.scene.Parent;

public interface ShellView {

    interface Presenter {

        void close();

        void goToReader();

        void goToShelf();

        void showOptions();
    }

    Parent getParent();

    void setContent(Node content);

    void setPresenter(Presenter shellPresenter);
}