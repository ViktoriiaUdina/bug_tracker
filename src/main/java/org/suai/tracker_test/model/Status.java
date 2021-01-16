package org.suai.tracker_test.model;

public enum Status {
    OPEN,
    IN_PROGRESS,
    CLOSE,
    DELETED;

    @Override
    public String toString() {
        return super.toString().replaceAll("_", " ");
    }
}
