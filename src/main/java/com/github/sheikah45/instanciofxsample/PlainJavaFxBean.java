package com.github.sheikah45.instanciofxsample;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.MapProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SetProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.collections.ObservableSet;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PlainJavaFxBean {
    private final StringProperty stringValue = new SimpleStringProperty();
    private final BooleanProperty booleanValue = new SimpleBooleanProperty();
    private final FloatProperty floatValue = new SimpleFloatProperty();
    private final DoubleProperty doubleValue = new SimpleDoubleProperty();
    private final IntegerProperty integerValue = new SimpleIntegerProperty();
    private final LongProperty longValue = new SimpleLongProperty();
    private final ObjectProperty<LocalDate> dateValue = new SimpleObjectProperty<>();
    private final MapProperty<String, String> mapValue = new SimpleMapProperty<>();
    private final ListProperty<String> listValue = new SimpleListProperty<>();
    private final SetProperty<String> setValue = new SimpleSetProperty<>();
    private final ObservableMap<String, String> mapObservable = FXCollections.observableHashMap();
    private final ObservableList<String> listObservable = FXCollections.observableArrayList();
    private final ObservableSet<String> setObservable = FXCollections.observableSet();

    public String getStringValue() {
        return stringValue.get();
    }

    public StringProperty stringValueProperty() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue.set(stringValue);
    }

    public boolean isBooleanValue() {
        return booleanValue.get();
    }

    public BooleanProperty booleanValueProperty() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue.set(booleanValue);
    }

    public float getFloatValue() {
        return floatValue.get();
    }

    public FloatProperty floatValueProperty() {
        return floatValue;
    }

    public void setFloatValue(float floatValue) {
        this.floatValue.set(floatValue);
    }

    public double getDoubleValue() {
        return doubleValue.get();
    }

    public DoubleProperty doubleValueProperty() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue.set(doubleValue);
    }

    public int getIntegerValue() {
        return integerValue.get();
    }

    public IntegerProperty integerValueProperty() {
        return integerValue;
    }

    public void setIntegerValue(int integerValue) {
        this.integerValue.set(integerValue);
    }

    public long getLongValue() {
        return longValue.get();
    }

    public LongProperty longValueProperty() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue.set(longValue);
    }

    public LocalDate getDateValue() {
        return dateValue.get();
    }

    public ObjectProperty<LocalDate> dateValueProperty() {
        return dateValue;
    }

    public void setDateValue(LocalDate dateValue) {
        this.dateValue.set(dateValue);
    }

    public ObservableMap<String, String> getMapValue() {
        return mapValue.get();
    }

    public MapProperty<String, String> mapValueProperty() {
        return mapValue;
    }

    public void setMapValue(Map<String, String> mapValue) {
        this.mapValue.set(FXCollections.observableMap(mapValue));
    }

    public ObservableList<String> getListValue() {
        return listValue.get();
    }

    public ListProperty<String> listValueProperty() {
        return listValue;
    }

    public void setListValue(List<String> listValue) {
        this.listValue.set(FXCollections.observableList(listValue));
    }

    public ObservableSet<String> getSetValue() {
        return setValue.get();
    }

    public SetProperty<String> setValueProperty() {
        return setValue;
    }

    public void setSetValue(Set<String> setValue) {
        this.setValue.set(FXCollections.observableSet(setValue));
    }

    public ObservableMap<String, String> getMapObservable() {
        return mapObservable;
    }

    public ObservableList<String> getListObservable() {
        return listObservable;
    }

    public ObservableSet<String> getSetObservable() {
        return setObservable;
    }
}
