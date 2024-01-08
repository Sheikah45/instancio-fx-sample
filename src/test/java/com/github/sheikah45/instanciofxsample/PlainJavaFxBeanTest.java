package com.github.sheikah45.instanciofxsample;

import org.instancio.Instancio;
import org.instancio.junit.InstancioExtension;
import org.instancio.junit.WithSettings;
import org.instancio.settings.AssignmentType;
import org.instancio.settings.Keys;
import org.instancio.settings.OnSetFieldError;
import org.instancio.settings.OnSetMethodNotFound;
import org.instancio.settings.OnSetMethodUnmatched;
import org.instancio.settings.SetterStyle;
import org.instancio.settings.Settings;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(InstancioExtension.class)
class PlainJavaFxBeanTest {

    @WithSettings
    private static final Settings SETTINGS = Settings.create()
                                                     .set(Keys.ASSIGNMENT_TYPE, AssignmentType.METHOD)
                                                     .set(Keys.ON_SET_FIELD_ERROR, OnSetFieldError.IGNORE)
                                                     .set(Keys.SETTER_STYLE, SetterStyle.SET)
                                                     .set(Keys.ON_SET_METHOD_UNMATCHED, OnSetMethodUnmatched.INVOKE)
                                                     .set(Keys.ON_SET_METHOD_NOT_FOUND, OnSetMethodNotFound.IGNORE);

    @Test
    void testGeneration() {
        var plainBean = Instancio.create(PlainJavaFxBean.class);

        assertNotNull(plainBean.getStringValue());
        assertNotNull(plainBean.getDateValue());
        assertTrue(plainBean.getDoubleValue() != 0);
        assertTrue(plainBean.getFloatValue() != 0);
        assertTrue(plainBean.getLongValue() != 0);
        assertTrue(plainBean.getIntegerValue() != 0);
        assertFalse(plainBean.getListValue().isEmpty());
        assertFalse(plainBean.getSetValue().isEmpty());
        assertFalse(plainBean.getMapValue().isEmpty());
        assertNotNull(plainBean.getListObservable());
        assertNotNull(plainBean.getSetObservable());
        assertNotNull(plainBean.getMapObservable());
    }
}